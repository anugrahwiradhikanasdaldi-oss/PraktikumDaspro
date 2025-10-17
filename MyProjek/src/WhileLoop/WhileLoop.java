package WhileLoop;

public class WhileLoop {
// Method untuk menjumlahkan semua bilangan genap dari 1 sampai 'max'
    public int getEvenNumbersAndSum(int max) {
        int number = 1; // Mulai dari 1
        int sum = 0;    // Variabel untuk menyimpan total penjumlahan

        // Perulangan while untuk mengecek setiap angka hingga mencapai 'max'
        while (number <= max) {
            // Jika angka genap, tambahkan ke total
            if (number % 2 == 0) {
                sum += number;
            }
            number++; // Naik ke angka berikutnya
        }

        // Kembalikan total jumlah bilangan genap
        return sum;
    }
}
