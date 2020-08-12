package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class nieprawidlowyDzienException : nieprawidloweDaneException {
    constructor():super("Nieprawidlowa wartosc dnia")
    protected  constructor(message : String ): super(message)
}