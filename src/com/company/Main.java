package com.company;

public class Main {
    public static void main(String[] args) {
        Ziak ziak = new Ziak(10, 1000, 17);
        ziak.setVek(18);
        ziak.setVek(-1);
        InkrementujVekZiaka(ziak);
        ziak.PrintFormattedZiakInfo();
    }

    public static void InkrementujVekZiaka(Ziak ziak){
        int currentVek =  ziak.getVek();
        ziak.setVek(currentVek + 1);
    }
}
