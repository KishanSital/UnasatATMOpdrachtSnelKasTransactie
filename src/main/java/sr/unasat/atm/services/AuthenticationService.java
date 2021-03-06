package sr.unasat.atm.services;


import sr.unasat.atm.entities.Gebruiker;

import java.util.Arrays;
import java.util.List;

public class AuthenticationService {
    List<Gebruiker> gebruikerList;

    public AuthenticationService() {
        List<Gebruiker> gebruikerList = Arrays.asList(
                new Gebruiker("Kishan", "12345", true),
                new Gebruiker("Sital", "1234555", false)
                , new Gebruiker("Burgos", "597", false)
        );
        this.gebruikerList = gebruikerList;
    }

    public void login(String username, String password) throws Exception {
        for (Gebruiker gebruiker : gebruikerList) {
            if (gebruiker.getUsername().equals(username) && gebruiker.getPassword().equals(password)) {
                isSubscribed(gebruiker);
                return ;
            }
        }
        throw new Exception("Het inloggen is mislukt!");
    }

    public void isSubscribed(Gebruiker gebruiker) throws Exception {
        if(!gebruiker.getIsSubscribed()){
            throw new Exception("U heeft geen geldig abbonement!");
        }
    }
}
