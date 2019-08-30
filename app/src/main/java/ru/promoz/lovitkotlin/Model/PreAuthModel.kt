package ru.promoz.lovitkotlin.Model

class PreAuthModel {
    class Ac {
        var Id : String = ""
        var BrandId : String = ""
    }

    class Data{
        var Ac : Ac = Ac()
    }
}