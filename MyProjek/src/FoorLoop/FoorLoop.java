package FoorLoop;

public class FoorLoop {
     // Method getNumbersAndSum bertujuan untuk menghitung jumlah dari 1 sampai 'max'
    public int getNumbersAndSum(int max) {
        int sum = 0; // Variabel sum digunakan untuk menyimpan hasil penjumlahan

        // Menggunakan perulangan for untuk menghitung jumlah dari 1 sampai max
        // i dimulai dari 1, dan perulangan berhenti ketika i > max
        for (int i = 1; i <= max; i++) {
            sum += i; // Menambahkan nilai i ke dalam variabel sum di setiap perulangan
        }

        // Mengembalikan (return) hasil penjumlahan ke pemanggil method
        return sum;
    }
}