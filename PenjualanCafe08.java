import java.util.Scanner;

public class PenjualanCafe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah menu dan jumlah hari
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();

        // Menginisialisasi array penjualan berdasarkan input pengguna
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        // Memasukkan data penjualan
        inputDataPenjualan(penjualan, jumlahMenu, jumlahHari);
        tampilkanSemuaData(penjualan);
        tampilkanMenuTerlaris(penjualan);
        tampilkanRataRataPenjualan(penjualan);
    }

    public static void inputDataPenjualan(int[][] penjualan, int jumlahMenu, int jumlahHari) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < jumlahMenu; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan penjualan menu ke-" + (i + 1) + " pada hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanSemuaData(int[][] penjualan) {
        System.out.println("Data Penjualan Cafe:");
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilkanMenuTerlaris(int[][] penjualan) {
        int[] totalPenjualan = new int[penjualan.length];
        int indexMenuTerlaris = 0;
        int maxPenjualan = 0;

        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan[i] += penjualan[i][j];
            }
            if (totalPenjualan[i] > maxPenjualan) {
                maxPenjualan = totalPenjualan[i];
                indexMenuTerlaris = i;
            }
        }

        // Nama menu bisa disesuaikan dengan jumlah menu yang diinput
        System.out.println("Menu terlaris: Menu ke-" + (indexMenuTerlaris + 1));
    }

    public static void tampilkanRataRataPenjualan(int[][] penjualan) {
        System.out.println("Rata-rata penjualan setiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println("Menu ke-" + (i + 1) + ": " + rataRata);
        }
    }
}