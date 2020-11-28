package sr.unasat.atm.app;


import sr.unasat.atm.controller.LoginController;

public class Application {

        public static void main(String[] args) throws Exception {
            LoginController lc = new LoginController();
            lc.login("Kishan", "12345");
        }
    }

