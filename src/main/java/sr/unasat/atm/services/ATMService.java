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

    public void snelkas(int chosenAmount) {
        if (!issaldoToereikend(chosenAmount)) {
            System.out.println("het saldo is niet toereikend");
            return;
        }
        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie van ";
        switch (chosenAmount) {
            case 50:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[0] + ",-" + " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 100:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[1] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 200:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[2] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 400:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[3] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 600:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[4] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 800:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[5] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            case 1000:
                saldo -= chosenAmount;
                message += "SRD" + snelkasOpties[6] + ",-"+ " Uw nieuw saldo bedraagt SRD " + saldo + ",-";
                break;
            default:
                message = "Kies aub een snelkas bedrag";
        }
        System.out.println(message);

    }
}
