package sae.view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Spinner;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WelcomeScreen extends Stage {
        private sae.Display display;
    public WelcomeScreen(sae.Display dp){
        super();
        this.display = dp;
        init();
    }
    public void init() {

        // Création d'une instance du fichier qui contrôle les Event
        EventWelcomeScreen lesevent = new EventWelcomeScreen(this.display, this);

        //text

        Font fontTitle = new Font("montserrat",80);
        Font fontLiCo = new Font("montserrat", 20);
        Font fontSubTitle = new Font("montserrat", 30);
        Font fontDimLab = new Font("montserrat",20);

        Text textTitle = new Text(50,50,"BIENVENUE");
        Text textColo = new Text("Nombre de Colonnes");
        Text textLigne = new Text("Nombre de Lignes");
        Text textSubTitle = new Text("Pour commencer à jouer, \n paramétrez votre partie.\n");
        Text textDimLab = new Text("Dimensions du labyrinthe :");
        Text textPassLigne = new Text("\n");

        textDimLab.setStyle("-fx-font-weight: bold;");
        textTitle.setStyle("-fx-font-weight: bold;");
        textLigne.setStyle("-fx-font-weight: bold;");
        textColo.setStyle("-fx-font-weight: bold;");

        textTitle.setFont(fontTitle);
        textColo.setFont(fontLiCo);
        textLigne.setFont(fontLiCo);
        textSubTitle.setFont(fontSubTitle);
        textDimLab.setFont(fontDimLab);
        textDimLab.setUnderline(true);




        //bouton

        Button CreateGame = new Button("Créer la partie");
        Button LoadGame = new Button("Charger la partie");
        // print.setTranslateX(250);
        //input.setTranslateX(250);

        // Ajout des events sur les boutons
        CreateGame.setOnMouseClicked(lesevent);

        //Spinner

        SpinnerValueFactory<Integer> ValueFactoryLigne = new SpinnerValueFactory.IntegerSpinnerValueFactory(3, 25, 10);
        SpinnerValueFactory<Integer> ValueFactoryColo = new SpinnerValueFactory.IntegerSpinnerValueFactory(3, 25, 10);

        final Spinner<Integer> coloSpin = new Spinner<Integer>();
        final Spinner<Integer> ligneSpin = new Spinner<Integer>();
        coloSpin.setValueFactory(ValueFactoryColo);
        ligneSpin.setValueFactory(ValueFactoryLigne);


        // hbox vbox
        VBox vboxMain = new VBox();
        VBox vboxTitle = new VBox();
        VBox vboxCoLi = new VBox();
        HBox hboxColo = new HBox();
        HBox hboxLigne = new HBox();
        VBox vboxButton = new VBox();

        Insets is50 = new Insets( 50);
        vboxMain.setPadding(is50);

        vboxTitle.setAlignment(Pos.CENTER);
        vboxCoLi.setAlignment(Pos.CENTER);
        hboxColo.setAlignment(Pos.CENTER);
        hboxLigne.setAlignment(Pos.CENTER);
        vboxButton.setAlignment(Pos.CENTER);

        vboxTitle.getChildren().setAll(textTitle,textSubTitle);

        hboxColo.getChildren().setAll(textColo,coloSpin);
        hboxLigne.getChildren().setAll(textLigne,ligneSpin);

        vboxCoLi.getChildren().setAll(hboxColo,hboxLigne);

        vboxButton.getChildren().setAll(CreateGame,LoadGame);



        vboxMain.getChildren().setAll(vboxTitle,textDimLab,vboxCoLi,textPassLigne,vboxButton);


        Scene scene = new Scene(vboxMain,600, 500);

        this.setTitle("SAE 201 - Mange moi si tu peux !");
        this.setScene(scene);
        this.show();
    }

    public void fermerWelcome(){
        this.close();
    }

}