import java.util.Scanner;

class HurufVokalKonsonan2{

    static String hapusHurufVokal(String para){
        // String konsonan = " ";

        // for (char karakter : para.toCharArray()) {
        //     if (karakter != 'a' && karakter != 'i' && karakter != 'u' && karakter != 'e' && karakter != 'o' && karakter != ' '){
        //         konsonan += karakter;
        //     }
        // }

        // return konsonan;
        return para.replaceAll("[aiueo ]","");
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Kalimat: ");

        String kalimat = input.nextLine();

        kalimat = kalimat.toLowerCase();

        System.out.println("hasilnya adalah " + hapusHurufVokal(kalimat));
        
    }
}