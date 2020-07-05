package Klasy.Exceptions

import java.lang.Exception

open class nieprawidloweDaneException : Exception{
    constructor():super("Nieprawidlowe dane")
    protected constructor(message:String): super(message)
}