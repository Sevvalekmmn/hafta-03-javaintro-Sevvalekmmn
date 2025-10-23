public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = Math.PI;

        // Alan hesapla
        double alan = pi * r * r;

        // Cevre hesapla
        double cevre = 2 * pi * r;

        // Sonuçları yazdır
        System.out.println("Yaricap: " + r);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
