package sr.unasat.atm.app;

import sr.unasat.atm.services.ATMService;

public class Application {
    public static void main(String[] args) {

        ATMService atmService = new ATMService(2000);

        atmService.snelkas(100);

        //   atmService.snelkas(1000);
    }
}
