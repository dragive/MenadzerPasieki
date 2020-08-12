package Klasy.Exceptions

open class zamalaWartoscIntException : nieprawidlowyIntException{
    constructor():super("Za mala wartosc podana jako Int")
    protected  constructor(message: String ):super(message)
}