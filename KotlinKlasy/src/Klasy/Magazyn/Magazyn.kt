package Klasy.Ule

import Klasy.Exceptions.ujemnaWartoscIntException
import Klasy.Komponenty.Przedmiot
import java.util.*

class Magazyn {
    private var storage : Vector<Pair<Przedmiot,Int>> = Vector()
    val dane: Vector<Pair<Przedmiot,Int>>
        get() = this.storage

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

    fun sprawdzCzyJestWMagazynie(przedmiot: Przedmiot){
        for (i in dane){
            if(i.first == przedmiot)TODO("Dokonczenie#####################################")
        }
    }

    fun usunZMagazynu(przedmiot: Przedmiot){

    }


    fun iloscPrzedmiotu(przedmiot: Przedmiot): Int{
        for( i in 0 until this.storage.size)
        {
            if(storage[i].first.equals(przedmiot))
            {
                return storage[i].second
            }
        }
        return 0
    }
}

