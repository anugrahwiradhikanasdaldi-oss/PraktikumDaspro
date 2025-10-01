import java.util.Scanner;
public class nestedUjianSkripsiNo18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pesan ;
    System.out.println("Apakah mahasiwa bebas kompen");
    String bebasKompen = sc.nextLine().trim();
    System.out.println("masukan jumlah log bimbingan pembimbing 1");
    int bimbingan1 = sc.nextInt();
    System.out.println("masukan jumlah log bimbingan pembimbing 2");
    int bimbingan2 = sc.nextInt();
    if (bebasKompen.equalsIgnoreCase("ya")) {
        if (bimbingan1 >= 8 && bimbingan2 >= 4) {
            pesan = "Semua persyaratan terpenuhi, mahasiswa dapat ujian skripsi";
        }else if (bimbingan1 < 8 || bimbingan2 < 4) {
            pesan = "GAGAL!! jumlah log bimbingan pembimbing 1kurang dari 8 dan pembimbing 2 kurang dari 4";
        } else if (bimbingan1 <8){
            pesan = "GAGAL!! Jumlah log bimbingan pembimbing 1 belum mencapai 8 kali";
        } else {
            pesan = "GAGAL!! jumlah log bimbingan pembimbiang 2 belum mencapai 4 kali";
        }
        System.out.println(pesan); 
    }
    }
}  