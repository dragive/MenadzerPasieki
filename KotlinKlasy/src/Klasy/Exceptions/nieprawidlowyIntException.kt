package Klasy.Exceptions

open class nieprawidlowyIntException : nieprawidloweDaneException{
    constructor():super("Nieprawidlowa wartość Int")
    protected  constructor(message: String ):super(message)
}