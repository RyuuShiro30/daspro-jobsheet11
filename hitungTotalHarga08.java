import java.util.Scanner;

public class hitungTotalHarga08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalharga = hitungTotalHarga08(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalharga);
        
    }
    public static int hitungTotalHarga08(int pilihanMenu, int banyakItem) {
        int[] hargaitems = {15000, 2000, 22000,12000, 10000, 18000};

        int hargatotal = hargaitems[pilihanMenu - 1] * banyakItem;
        return hargatotal;
        
       
        
    }
}
