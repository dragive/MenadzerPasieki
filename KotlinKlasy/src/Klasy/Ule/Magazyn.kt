package Klasy.Ule

import Klasy.Exceptions.ujemnaWartoscIntException
import Klasy.Komponenty.Przedmiot
import java.util.*

class Magazyn {
    private var storage : Vector<Pair<Przedmiot,Int>> = Vector()

    constructor()

    fun dodajDoMagazynu(przedmiot: Przedmiot,ilosc : Int){

        if (ilosc < 1){
            throw ujemnaWartoscIntException()
        }

        for (i in 0 until storage.size){
            if(przedmiot.equals(storage[i].first)){
                storage[i] = Pair(storage[i].first,storage[i].second+ilosc)
                return
            }
        }
        storage.add(Pair(przedmiot,ilosc))
    }

    fun dodajDoMagazynu(wielePrzedmiotow: Vector<Pair<Przedmiot,Int>>){
        for (i in 0 until wielePrzedmiotow.size){
            dodajDoMagazynu(wielePrzedmiotow[i].first,wielePrzedmiotow[i].second)
        }
    }
    

    fun getStorage(): Vector<Pair<Przedmiot,Int>>{
        return this.storage
    }
}

