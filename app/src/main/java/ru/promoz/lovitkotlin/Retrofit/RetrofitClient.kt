import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var ourInstance : Retrofit?=null

    val instance:Retrofit
    get(){
        if (ourInstance == null){
            ourInstance = Retrofit.Builder()
                .baseUrl("https://mobile-api-test.tut.net")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory .create())
                .build()
        }
        return ourInstance!!
    }
}