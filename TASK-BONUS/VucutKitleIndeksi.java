public class VucutKitleIndeksiSabit {
    public static void main(String[] args) {
        double kilo = 54;      // Verilen kilo
        double boy = 1.70;     // Verilen boy (metre cinsinden)

        // BMI hesapla
        double bmi = kilo / (boy * boy);

        // Sonucu 2 ondalık basamakla yazdır
        System.out.printf("Kilonuz: %.1f kg, Boyunuz: %.2f m%n", kilo, boy);
        System.out.printf("Vücut Kitle İndeksiniz (BMI) = %.2f%n", bmi);
    }
}
