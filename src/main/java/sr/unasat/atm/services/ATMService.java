package sr.unasat.atm.services;

public class ATMService {

    private static Integer[] snelkasOpties = {50, 100, 200, 400, 600, 800, 1000};
    private double saldo;

    public ATMService(double saldo) {
        this.saldo = saldo;
    }

    //maak snelkas keuze
    // controleer of het saldo toereikend is
    // indien saldo niet toereikend toon melding uw saldo is niet toereikend
    // indien saldo wel toereikend, retouneer gevraagd bedrag met correcte melding en update het saldo en geef aan wat over is


    private boolean issaldoToereikend(int chosenAmount) {
        return (saldo - chosenAmount >= 0);
    }

    private void calculatieNaValidatie(double saldo, double chosenAmount) {
        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie van ";
        saldo -= chosenAmount;
        System.out.println(message += "SRD" + snelkasOpties[0] + ",- Uw nieuw saldo bedraagt SRD " + saldo + ",-");
    }
    public void snelkas(int chosenAmount) {
        if (!issaldoToereikend(chosenAmount)) {
            System.out.println("het saldo is niet toereikend");
            return;
        }
        switch (chosenAmount) {
            case 50:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 100:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 200:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 400:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 600:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 800:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            case 1000:
                calculatieNaValidatie(saldo, chosenAmount);
                break;
            default:
                System.out.println("Kies aub een snelkas bedrag");
        }

    }
}
