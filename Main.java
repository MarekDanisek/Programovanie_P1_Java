package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vitaj v kalkulačke!");
        System.out.println("Zadaj prvé číslo:");
        int prve_cislo = scanner.nextInt();

        System.out.println("Zadaj druhé číslo:");
        int druhe_cislo = scanner.nextInt();

        System.out.println("Vyber si operáciu: +,-,*,/");
        String operacia = scanner.next();

        int vysledok;

        if (operacia.equals("+")) {
            vysledok = prve_cislo + druhe_cislo;
            System.out.println("Výsledok: " + vysledok);
        } else if (operacia.equals("-")) {
            vysledok = prve_cislo - druhe_cislo;
            System.out.println("Výsledok: " + vysledok);
        } else if (operacia.equals("/")) {
            vysledok = prve_cislo / druhe_cislo;
            System.out.println("Vysledok: " + vysledok);
        } else if (operacia.equals("*")){
            vysledok = prve_cislo * druhe_cislo;
            System.out.println("Vysledok: " + vysledok);
        }

        else {
            System.out.println("Neplatná operácia!");
        }

        scanner.close();
    }
}
