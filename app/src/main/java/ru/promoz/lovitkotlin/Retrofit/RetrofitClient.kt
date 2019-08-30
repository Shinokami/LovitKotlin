import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitClient {
    private var ourInstance : Retrofit?=null

    val instance:Retrofit
    get(){
        if (ourInstance == null){
            ourInstance = Retrofit.Builder()
                .baseUrl("https://mobile-api-test.tut.net")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory .create())
                .build()
        }
        return ourInstance!!
    }
}