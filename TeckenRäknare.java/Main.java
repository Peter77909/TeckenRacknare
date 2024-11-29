import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeckenRäknare räknare = new TeckenRäknare();
        Scanner scanner = new Scanner(System.in);
        String rad;

        while (true) {
            System.out.println("Skriv något (eller 'stop' för att avsluta): ");
            rad = scanner.nextLine();
            if (räknare.ärStop(rad)) {
                break;
            }
            räknare.uppdatera(rad);
        }

        // Skriv ut resultat
        System.out.println("Antal rader: " + räknare.getRader());
        System.out.println("Antal tecken: " + räknare.getTecken());
        System.out.println("Antal ord: " + räknare.getOrd());
        System.out.println("Längsta ordet: " + räknare.getLängstaOrd());
    }
}
