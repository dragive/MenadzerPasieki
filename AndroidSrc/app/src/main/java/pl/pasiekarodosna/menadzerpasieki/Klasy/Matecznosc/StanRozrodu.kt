package Klasy.Matecznosc

abstract class StanRozrodu {
    var opis : String = ""
    constructor(){
        this.opis = ""
    }
    constructor(opis : String)
    {
        this.opis = opis
    }
}