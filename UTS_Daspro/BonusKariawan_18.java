package PraktikumDaspro.UTS_Daspro;
import java.util.Scanner;
public class BonusKariawan_18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nama_karyawan, sertifikasi;
    int nilai_kinerja, lama_bekerja ;
    double gaji_pokok,bonus ;
    //input data karyawan
    System.out.print("Masukkan nama karyawan: ");
    nama_karyawan = input.nextLine();
    System.out.print("Masukkan gaji pokok: ");
    gaji_pokok = input.nextDouble();
    System.out.print("Masukkan lama bekerja (dalam tahun): ");
    lama_bekerja = input.nextInt();
    System.out.print("Masukkan nilai kinerja (0-100): ");
    nilai_kinerja = input.nextInt();
   System.out.println("masukan sertifikasi (ya/tidak) : ");
   sertifikasi = input.next();
 if (nilai_kinerja < 70) {
            bonus = 0;
            System.out.println("Nilai kinerja di bawah 70, tidak mendapatkan bonus.");
        } else {
            if (nilai_kinerja >= 90) {
                // Kinerja >= 90
                if (lama_bekerja < 2) {
                    bonus = 0.02 * gaji_pokok;
                } else if (lama_bekerja < 5) {
                    bonus = 0.04 * gaji_pokok;
                } else {
                    bonus = 0.07 * gaji_pokok;
                }
            } else {
                // Kinerja 70 - 89
                if (lama_bekerja < 2) {
                    bonus = 0.01 * gaji_pokok;
                } else if (lama_bekerja < 5) {
                    bonus = 0.03 * gaji_pokok;
                } else {
                    bonus = 0.05 * gaji_pokok;
                }
            }
            // Tambahan bonus sertifikasi (hanya jika sudah memenuhi syarat)
            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonus += 500000;
    System.out.println("Karyawan: " + nama_karyawan);
    System.out.println("Gaji Pokok: " + gaji_pokok);
    System.out.println("Bonus yang diterima: " + bonus);
    System.out.println("karyawan memiliki sertifikasi: " + (sertifikasi.equalsIgnoreCase("ya") ? "ya" : "tidak"));
    System.out.println("Total Gaji yang anda terima adalah: " + (gaji_pokok + bonus));
            }
        }
   }
  }