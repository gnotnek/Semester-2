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
            boolean y = true;
            do{
            System.out.println("Menu: ");
            System.out.println("1. Input nilai \n2. Tampilan menu \n 3. Keluar");

            int x = inpt.nextInt();

            if(x==1){
                System.out.println(inputNilai());
                y = true;
            }else if(x==2){
                System.out.println(tampilanNilai());
                y = true;
            }else if(x==3){
                y = false;
            }
        }while(y==true);
       } 
    }