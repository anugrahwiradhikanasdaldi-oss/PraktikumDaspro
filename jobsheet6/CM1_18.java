import java.util.Scanner;
public class CM1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = "", nim = "";
        int uts_adp, uas_adp, tugas_adp;
        int uts_sd, uas_sd, tugas_sd;
        double rata_rata_adp, rata_rata_sd;
        String nilai_huruf_adp, nilai_huruf_sd;
        String status_adp, status_sd;
        System.out.println("=== Data Mahasiswa ===");   
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("=== Input Nilai Akademik ===");
        System.out.print("Masukkan nilai UTS algoritma dan pemrograman: ");
        uts_adp = sc.nextInt();
        System.out.print("Masukkan nilai UAS algoritma dan pemrograman: ");
        uas_adp = sc.nextInt();
        System.out.print("Masukkan nilai Tugas algoritma dan pemrograman: ");
        tugas_adp = sc.nextInt();
        System.out.print("Masukkan nilai UTS struktur data: ");
        uts_sd = sc.nextInt();
        System.out.print("Masukkan nilai UAS struktur data: ");
        uas_sd = sc.nextInt();
        System.out.print("Masukkan nilai Tugas struktur data: ");
        tugas_sd = sc.nextInt();
        // Hitung rata-rata
        rata_rata_adp = (uts_adp + uas_adp + tugas_adp) / 3.0;
        rata_rata_sd = (uts_sd + uas_sd + tugas_sd) / 3.0;
        // Menentukan nilai huruf Algoritma dan Pemrograman
        if (rata_rata_adp >= 85) nilai_huruf_adp = "A";
        else if (rata_rata_adp >= 80) nilai_huruf_adp = "A-";
        else if (rata_rata_adp >= 75) nilai_huruf_adp = "B+";
        else if (rata_rata_adp >= 70) nilai_huruf_adp = "B";
        else if (rata_rata_adp >= 65) nilai_huruf_adp = "C+";
        else if (rata_rata_adp >= 60) nilai_huruf_adp = "C";
        else if (rata_rata_adp >= 55) nilai_huruf_adp = "D";
        else nilai_huruf_adp = "E";
        // Menentukan nilai huruf Struktur Data
        if (rata_rata_sd >= 85) nilai_huruf_sd = "A";
        else if (rata_rata_sd >= 80) nilai_huruf_sd = "A-";
        else if (rata_rata_sd >= 75) nilai_huruf_sd = "B+";
        else if (rata_rata_sd >= 70) nilai_huruf_sd = "B";
        else if (rata_rata_sd >= 65) nilai_huruf_sd = "C+";
        else if (rata_rata_sd >= 60) nilai_huruf_sd = "C";
        else if (rata_rata_sd >= 55) nilai_huruf_sd = "D";
        else nilai_huruf_sd = "E";
        // Menentukan status kelulusan
        status_adp = (rata_rata_adp >= 70) ? "LULUS" : "TIDAK LULUS";
        status_sd  = (rata_rata_sd >= 70) ? "LULUS" : "TIDAK LULUS";
        // Output
        System.out.println("==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("==================================================================");
        System.out.println("Mata kuliah:\t\t\t\tUTS\tUAS\tTugas\tRata-rata\tNilai Huruf\tStatus");
        System.out.println("Algoritma dan Pemrograman:\t\t" + uts_adp + "\t" + uas_adp + "\t" + tugas_adp + "\t" + rata_rata_adp + "\t\t" + nilai_huruf_adp + "\t\t" + status_adp);
        System.out.println("Struktur Data:\t\t\t\t" + uts_sd + "\t" + uas_sd + "\t" + tugas_sd + "\t" + rata_rata_sd + "\t\t" + nilai_huruf_sd + "\t\t" + status_sd);
        sc.close();
    }
}