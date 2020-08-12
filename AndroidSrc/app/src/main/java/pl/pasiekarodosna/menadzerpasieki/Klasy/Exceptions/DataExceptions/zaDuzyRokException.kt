package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaDuzyRokException : nieprawidlowyRokException{
    constructor():super("Za duza wartosc roku")
    protected  constructor(message : String ): super(message)
}