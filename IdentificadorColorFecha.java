package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
public class IdentificadorColorFecha extends Application {
	public void start(Stage primaryStage) {
 
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");
        
        DatePicker datePicker = new DatePicker();
        ColorPicker colorPicker = new ColorPicker();
        
        Button confirmButton = new Button("Confirmar Seleccion");
        
        Text selectionText = new Text();
        
        confirmButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No seleccionada";
            Color selectedColor = colorPicker.getValue();
            selectionText.setText("Fecha seleccionada: " + selectedDate + "\nColor seleccionado: " + selectedColor);
            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor);
        });
        
            VBox vbox = new VBox(10); 
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton, selectionText);
        
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Identificador Color y Fecha");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
