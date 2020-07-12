package Klasy.Ule

import Klasy.Komponenty.ElementUla
import Klasy.Komponenty.Przedmiot
import Klasy.Matecznosc.StanRozrodu
import java.util.*

class Ul {
    var system : String =""
    var tag : String =""
    var pochodzenie : String =""
    var stanRozrodu :StanRozrodu? = null
    var elementyUla : Vector<ElementUla> = Vector<ElementUla>()

    constructor(system: String, stanRozrodu : StanRozrodu, tag : String, pochodzenie : String,elementyUla : Vector<ElementUla> = Vector()){
        this.system= system
        this.stanRozrodu = stanRozrodu
        this.tag = tag
        this.pochodzenie = pochodzenie
        this.elementyUla = elementyUla
    }


}