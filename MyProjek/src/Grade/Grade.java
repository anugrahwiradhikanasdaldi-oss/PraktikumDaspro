package Grade;

public class Grade {

    // Method untuk menentukan grade berdasarkan nilai (score)
    public String getGrade(int score) {
        String result;

        // Jika nilai 90 atau lebih, maka Grade A
        if (score >= 90) {
            result = "Grade: A";
        }
        // Jika nilai antara 75 dan 89, maka Grade B
        else if (score >= 75) {
            result = "Grade: B";
        }
        // Jika nilai antara 60 dan 74, maka Grade C
        else if (score >= 60) {
            result = "Grade: C";
        }
        // Jika nilai kurang dari 60, maka Grade F
        else {
            result = "Grade: F";
        }

        // Mengembalikan hasil dalam format "Grade: X"
        return result;
    }
}
