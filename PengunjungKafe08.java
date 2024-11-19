public class PengunjungKafe08 {
    public static void main(String[] args) {
        daftarpengunjung("Ali", "Budi", "Citra");
    }
    public static void daftarpengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);

           
        }
    }
}
