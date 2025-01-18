import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
/**
 * Main driver program of the clock
 *
 * @author Aniekan Ekarika
 */
public class DigitalClock extends Application {

    @Override
    public void start(Stage primaryStage) 
    {
<<<<<<< HEAD
        TimeMode time = new TimeMode();
=======
        ClockProgram time = new ClockProgram(3,10,15,true);
        ClockFrame clock = new ClockFrame(20,20);
        PmIndicator indicator = new PmIndicator(480,35);
>>>>>>> parent of 4300571 (init)
        
        Pane root = new Pane();
        root.setStyle("-fx-background-color: black;");
        root.getChildren().addAll(time);

        Scene scene = new Scene(root, 535, 140);

        primaryStage.setTitle("DigitalClock");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
