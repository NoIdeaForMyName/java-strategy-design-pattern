package Main;

import Detal.Projekt_skrawacza;
import Detal.Projekt_stolarza;
import Obrobka_drewna.Ryflowanie;
import Obrobka_drewna.Szlifowanie;
import Obrobka_metalu.Frezowanie;
import Obrobka_metalu.Toczenie;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static int sprawdz_input(int min, int max) {
        int input;

        while (!scanner.hasNextInt()) {
            System.out.print("Nieprawidlowe dane! Podaj ponownie... ");
            scanner.next();
        }
        input = Integer.parseInt(scanner.next());
        input = sprawdz_przedzial(input, min, max);
        return input;
    }

    private static int sprawdz_przedzial(int input, int min, int max) {
        if (!(input >= min && input <= max)) {
            System.out.print("Nieprawidlowy przedzial liczbowy! Podaj wartosc ponownie... ");
            //scanner.reset();
            input = sprawdz_input(min, max);
        }
        return input;
    }

    public static void main(String[] args) {

        Projekt_stolarza projekt_stolarza = new Projekt_stolarza();
        Projekt_skrawacza projekt_skrawacza = new Projekt_skrawacza();

        int input = 0;

        while (input != 3) {
            System.out.println("\n\nMENU:");
            System.out.println("Wybierz interesujacy Cie projekt:\n1 : Stolarz\n2 : Skrawacz\n3 : Zakoncz program");
            input = sprawdz_input(1, 3);

            switch (input) {//wykonaj obrobke, zmien obrobke, wyswietl obrobke...

                case 1 -> {
                    System.out.println("Wybrano: Stolarz");
                    System.out.println("Co chcesz zrobic:\n1 : Wyswietl informacje o obrobce\n2 : Wykonaj obrobke drewna\n3 : Zmien rodzaj obrobki drewna");
                    input = sprawdz_input(1, 3);

                    switch (input) {
                        case 1 -> projekt_stolarza.wyswietl_info();
                        case 2 -> projekt_stolarza.wykonaj_obrobke_drewna();
                        case 3 -> {
                            System.out.println("Jaki rodzaj obrobki drewna chcesz ustawic:\n1 : Ryflowanie\n2 : Szlifowanie");
                            input = sprawdz_input(1, 2);
                            switch (input) {
                                case 1 -> {
                                    projekt_stolarza.ustaw_nowy_rodzaj_obrobki_drewna(new Ryflowanie());
                                    projekt_stolarza.setObrobkaInfoDrewno("Sposob obrobki drewna: Ryflowanie");
                                }
                                case 2 -> {
                                    projekt_stolarza.ustaw_nowy_rodzaj_obrobki_drewna(new Szlifowanie());
                                    projekt_stolarza.setObrobkaInfoDrewno("Sposob obrobki drewna: Szlifowanie");
                                }
                            }
                            System.out.println("Pomyslnie zmieniono rodzaj obrobki drewna!");
                        }
                    }
                }

                case 2 -> {
                    System.out.println("Wybrano: Skrawacz");
                    System.out.println("Co chcesz zrobic:\n1 : Wyswietl informacje o obrobce\n2 : Wykonaj obrobke metalu\n3 : Zmien rodzaj obrobki metalu");
                    input = sprawdz_input(1, 3);

                    switch (input) {
                        case 1 -> projekt_skrawacza.wyswietl_info();
                        case 2 -> projekt_skrawacza.wykonaj_obrobke_metalu();
                        case 3 -> {
                            System.out.println("Jaki rodzaj obrobki metalu chcesz ustawic:\n1 : Frezowanie\n2 : Toczenie");
                            input = sprawdz_input(1, 2);
                            switch (input) {
                                case 1 -> {
                                    projekt_skrawacza.ustaw_nowy_rodzaj_obrobki_metalu(new Frezowanie());
                                    projekt_skrawacza.setObrobkaInfoMetal("Sposob obrobki metalu: Frezowanie");
                                }
                                case 2 -> {
                                    projekt_skrawacza.ustaw_nowy_rodzaj_obrobki_metalu(new Toczenie());
                                    projekt_skrawacza.setObrobkaInfoMetal("Sposob obrobki metalu: Toczenie");
                                }
                            }
                            System.out.println("Pomyslnie zmieniono rodzaj obrobki metalu!");
                        }
                    }
                }

                case 3 -> {
                    System.out.println("Koniec programu!");
                    scanner.close();
                }
            }
        }
    }
}
