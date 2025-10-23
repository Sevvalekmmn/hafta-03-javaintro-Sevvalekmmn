public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevre (s)
        double s = (a + b + c) / 2;

        // Heron formülü ile alan hesapla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı Çevre (s): " + s);
        System.out.println("Alan: " + alan);
    }
}
