package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaDuzyDzienException : nieprawidloweDaneException {
    constructor():super("Za duza wartosc dnia")
    protected  constructor(message : String ): super(message)
}