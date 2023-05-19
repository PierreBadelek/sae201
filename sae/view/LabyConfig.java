package sae.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabyConfig extends Stage {

    public LabyConfig(){
        super();
        init();
    }
    public void init() {


    	//Font
        
    	
    	Font fontTitle = new Font("montserrat",80);
    	Font fontSubTitle = new Font("montserrat", 30);
    	Font fontBase = new Font("montserrat", 20);
    	//text
    	
    	Text textTitle = new Text("Configurez votre partie");
    	Text textSubTitle = new Text("Placez les différents éléments sur la carte");
    	Text textRocher =new Text("Rocher");
    	Text textHerbe = new Text("Herbe");
    	Text textMarguerite = new Text("Marguerite");
    	Text textCactus = new Text("Castus");
    	
    	
    	textTitle.setFont(fontTitle);
    	textSubTitle.setFont(fontSubTitle);
    	

        //bouton

        



        //Spinner

        


        // hbox vbox
    	
    	VBox vboxMain = new VBox();
    	VBox vboxTitle = new VBox();
    	HBox hboxCorps = new HBox();
    	VBox vboxElement = new VBox();
    	VBox vboxGridPane= new VBox();
    	HBox hboxButton = new HBox();
    	
    	
    	vboxTitle.getChildren().setAll(textTitle,textSubTitle);
    	//vboxElement.getChildren().setAll(text)
    	hboxCorps.getChildren().setAll(vboxGridPane,vboxElement);
    	
    	
    	vboxMain.getChildren().setAll(vboxTitle,hboxCorps,hboxButton);
    	
    	
    	vboxTitle.setAlignment(Pos.CENTER);
        

        Scene scene = new Scene(vboxMain,950, 800);

        this.setTitle("SAE 201 - Mange moi si tu peux !");
        this.setScene(scene);
        this.show();
    }

}