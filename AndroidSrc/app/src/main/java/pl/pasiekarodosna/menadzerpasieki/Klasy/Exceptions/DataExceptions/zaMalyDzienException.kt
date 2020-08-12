package Klasy.Exceptions.DataExceptions

import Klasy.Exceptions.nieprawidloweDaneException

open class zaMalyDzienException : nieprawidlowyDzienException{
    constructor():super("Za mala wartosc dnia")
    protected  constructor(message : String ): super(message)
}