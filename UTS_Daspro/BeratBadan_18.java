package PraktikumDaspro.UTS_Daspro;
import java.util.Scanner;
public class BeratBadan_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, tinggi, bmi;
        String status, kesehatan = "";
        //input berat dan tinggi dari user
        System.out.print("Masukkan berat badan (kg): ");
        berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        tinggi = input.nextDouble();
        //hitung BMI
        bmi = berat / (tinggi * tinggi);
        //menentukan status berat badan
        if (bmi < 18.5){
            status = "Kekurangan berat badan";
            kesehatan = "kurang gizi, osteoporosis, penurunan sistem kekebalan tubuh";    
        } else if (bmi >= 18.5 && bmi < 24.9){
            status = "Normal (ideal)";
            kesehatan = "relatif rendah ";
        } else if (bmi >= 25 && bmi < 29.9){
            status = "Kelebihan berat badan";
            kesehatan = "meningkatnya resiko penyakit jantung, diabetes ,tekanan darah tinggi";
        } else {
            status = "Kegemukan (obesitas)";
            kesehatan = "resiko penyakit jantung , diabetes , tekana darah tinggi,masalah pernapasan, dan beberapa jenis kangker";
        }
        //output hasil BMI dan status
        System.out.println("Status berat badan: " + status);
        System.out.println("Nilai BIM anda adlah ;  " + bmi);
        System.out.println("Resiko kesehatan yang mungkin terjadi : " + kesehatan);
        System.out.println("Semoga lebih sehat dan dapat menjaga berat badan ideal :) ");
    }
}
