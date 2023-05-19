package sae.view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class EventWelcomeScreen implements EventHandler{
    private sae.Display dp;
    private WelcomeScreen welcomescreen;
    public EventWelcomeScreen(sae.Display d, WelcomeScreen wc){
        this.dp = d;
        this.welcomescreen = wc;
    }


    @Override
    public void handle(Event event) {

        if (event.getSource() instanceof Button){
            Button b = (Button) event.getSource();
            if (event.getSource().toString().contains("Créer la partie")) {
                welcomescreen.fermerWelcome();
                dp.openConfig();
            }
        }



    }
}
