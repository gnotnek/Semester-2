import java.util.Scanner;
class contohMenu{
    public static String inputNilai(){
        return "Ini input nilai";
    }
    public static String tampilanNilai(){
        return "Ini tampilan nilai";
    }
    

    public static void main(String[] args) {
            Scanner inpt = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Input nilai \n2. Tampilan menu \n 3. Keluar");

            int x = inpt.nextInt();

            if(x==1){
                System.out.println(inputNilai());
            }else if(x==2){
                System.out.println(tampilanNilai());
            }else{
                System.exit(2);
            }
    }
}