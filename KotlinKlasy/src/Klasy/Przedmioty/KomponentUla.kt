package Klasy.Komponenty

class KomponentUla : Przedmiot{
    var system : String = ""
    constructor(nazwa:String, system : String):super(nazwa){
        this.system = system
    }

    override fun toString(): String {
        return "nazwa: "+super.nazwa+" system: "+this.system
    }


}