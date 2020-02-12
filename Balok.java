import java.util.Scanner;

import sun.jvm.hotspot.tools.SysPropsDumper;

class Balok{
    Scanner inpt = new Scanner(System.in);
    double panjang, lebar, tinggi;

    public Balok(){
        System.out.println("Masukan panjang: ");
        panjang = inpt.nextDouble();
        System.out.println("Masukan lebar: ");
        lebar = inpt.nextDouble();
        System.out.println("Masukan tinggi: ");
        tinggi = inpt.nextDouble();
    }

    public double keliling(){
        return 4*(panjang+lebar+tinggi);
    }

    public double luasPermukaan(){
        return 2*(panjang+lebar*panjang+tinggi*lebar+tinggi);
    }

    public double volume(){
        return panjang*lebar*tinggi;
    }
    
    public static void main(String[] args) {
        System.out.println("Balok!");

        System.out.println("Bolok Kecil: ");
        Balok kecil = new Balok();
        System.out.println("Bolok sedang: ");
        Balok sedang = new Balok();
        System.out.println("Bolok Besar: ");
        Balok besar = new Balok();

        

        System.out.println("\nkeliling balok kecil: " +kecil.keliling()  + " cm");
        System.out.println("Luas permukaan balok kecil: "+ kecil.luasPermukaan()+ " cm^2");
        System.out.println("Volume balok kecil: "+kecil.volume()+ " cm^3");

        System.out.println("\nkeliling balok sedang: " + sedang.keliling() + " cm");
        System.out.println("Luas permukaan balok sedang: "+sedang.luasPermukaan() + " cm^2");
        System.out.println("Volume balok sedang: "+sedang.volume() + " cm^3");

        System.out.println("\nkeliling balok besar: " +besar.keliling() + " cm");
        System.out.println("Luas permukaan balok besar: "+besar.luasPermukaan() + " cm^2");
        System.out.println("Volume balok besar: "+besar.volume() + " cm^3");

        


        

    }
}