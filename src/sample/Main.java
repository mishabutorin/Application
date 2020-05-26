package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Application");
        primaryStage.setScene(new Scene(root, 500, 475, Color.ORANGE));
//        add(new Field());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    } {
    }
}
