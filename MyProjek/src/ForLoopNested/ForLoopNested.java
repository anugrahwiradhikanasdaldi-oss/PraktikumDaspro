package ForLoopNested;

public class ForLoopNested {
 /**
     * Fungsi ini menghasilkan string berupa grid (tabel) 
     * dalam format "Row i Col j" dari 1 sampai max.
     * Contoh jika max = 2:
     * Row 1 Col 1
     * Row 1 Col 2
     * Row 2 Col 1
     * Row 2 Col 2
     *
     * @param max nilai maksimum baris dan kolom
     * @return string hasil grid yang sudah diformat
     */
    public String getGrid(int max) {
        // Gunakan StringBuilder untuk membangun string hasil
        StringBuilder result = new StringBuilder();
        
        // Perulangan untuk setiap baris dari 1 sampai max
        for (int row = 1; row <= max; row++) {
            // Perulangan untuk setiap kolom dari 1 sampai max
            for (int col = 1; col <= max; col++) {
                // Tambahkan teks "Row i Col j" ke hasil
                result.append("Row ").append(row).append(" Col ").append(col);

                // Tambahkan baris baru (\n) jika bukan elemen terakhir
                if (!(row == max && col == max)) {
                    result.append("\n");
                }
            }
        }

        // Kembalikan string hasil
        return result.toString();
    }
}
