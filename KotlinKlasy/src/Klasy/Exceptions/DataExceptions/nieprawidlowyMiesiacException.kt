package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class nieprawidlowyMiesiacException : nieprawidloweDaneException {
    constructor():super("Nieprawidlowa wartosc miesiaca")
    protected  constructor(message : String ): super(message)
}