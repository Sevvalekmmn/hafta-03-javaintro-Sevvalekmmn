public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 278; // Örnek TL miktarı
        int kalan = miktar;

        int yuzluk = kalan / 100;
        kalan = kalan % 100;

        int ellilik = kalan / 50;
        kalan = kalan % 50;

        int yirmilik = kalan / 20;
        kalan = kalan % 20;

        int beslik = kalan / 5;
        kalan = kalan % 5;

        int ikilik = kalan / 2;
        kalan = kalan % 2;

        int birlik = kalan;

        // Sonucu ekrana yazdır
        System.out.println(miktar + " TL = " 
            + yuzluk + "x100, "
            + ellilik + "x50, "
            + yirmilik + "x20, "
            + beslik + "x5, "
            + ikilik + "x2, "
            + birlik + "x1.");
    }
}
