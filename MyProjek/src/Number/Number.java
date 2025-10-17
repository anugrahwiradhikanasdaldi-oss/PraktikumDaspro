package Number;
public class Number {

    // Method untuk menghitung berbagai operasi berdasarkan dua angka input (a dan b)
    public String getOperatorResults(int a, int b) {

        // Operasi aritmatika dasar
        int sum = a + b;        // Penjumlahan
        int product = a * b;    // Perkalian

        // Operasi relasional
        boolean isEqual = (a == b); // Mengecek apakah a dan b sama

        // Operasi logika
        boolean logicalAnd = (a > 0 && b > 0); // true jika keduanya positif
        boolean logicalOr = (a < 0 || b > 0);  // true jika salah satu memenuhi kondisi

        // Menggabungkan hasil menjadi satu string, dengan format yang sesuai test case
        String result = "Sum: " + sum + "\n" +
                        "Product: " + product + "\n" +
                        "Is Equal: " + isEqual + "\n" +
                        "Logical AND: " + logicalAnd + "\n" +
                        "Logical OR: " + logicalOr;

        // Mengembalikan hasil akhir
        return result;
    }
}