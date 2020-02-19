import java.util.Scanner;

class ganjilGenap{
    static String apakahGanjil(int angka){
        String hasil = "";
        if(angka % 2 == 1){
            hasil = "Ganjil";
        }else{
            hasil = "Genap";
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("masukan bilanagan: ");
        int bil = i.nextInt();

        System.out.println(bil+" adalah bilangan "+ apakahGanjil(bil));
    }
}