package Array1;

public class array1D {

    // Method untuk menampilkan elemen array dan menghitung totalnya
    public String getArrayInfo(int[] arr) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        // Menampilkan elemen array 1D
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(" ");
            }
            sum += arr[i];
        }
        // Menambahkan total di baris baru
        result.append("\nSum: ").append(sum);
        // Mengembalikan hasil akhir
        return result.toString();
    }
}
