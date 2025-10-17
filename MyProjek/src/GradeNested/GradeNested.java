package GradeNested;
public class GradeNested {
    // Method untuk menentukan grade berdasarkan mata pelajaran dan skor
    public String getGradeInfo(String subject, int score) {

        String grade;

        // Mengecek mata pelajaran
        if (subject.equals("Math")) { // Jika mata pelajaran adalah Math
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else {
                grade = "C";
            }

        } else if (subject.equals("English")) { // Jika mata pelajaran adalah English
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }

        } else { // Jika mata pelajaran tidak dikenal
            subject = "Unknown";
            grade = "N/A";
        }

        // Mengembalikan hasil dalam format yang sesuai
        return "Subject: " + subject + ", Grade: " + grade;
    }
}