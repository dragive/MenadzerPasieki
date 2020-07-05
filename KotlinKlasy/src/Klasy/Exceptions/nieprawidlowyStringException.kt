package Klasy.Exceptions

import java.lang.Exception

open class nieprawidlowyStringException : nieprawidloweDaneException {
    constructor():super("Zly format danych w String")
    protected constructor(message : String ):super(message)
}