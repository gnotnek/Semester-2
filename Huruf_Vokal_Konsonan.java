import java.util.Scanner;
class Huruf_Vokal_Konsonan{

    static String hapusHurufVokal(String para){
        para = para.replaceAll("a", "");
        para = para.replaceAll("i", "");
        para = para.replaceAll("u", "");
        para = para.replaceAll("e", "");
        para = para.replaceAll("o", "");
        return para;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kalimat: ");
        String vokal = input.nextLine();
        vokal = vokal.toLowerCase();
        
        System.out.println("hasil adalah "+ hapusHurufVokal(vokal));
    


    }
}