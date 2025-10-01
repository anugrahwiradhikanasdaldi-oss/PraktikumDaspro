import java.util.Scanner;

public class UserWifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tipe user (dosen/mahasiswa/lainnya): ");
        String user = input.nextLine();
        if (user.equalsIgnoreCase("dosen")) {
            System.out.println("Akses diberikan dosen");
        } else if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int sks = input.nextInt();
            if (sks >= 144) {
                System.out.println("Diberi izin");
            } else {
                System.out.println("Tidak diberi izin");
            }
        } else {
            System.out.println("Tidak diberi izin");
        }
        input.close();
    }
}
