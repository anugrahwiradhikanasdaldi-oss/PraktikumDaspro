package PraktikumDaspro.UTS_Daspro;
import java.util.Scanner;
public class MenentukanAngka_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        //input angka dari user 
        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();
        double terbesar;
        //menetukan angka terbesar
        if (a>=b && a>=c){
            terbesar = a;
        } else if (b>=a && b>=c){
            terbesar = b;   
            } else {
            terbesar = c;
        }
        //output angka terbesar 
        System.out.println("Angka terbesar adalah: " + terbesar);
    }
}