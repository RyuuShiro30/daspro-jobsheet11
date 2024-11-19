public class Kubus08 {
    double sisi;

    public Kubus08(int sisiinput) {
        sisi = sisiinput;
    }

    public double hitungLuas() {
        return 6 * sisi * sisi;
    }
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Kubus08 kubus = new Kubus08(10);
        
        double hitungLuas = kubus.hitungLuas();
        double hitungVolume = kubus.hitungVolume();
        
        System.out.println("Luas kubus adalah " + hitungLuas);
        System.out.println("Volume kubus adalah " + hitungVolume);
    }
}