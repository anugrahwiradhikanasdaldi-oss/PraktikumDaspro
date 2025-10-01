import java.util.Scanner;
public class ifElseCetakKRSNo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukan semester saat ini: ");
        int semester = sc.nextInt();
        if (semester == 1) {
            System.out.println("Sistem KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("Sistem KRS semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("Sistem KRS semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("Sistem KRS semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("Sistem KRS semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("Sistem KRS semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("Sistem KRS semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("Sistem KRS semester 8 ditampilkan");
        } else {
            // else ini menggantikan default di switch
            System.out.println("Sistem KRS semester tidak valid");
        }
        sc.close();
    }
}