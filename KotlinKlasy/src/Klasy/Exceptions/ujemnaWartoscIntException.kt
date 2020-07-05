package Klasy.Exceptions

class ujemnaWartoscIntException : zamalaWartoscIntException{
    constructor():super("Ujemna wartosc Int")
    protected  constructor(message: String ):super(message)
}