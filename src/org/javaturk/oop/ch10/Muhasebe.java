package org.javaturk.oop.ch10;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Muhasebe {
    public static void main(String[] args) {

        if(gToplam() < 1000){
            System.out.println("Giderleriniz tutumlu");
        }else{
            System.out.println("Toplam Giderleriniz : " + gToplam() + " azaltmalisin");
        }
    }

    public static double setEnerji(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Suyu girin : ");
        double s = input.nextDouble();
        System.out.print("Elektrik girin : ");
        double e = input.nextDouble();
        System.out.print("Telekom girin : ");
        double t = input.nextDouble();
        System.out.print("Dogalgaz girin : ");
        double d = input.nextDouble();
        Enerji enerji = new Enerji();
        double total = enerji.getEnerji(s,e,t,d);
        return total;
    }

    public static double setGida(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Market girin : ");
        double a = input.nextDouble();
        System.out.print("Pazar girin : ");
        double b = input.nextDouble();
        System.out.print("DisMekan girin : ");
        double c = input.nextDouble();
        Gida enerji = new Gida();
        double total = enerji.getGida(a,b,c);
        return total;
    }

    public static double setAbonelikler(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Aidat girin : ");
        double a = input.nextDouble();
        System.out.print("Kira girin : ");
        double b = input.nextDouble();
        System.out.print("Online Uyelik masraflarini girin : ");
        double c= input.nextDouble();
        Abonelikler abone = new Abonelikler();
        double total = abone.getAbonelikler(a,b,c);
        return total;
    }

    public static double gToplam(){
        var abonelik = setAbonelikler();
        System.out.println("Toplam Abonelik Gideriniz : " + abonelik);
        var gida = setGida();
        System.out.println("Toplam Gida Gideriniz : " + gida);
        var enerji = setEnerji();
        System.out.println("Toplam Enerji Gideriniz : " + enerji);
        System.out.println("----------------------------------");
        return abonelik + gida + enerji;
    }
}
