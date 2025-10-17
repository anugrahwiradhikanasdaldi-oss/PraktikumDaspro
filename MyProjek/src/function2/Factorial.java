package function2;
public class Factorial {
    // Method untuk menghitung faktorial dari sebuah bilangan n
    public int factorial(int n) {
        // Jika n = 0, hasil faktorial adalah 1 (sesuai definisi matematika)
        if (n == 0) {
            return 1;
        } else {
            // Variabel untuk menyimpan hasil perkalian
            int result = 1;

            // Perulangan dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                result *= i; // Mengalikan hasil sebelumnya dengan i
            }

            // Mengembalikan hasil akhir
            return result;
        }
    }
}
