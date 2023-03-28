import java.util.InputMismatchException;
import java.util.Scanner;

public class KDVHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar = 0.0;
        double kdvOrani = 0.0;

        while (true) {
            try {
                System.out.print("Lütfen tutarı giriniz: ");
                tutar = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Lütfen geçerli bir tutar giriniz.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Lütfen KDV oranını giriniz (örn: 0.18): ");
                kdvOrani = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Lütfen geçerli bir KDV oranı giriniz.");
                scanner.next();
            }
        }

        double kdvTutari = tutar * kdvOrani;
        double toplamTutar = tutar + kdvTutari;

        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}