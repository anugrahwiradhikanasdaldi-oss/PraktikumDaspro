package WhileLoopNested;

public class WhileLoopNested {

    // Method untuk membentuk pola segitiga bintang berdasarkan input
    public String getTriangle(int max) {
        String result = "";

        int i = 1; // Baris pertama dimulai dari 1
        while (i <= max) {
            int j = 1; // Kolom dimulai dari 1 setiap baris baru
            while (j <= i) {
                result += "*"; // Tambahkan bintang sebanyak nilai i
                j++; // Naikkan kolom
            }

            // Tambahkan newline jika belum mencapai baris terakhir
            if (i < max) {
                result += "\n";
            }

            i++; // Lanjut ke baris berikutnya
        }

        // Mengembalikan hasil pola bintang
        return result;
    }
}
