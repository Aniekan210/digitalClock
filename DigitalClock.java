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
        Frame frame = new Frame();
        
        Pane root = new Pane();
        root.setStyle("-fx-background-color: black;");
        root.getChildren().addAll(frame);

        Scene scene = new Scene(root, 535, 140);

        primaryStage.setTitle("DigitalClock");
        //primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
