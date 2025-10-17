package StudentInfo;

public class StudentInfo {

    // Method untuk menampilkan informasi mahasiswa
    public String showStudentInfo(String name, int age, double gpa) {
        // Format string sesuai dengan yang diharapkan oleh test case
        // Perhatikan adanya spasi setelah "Age :" dan "GPA :"
        // Serta setiap baris diakhiri dengan "\n"
        String result = "Name: " + name + "\n" +
                        "Age : " + age + "\n" +
                        "GPA : " + gpa + "\n";
        return result;
    }
}