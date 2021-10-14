package org.javaturk.oop.ch10;

public class Abonelikler {
    private double aidat;
    private double onlineUyelikler;
    private double kira;

    public static void main(String[] args) {
        System.out.println("Abonelikler");
    }

    public double getAidat(double masraf){
        aidat = masraf;
        return aidat;
    }
    public double getOnlineUyelikler(double masraf){
        onlineUyelikler = masraf;
        return onlineUyelikler;
    }

    public double getKira(double masraf) {
        kira = masraf;
        return kira;
    }

    public double getAbonelikler(double a,double b,double c){
        double total = a+b+c;
        return total;
    }
}
