package constans;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import constans.testIAD1.existence.Existence;
//import constans.testIAD1.existence.Existence010;

/** Uncomment these lines to instantiate other existences: */

//import constans.testIAD1.existence.Existence020;
//import constans.testIAD1.existence.Existence030;
//import constans.testIAD1.existence.Existence031;
//import constans.testIAD1.existence.Existence032;
import constans.testIAD1.existence.Existence040;
//import constans.testIAD1.existence.Existence050;

/**
 * The Main Class instantiates an Existence.
 * The Main Class runs the Existence step by step in a loop.
 * and prints the Existence's activity as it runs.
 */


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /** Change this line to instantiate another existence: */
        //Existence existence = new Existence010();
        //Existence existence = new Existence020();
        //Existence existence = new Existence030();
        //Existence existence = new Existence031();
        //Existence existence = new Existence032();
        Existence existence = new Existence040();
        //Existence existence = new Existence050();
        //Existence existence = new Existence051();

        /** Change this line to adjust the number of cycles of the loop:*/
        for(int i = 0 ; i < 20 ; i++){
            String stepTrace = existence.step();
            System.out.println(i + ": " + stepTrace);
        }
    }

}