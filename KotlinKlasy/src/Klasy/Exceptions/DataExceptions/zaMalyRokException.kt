package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaMalyRokException : nieprawidlowyRokException{
    constructor():super("Za mala wartosc roku")
    protected  constructor(message : String ): super(message)
}