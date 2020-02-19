import java.util.Scanner;

class Bola{
    Scanner ipt = new Scanner(System.in);
    double radius;

    public Bola(){
        System.out.println("Masukan radius/jari-jari: ");
        radius = ipt.nextDouble();
    }
}