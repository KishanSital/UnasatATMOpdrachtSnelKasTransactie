package sr.unasat.atm.services;

import javax.crypto.spec.PSource;

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

    private void calculatieNaValidatie( String message, double chosenAmount) {
        saldo -= chosenAmount;
        System.out.println( message + " Uw nieuw saldo bedraagt SRD " + saldo + ",-");
    }

    public void snelkas(int chosenAmount) {
        if (!issaldoToereikend(chosenAmount)) {
            System.out.println("het saldo is niet toereikend");
            return;
        }
        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie van ";
        switch (chosenAmount) {
            case 50:
                message += "SRD" + snelkasOpties[0] + ",-" ;
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 100:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[1] + ",-" ;
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 200:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[2] + ",-";
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 400:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[3] + ",-";
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 600:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[4] + ",-";
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 800:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[5] + ",-";
                calculatieNaValidatie( message, chosenAmount);
                break;
            case 1000:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[6] + ",-";
                calculatieNaValidatie( message, chosenAmount);
                break;
            default:
                System.out.println("Kies aub een snelkas bedrag");
        }


    }
}
