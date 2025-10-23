public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Kalem";
        String urun2 = "Defter";
        String urun3 = "Silgi";

        int miktar1 = 3;
        int miktar2 = 2;
        int miktar3 = 5;

        double fiyat1 = 7.5;
        double fiyat2 = 15.0;
        double fiyat3 = 4.0;

        double toplam1 = miktar1 * fiyat1;
        double toplam2 = miktar2 * fiyat2;
        double toplam3 = miktar3 * fiyat3;

        double genelToplam = toplam1 + toplam2 + toplam3;

        System.out.println("========================================");
        System.out.println("             HESAP ÖZETİ");
        System.out.println("========================================");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat", "Tutar");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urun1, miktar1, fiyat1, toplam1);
        System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urun2, miktar2, fiyat2, toplam2);
        System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urun3, miktar3, fiyat3, toplam3);
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10.2f%n", "", "", "TOPLAM:", genelToplam);
        System.out.println("========================================");
    }
}
