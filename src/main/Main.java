package main;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.ColumnConstraints;


public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        TextField height_text = new TextField();
        TextField length_text = new TextField();
        Label label_square = new Label();
        Label label_perimeter = new Label();
        Label label_length = new Label("Длинна");
        Label label_height = new Label("Высота");
        Button btn_square = new Button("Площадь");
        Button btn_perimeter = new Button("Периметр");
        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(90));
        root.getColumnConstraints().add(new ColumnConstraints(250));
        root.getColumnConstraints().add(new ColumnConstraints(70));
        GridPane.setMargin(btn_square, new Insets(10));
        GridPane.setMargin(btn_perimeter, new Insets(10));
        GridPane.setHalignment(label_length, HPos.CENTER);
        GridPane.setHalignment(label_height, HPos.CENTER);
        GridPane.setHalignment(btn_perimeter, HPos.CENTER);
        GridPane.setHalignment(label_perimeter, HPos.RIGHT);
        root.add(label_length,0,0);
        root.add(label_height,0,1);
        root.add(btn_square,0,2);
        root.add(btn_perimeter,1,2);
        root.add(length_text,1,0);
        root.add(height_text,1,1);
        root.add(label_square,1,2);
        root.add(label_perimeter,1,2);
        btn_square.setOnAction(actionEvent -> {
            int a = Integer.parseInt(length_text.getText());
            int b = Integer.parseInt(height_text.getText());
            double c = a*b;
            label_square.setText(""+c);
        });
        btn_perimeter.setOnAction(actionEvent -> {
            int a = Integer.parseInt(length_text.getText());
            int b = Integer.parseInt(height_text.getText());
            double c = 2*(a + b);
            label_perimeter.setText(""+c);
        });
        primaryStage.setTitle("Laba 1");
        primaryStage.setScene(new Scene(root, 350, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
