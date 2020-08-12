package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaDuzyMiesiacException : nieprawidlowyMiesiacException {
    constructor():super("Za duza wartosc Miesiaca")
    protected  constructor(message : String ): super(message)
}