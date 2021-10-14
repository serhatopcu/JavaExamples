package org.javaturk.oop.ch10;

public class Enerji {
    private double su;
    private double elektrik;
    private double telekom;
    private double dogalgaz;

    public static void main(String[] args) {
        System.out.println("Enerji Datasi");
    }

    public double su(double masraf){
        su = masraf;
        return su;
    }

    public double elektrik(double masraf){
        elektrik = masraf;
        return elektrik;
    }

    public double telekom(double masraf){
        telekom = masraf;
        return telekom;
    }

    public double dogalgaz(double masraf){
        dogalgaz = masraf;
        return dogalgaz;
    }
    public double getEnerji(double s,double e,double t,double d){
        double total = s+e+t+d;
        return total;
    }
}
