package Klasy.Exceptions

class ujemnaWartoscIntException : nieprawidlowyIntException{
    constructor():super("Ujemna wartosc Int")
    protected  constructor(message: String ):super(message)
}