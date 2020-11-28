package sr.unasat.atm.controller;


import sr.unasat.atm.services.ATMService;
import sr.unasat.atm.services.AuthenticationService;

public class LoginController {
    AuthenticationService as = new AuthenticationService();

    public LoginController() {
       this.as = new AuthenticationService();
    }

    public void login(String username, String password){

        try {
            as.login(username,password);
            System.out.println("Welkom op de dashboard " + username);

            ATMService atmService = new ATMService(2000000000);

            atmService.snelkas(1000);

            //   atmService.snelkas(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
