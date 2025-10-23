public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665; // Örnek saniye değeri

        // Saat, dakika ve saniyeyi hesapla
        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        // Sonucu formatlı olarak yazdır
        System.out.printf("%d saniye = %d:%02d:%02d%n", toplamSaniye, saat, dakika, saniye);
    }
}
