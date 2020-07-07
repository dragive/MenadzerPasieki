package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class nieprawidlowyRokException : nieprawidloweDaneException {
    constructor():super("Nieprawidlowa wartosc roku")
    protected  constructor(message : String ): super(message)
}