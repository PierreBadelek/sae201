package sae;


import javafx.application.Application;
import javafx.stage.Stage;
import sae.view.LabyConfig;
import sae.view.WelcomeScreen;

public class Display extends Application {
    WelcomeScreen welcs;
    @Override
    public void start(Stage stage) {
        WelcomeScreen welcs = new WelcomeScreen(this);
    }

    public void closeWelcome(){
        welcs.fermerWelcome();

    }
    public void openConfig(){
        LabyConfig lc = new LabyConfig();

    }


    public static void main(String[] args) {
        launch();
    }
}
