import java.util.Scanner;

public class kalkulator{
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Hai ini kalkulator");

        System.out.println("Masukkan angka pertama");
        double awal = angka.nextDouble();
        
        System.out.println("Masukkan angka kedua");
        double akhir = angka.nextDouble();

        System.out.println("ngapain ?\n 1. +\n 2. - \n 3. * \n 4. /");
        System.out.println("=============================");
        int menu = angka.nextInt();

        double hasil;
        if(menu == 1){
            hasil = awal + akhir;
            System.out.println("hasil : " +hasil);
        }else if(menu == 2){
            hasil = awal - akhir;
            System.out.println("hasil : " +hasil);
        }else if (menu == 3) {
            hasil = awal * akhir;
            System.out.println("hasil : " +hasil);
        }else if( menu == 4){
            hasil = awal / akhir;
            System.out.println("hasil : " +hasil);
        }

    }
}