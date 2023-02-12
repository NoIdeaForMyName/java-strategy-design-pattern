package Detal;

import Obrobka_drewna.SposobObrobkiDrewna;
import Obrobka_metalu.SposobObrobkiMetalu;

public abstract class Detal {  //mamy detal, albo metalowy, albo drewniany

    protected SposobObrobkiMetalu obrobkaMetalu;
    protected SposobObrobkiDrewna obrobkaDrewna;

    private String obrobkaInfoMetal;
    private String obrobkaInfoDrewno;

    public void wykonaj_obrobke_metalu() {
        obrobkaMetalu.obrabianieMetalu();
    }

    public void wykonaj_obrobke_drewna() {
        obrobkaDrewna.obrabianieDrewna();
    }

    public void ustaw_nowy_rodzaj_obrobki_metalu(SposobObrobkiMetalu obr) {
        obrobkaMetalu = obr;
    }

    public void ustaw_nowy_rodzaj_obrobki_drewna(SposobObrobkiDrewna obr) {
        obrobkaDrewna = obr;
    }

    public abstract void wyswietl_info();

    public String getObrobkaInfoMetal() {
        return obrobkaInfoMetal;
    }

    public String getObrobkaInfoDrewno() {
        return obrobkaInfoDrewno;
    }

    public void setObrobkaInfoMetal(String obrobkaInfoMetal) {
        this.obrobkaInfoMetal = obrobkaInfoMetal;
    }

    public void setObrobkaInfoDrewno(String obrobkaInfoDrewno) {
        this.obrobkaInfoDrewno = obrobkaInfoDrewno;
    }

}
