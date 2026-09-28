package com.company;

public class Ziak {
    private int cisloSkr;
    private int ISIC;
    private int vek;

    public int getCisloSkr() {
        return cisloSkr;
    }

    public void setCisloSkr(int cisloSkr) {
        this.cisloSkr = cisloSkr;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        if (vek >= 0 && vek <= 100) {
            this.vek = vek;
        } else {
            System.out.println("Nesprávny vek!");
        }
    }

    public Ziak(int cisloSkr, int ISIC, int vek) {
        if (vek < 0) {
            System.out.println("Vek nemoze byt na NULE!");
            return;
        }

        this.cisloSkr = cisloSkr;
        this.ISIC = ISIC;
        this.vek = vek;
    }

    public Ziak() {
    }

    public void PrintFormattedZiakInfo() {
        System.out.println("***** ZIAK *****");
        System.out.println("Ziak cisloSkr: " + cisloSkr);
        System.out.println("ISIC: " + ISIC);
        System.out.println("vek: " + vek);
    }
}