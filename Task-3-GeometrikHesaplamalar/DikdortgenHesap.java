public class DikdortgenHesap {
    public static void main(String[] args) {
        double en = 4.5;
        double boy = 7.9;

        // Alan ve çevre hesapla
        double alan = en * boy;
        double cevre = 2 * (en + boy);

        // Sonuçları yazdır
        System.out.println("En: " + en);
        System.out.println("Boy: " + boy);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
