import java.util.Scanner;

public class hitungTotalHarga08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};

        System.out.println("===== MENU =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaItems[i]);
        }
        System.out.println("================");

        System.out.print("Masukkan jumlah jenis menu yang ingin dipesan: ");
        int jumlahJenis = sc.nextInt();

        int totalHarga = 0;

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + (i + 1) + ": ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = sc.nextInt();

            int hargaPerMenu = hargaItems[pilihanMenu - 1] * banyakItem;
            System.out.println("Subtotal untuk " + namaMenu[pilihanMenu - 1] + ": Rp " + hargaPerMenu);

            totalHarga += hargaPerMenu; 
        }

        System.out.println("\nTotal harga sebelum diskon: Rp " + totalHarga);

        sc.nextLine(); 
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

      
        totalHarga = hitungTotalHargaDenganDiskon(totalHarga, kodePromo);

      
        System.out.println("\nTotal harga setelah diskon: Rp " + totalHarga);
    }

    public static int hitungTotalHargaDenganDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            return (int) (totalHarga * 0.5); 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            return (int) (totalHarga * 0.3); 
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada pengurangan harga.");
        }
        return totalHarga;
    }
}
