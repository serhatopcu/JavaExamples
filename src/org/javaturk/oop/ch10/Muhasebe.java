package org.javaturk.oop.ch10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Muhasebe {

    public static Double  kontrol(Scanner input) {
        do {
            try {
                return Double.parseDouble(input.next());
            }catch (NumberFormatException ex){
                System.out.println("Double deger giriniz." + ex);
            }
        }while(true);
    }

    public static void fileSave(String data) throws IOException {
        String content = data;
        String path = "D:/java/Java2/text/muhasebe.txt";
        Files.write( Paths.get(path), content.getBytes(StandardCharsets.UTF_8));
    }

    public static void main(String[] args) throws IOException {
        double a = gToplam();
        fileSave("Toplam Giderleriniz : " + String.valueOf(a) + " azaltmalisin");

        if(gToplam() < 1000){
            System.out.println("Giderleriniz tutumlu");
        }else{
            System.out.println("Toplam Giderleriniz : " + gToplam() + " azaltmalisin");
        }
    }
    public static double setEnerji(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Suyu girin : ");
        double s = kontrol(input);
        System.out.print("Elektrik girin : ");
        double e = kontrol(input);
        System.out.print("Telekom girin : ");
        double t = kontrol(input);
        System.out.print("Dogalgaz girin : ");
        double d = kontrol(input);

        Enerji enerji = new Enerji();
        double total = enerji.getEnerji(s,e,t,d);
        return total;
    }
    public static double setGida(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Market girin : ");
        double a = kontrol(input);
        System.out.print("Pazar girin : ");
        double b = kontrol(input);
        System.out.print("DisMekan girin : ");
        double c = kontrol(input);
        Gida enerji = new Gida();
        double total = enerji.getGida(a,b,c);
        return total;
    }
    public static double setAbonelikler(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Aidat girin : ");
        double a = kontrol(input);
        System.out.print("Kira girin : ");
        double b = kontrol(input);
        System.out.print("Online Uyelik masraflarini girin : ");
        double c= kontrol(input);
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
