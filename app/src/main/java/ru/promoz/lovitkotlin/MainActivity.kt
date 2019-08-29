package ru.promoz.lovitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //клик
        loginButton.setOnClickListener {
            val contractNumber = loginContractNumber.text;
            val password = loginPassword.text;

            Retrofit.Builder()
                .u

            val toastMesseng = "Ваш номер контракта: $contractNumber \nВаш пароль: $password "
            Toast.makeText(this, toastMesseng,  Toast.LENGTH_LONG).show()
        }

        /*loginButton.setOnClickListener{
            Toast.makeText(this, "Не то ввел", Toast.LENGTH_LONG).show();
        }*/
    }
}
