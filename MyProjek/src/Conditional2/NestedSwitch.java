package Conditional2;

public class NestedSwitch {

    // Method untuk menentukan hasil pilihan berdasarkan kategori dan pilihan
    public String getSelection(int category, int choice) {
        String result = "";

        // Switch pertama: menentukan kategori
        switch (category) {
            case 1: // Kategori minuman (Drink)
                switch (choice) {
                    case 1:
                        result = category + ", You selected: Tea";
                        break;
                    case 2:
                        result = category + ", You selected: Coffee";
                        break;
                    case 3:
                        result = category + ", You selected: Juice";
                        break;
                    default:
                        result = category + ", Invalid drink choice";
                        break;
                }
                break;

            case 2: // Kategori makanan (Food)
                switch (choice) {
                    case 1:
                        result = category + ", You selected: Pizza";
                        break;
                    case 2:
                        result = category + ", You selected: Burger";
                        break;
                    case 3:
                        result = category + ", You selected: Pasta";
                        break;
                    default:
                        result = category + ", Invalid food choice";
                        break;
                }
                break;

            default:
                // Jika kategori tidak ada (bukan 1 atau 2)
                result = category + ", Invalid category";
                break;
        }

        // Mengembalikan hasil akhir
        return result;
    }
}
