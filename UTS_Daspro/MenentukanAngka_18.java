package PraktikumDaspro.UTS_Daspro;
import java.util.Scanner;
public class MenentukanAngka_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        // input angka dari user 
        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble(); // input nilai a
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();
        double terbesar;
        // menentukan angka terbesar
        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= a && b >= c) {
            terbesar = b;
        } else {
            terbesar = c;
        }
        // mengecek jika ketiga angka sama besar
        if (a == b && b == c) {
            System.out.println("Semua angka sama besar.");
        } else if ((a == terbesar && b == terbesar && c != terbesar) ||
                   (a == terbesar && c == terbesar && b != terbesar) ||
                   (b == terbesar && c == terbesar && a != terbesar)) {
            System.out.println("Ada beberapa angka terbesar dengan nilai sama: " + terbesar);
        } else {
            System.out.println("Angka terbesar adalah: " + terbesar);
        }
        input.close();
    }
}