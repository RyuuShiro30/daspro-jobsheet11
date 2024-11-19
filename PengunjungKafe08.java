public class PengunjungKafe08 {
    public static void main(String[] args) {
        daftarpengunjung("Ali", "Budi", "Citra");
    }

    public static void daftarpengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);

        }
    }
}
