import java.util.Scanner;

class Bola{
    Scanner ipt = new Scanner(System.in);
    double radius;
    public Bola(){
        System.out.println("Masukan radius/jari-jari: ");
        radius = ipt.nextDouble();
    }
    private double luasP(){
        return 4*Math.PI*radius*radius;
    }

    private double volume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }

    public static void main(String[] args){

        System.out.println("Bola!");
        Bola bola1 = new Bola();

        System.out.println("Luas permukaan = "+ bola1.luasP()+" cm^2");
        System.out.println("Volume Bola = "+ bola1.volume()+" cm^3");
    }
}