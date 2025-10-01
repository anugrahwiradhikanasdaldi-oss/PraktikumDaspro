import java.util.Scanner;
public class SwitchCetakKRSNo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.println("Masukan semester saat ini :");
        int semester = sc. nextInt();
        switch (semester) {
            case 1:
                System.out.println("sistem KRS semester 1 di tampilkan");
                break;
            case 2:
                System.out.println("sistem KRS semester 2 di tampilkan");
                break;
            case 3:
                System.out.println("sistem KRS semester 3 di tampilkan");
                break;
            case 4:
                System.out.println("sistem KRS semester 4 di tampilkan");
                break;
            case 5:
                System.out.println("sistem KRS semester 5 di tampilkan");
                break;
            case 6:
                System.out.println("sistem KRS semester 6 di tampilkan");
                break;
            case 7: 
                System.out.println("sistem KRS semester 7 di tampilkan");
                break;
            case 8:
                System.out.println("sistem KRS semester 8 di tampilkan");
            default:
                System.out.println("sistem KRS semester tidak valid");
                break;
        }
    }
} 