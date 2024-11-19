import java.util.Scanner;

public class hitungTotalHarga08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        
        sc.nextLine(); 
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga08(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }

    public static int hitungTotalHarga08(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            hargaTotal *= 0.3; 
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada pengurangan harga.");
        }

        return hargaTotal;
    }
}

