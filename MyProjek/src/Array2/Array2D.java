package Array2;

public class Array2D {

    // Method untuk menampilkan informasi matriks 2D beserta total dan rata-ratanya
    public String getMatrixInfo(int[][] arr) {
        StringBuilder result = new StringBuilder();
        int total = 0;
        int count = 0;

        // Mengiterasi setiap baris dalam matriks
        for (int i = 0; i < arr.length; i++) {
            result.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                total += value;
                count++;

                // Menandai bilangan ganjil (O) atau genap (E)
                if (value % 2 == 0) {
                    result.append(value).append("E ");
                } else {
                    result.append(value).append("O ");
                }
            }
            result.append("\n");
        }

        // Menghitung rata-rata (total dibagi jumlah elemen)
        double average = (count == 0) ? 0 : (double) total / count;

        // Menambahkan total dan rata-rata ke hasil akhir
        result.append("Total: ").append(total).append("\n");
        result.append("Average: ").append(average);

        // Mengembalikan hasil akhir dalam bentuk string
        return result.toString();
    }
}
