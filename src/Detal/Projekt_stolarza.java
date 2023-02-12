package Detal;

import Obrobka_drewna.Szlifowanie;

public class Projekt_stolarza extends Detal {

    public Projekt_stolarza() {
        //obrobkaMetalu = new Toczenie();
        //setObrobkaInfoMetal("Sposob obrobki metalu: skrawanie");

        obrobkaDrewna = new Szlifowanie();
        setObrobkaInfoDrewno("Sposob obrobki drewna: Szlifowanie");
    }

    @Override
    public void wyswietl_info() {
        System.out.println("W Projekt_stolarza uzyto nastepujacego sposobu obrobki drewna: " + getObrobkaInfoDrewno());
    }
}
