import java.util.Scanner;

public class Percobaan608 {
    static int hitungluas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungluas(a,b)*tinggi;
        return Volume;
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int p, l, t, L, vol;

    System.out.println("Masukkan panjang");
    p = input.nextInt();
    System.out.println("Maasukkan lebar");
    l = input.nextInt();
    System.out.println("Masukkan tinggi");
    t = input.nextInt();

    L = hitungluas(p, l);
    System.out.println("Luas Persegi panjang adalah "+L);

    vol = hitungVolume(t, p, l);
    System.out.println("Volume balok adalah " + vol);

   
}
}
