import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Array hasil = new Array();
        System.out.println("masukan besar array 1: ");
        int A;
        A = i.nextInt();

        float[] data1 = new float[A];


        for(int x=0;x<A;x++){ //for(int y=0;y<B;y++){ 
                System.out.println("masukan datanya: ");
                data1[x]=i.nextFloat();
        }

        hasil(data1);
        

        System.out.println("masukan besar array 2: ");
        int B;
        B = i.nextInt();
        float[] data2 = new float[B];

        for(int y = 0;y<B;y++){
            System.out.println("masukan datanya: ");
            data2[y]=i.nextFloat();
        }

        hasil(data2);
 
       
    }

    static void hasil(float[] param){
        for(int b=0; b<param.length;b++){
            System.out.println(param[b]);
        }
    }


}