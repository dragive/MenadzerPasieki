package Klasy.Exceptions

open class zaduzaWartoscIntException : nieprawidlowyIntException{
    constructor():super("Za duza wartosc podana jako Int")
    protected  constructor(message: String ):super(message)
}