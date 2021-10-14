package org.javaturk.oop.ch10;

public class Gida {

    private double market;
    private double pazar;
    private double disMekan;

    public static void main(String[] args) {

    }

    public double market(double masraf){
        market = masraf;
        return market;
    }

    public double pazar(double masraf){
        pazar = masraf;
        return pazar;
    }

    public double disMekan(double masraf){
        disMekan = masraf;
        return disMekan;
    }

    public double getGida(double m,double p,double dm){
        double total = m+p+dm;
        return total;
    }
}
