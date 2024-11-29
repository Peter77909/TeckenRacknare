import java.util.Scanner;

public class TeckenRäknare {
    private int tecken = 0;
    private int rader = 0;
    private int ord = 0;
    private String längstaOrd = "";

    // Uppdatera tecken, rader, ord och längsta ord
    public void uppdatera(String rad) {
        tecken += rad.length();
        rader++;
        String[] ordArray = rad.split(" ");
        ord += ordArray.length;
        for (String ord : ordArray) {
            if (ord.length() > längstaOrd.length()) {
                längstaOrd = ord;
            }
        }
    }

    // Kontrollera om användaren skrivit "stop"
    public boolean ärStop(String rad) {
        return rad.equalsIgnoreCase("stop");
    }

    public int getTecken() {
        return tecken;
    }

    public int getRader() {
        return rader;
    }

    public int getOrd() {
        return ord;
    }

    public String getLängstaOrd() {
        return längstaOrd;
    }

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