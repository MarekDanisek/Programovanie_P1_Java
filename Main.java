package com.company;

import java.util.Scanner;

public class Main {

    static int scitaj(int prve_cislo, int druhe_cislo) {
        return prve_cislo + druhe_cislo;
    }


    static int odcitaj(int prve_cislo, int druhe_cislo) {
        return prve_cislo - druhe_cislo;
    }


    static int nasob(int prve_cislo, int druhe_cislo) {
        return prve_cislo * druhe_cislo;
    }


    static int vydel(int prve_cislo, int druhe_cislo) {
        return prve_cislo / druhe_cislo;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean pokracovat = true;

        while (pokracovat) {

            System.out.println("Vitaj v kalkulačke!");

            System.out.println("Zadaj prvé číslo:");
            int prveCislo = scanner.nextInt();

            System.out.println("Zadaj druhé číslo:");
            int druheCislo = scanner.nextInt();

            System.out.println("Vyber si operáciu: +,-,,/");
            String operacia = scanner.next();

            int vysledok = 0;

            if (operacia.equals("+")) {
                vysledok = scitaj(prveCislo, druheCislo);

            } else if (operacia.equals("-")) {
                vysledok = odcitaj(prveCislo, druheCislo);

            } else if (operacia.equals("")) {
                vysledok = nasob(prveCislo, druheCislo);

            } else if (operacia.equals("/")) {
                vysledok = vydel(prveCislo, druheCislo);

            } else {
                System.out.println("Neplatná operácia!");
                continue;
            }

            System.out.println("Výsledok: " + vysledok);

            System.out.print("Chceš zastaviť? ano/nie: ");
            String odpoved = scanner.next();

            if (odpoved.equals("ano")) {
                pokracovat = false;
            }
        }

        scanner.close();
    }
}
