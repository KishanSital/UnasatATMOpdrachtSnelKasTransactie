package sr.unasat.atm.services;

public class ATMService {

    /*public static void snelkas(int bedrag){
        int balans = 99999;
        System.out.println("Welkom bij de optie Snelkas, de bedragen die u kunt opnemen zijn :" +
                " 50, 100, 200, 400, 600, 800 en 1000 srd");
        if (bedrag == 50 || bedrag == 100 || bedrag == 200 || bedrag == 400 || bedrag == 600 || bedrag == 800 || bedrag == 1000){
            System.out.println("De bedrag die u heeft opgenomen is "+bedrag);
            balans -= bedrag;
            System.out.println("uw huidige balans bedraagt nu SRD: " + balans);

            while (balans >= 50){


            }
        } else{
            System.out.println("Uw gekozen bedrag voldoet niet aan de geboden bedragen " +
                    "probeer opnieuw");
            }
        }*/

    private static Integer[] snelkasOpties = {50, 100, 200, 400, 600, 800, 1000};

    public void snelkas(int chosenAmount) {
        String message = "Haal uw geld uit van et cashvak. U heeft gekozen voor de optie van ";
        switch (chosenAmount) {
            case 50:
                message += " SRD " + snelkasOpties[0] + " ,-";
                break;
            case 100:
                message += " SRD " + snelkasOpties[1] + " ,-";
                break;
            case 200:
                message += " SRD " + snelkasOpties[2] + " ,-";
                break;
            case 400:
                message += " SRD " + snelkasOpties[3] + " ,-";
                break;
            case 600:
                message += " SRD " + snelkasOpties[4] + " ,-";
                break;
            case 800:
                message += " SRD " + snelkasOpties[5] + " ,-";
                break;
            case 1000:
                message += " SRD " + snelkasOpties[6] + " ,-";
                break;
            default:
                System.out.println("Kies aub een snelkas bedrag");
        }
        System.out.println(message);
    }
}
