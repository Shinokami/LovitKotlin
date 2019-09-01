package ru.promoz.lovitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import ru.promoz.lovitkotlin.Response.ClientInfoResponse
import ru.promoz.lovitkotlin.Retrofit.Api
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var preApi: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Вставляем кастомный toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        //Инициализация API
        val retrofit = RetrofitClient.instance
        preApi = retrofit.create(Api::class.java)

        //получаем данные из прошлой активити
        val arguments = intent.extras
        val auth = arguments.get("auth").toString()


        preApi.clientInfo(auth)
            .enqueue(object : Callback<ClientInfoResponse> {
                override fun onResponse(
                    call: Call<ClientInfoResponse>,
                    response: Response<ClientInfoResponse>
                ) {
                    if (response.isSuccessful && response.body() != null){
                        fullName.text = response.body()?.data!!.fio
                        adress.text = response.body()?.data!!.address
                        balance.text = response.body()?.data!!.balance.toString()
                        contract.text = response.body()?.data!!.acId
                        tariff.text = response.body()?.data!!.tarif
                    }else{
                        Toast.makeText(
                            applicationContext,
                            response.message(),
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }

                override fun onFailure(
                    call: Call<ClientInfoResponse>,
                    t: Throwable
                ) {
                    Toast.makeText(
                        applicationContext,
                        "Ошибка ответа сервера получения токена",
                        Toast.LENGTH_LONG
                    ).show()
                }
            })

    }
}
