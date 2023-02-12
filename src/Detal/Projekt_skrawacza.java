package Detal;

import Obrobka_metalu.Frezowanie;

public class Projekt_skrawacza extends Detal {

    public Projekt_skrawacza() {
        obrobkaMetalu = new Frezowanie();
        setObrobkaInfoMetal("Sposob obrobki metalu: Frezowanie");

        //obrobkaDrewna = new Ryflowanie();
        //setObrobkaInfoDrewno("Sposob obrobki drewna: ryflowanie");
    }

    @Override
    public void wyswietl_info() {
        System.out.println("W Projekt_skrawacza uzyto nastepujacego sposobu obrobki metalu: " + getObrobkaInfoMetal());
    }
}
