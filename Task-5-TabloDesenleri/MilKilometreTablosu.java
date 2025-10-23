public class DonusumTablosu {
    public static void main(String[] args) {

        System.out.println("Mil     Kilometre");
        System.out.println("---------------------");

        double mil1 = 1, mil5 = 5, mil10 = 10, mil20 = 20, mil50 = 50;
        double oran = 1.609;

        System.out.println(mil1 + "       " + (mil1 * oran));
        System.out.println(mil5 + "       " + (mil5 * oran));
        System.out.println(mil10 + "      " + (mil10 * oran));
        System.out.println(mil20 + "      " + (mil20 * oran));
        System.out.println(mil50 + "      " + (mil50 * oran));
    }
}
