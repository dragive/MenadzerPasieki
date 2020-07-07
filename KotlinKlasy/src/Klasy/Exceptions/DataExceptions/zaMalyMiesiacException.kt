package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaMalyMiesiacException : nieprawidlowyMiesiacException {
    constructor():super("Za mala wartosc Miesiaca")
    protected  constructor(message : String ): super(message)
}