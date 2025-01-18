import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Main driver program of the clock
 *
 * @author Aniekan Ekarika
 */
public class DigitalClock extends Application {

    @Override
    public void start(Stage primaryStage) 
    {
        ClockProgram time = new ClockProgram(3,10,15,true);
        ClockFrame clock = new ClockFrame(20,20);
        PmIndicator indicator = new PmIndicator(480,35);
        
        Pane root = new Pane();
        root.setStyle("-fx-background-color: black;");
        root.getChildren().addAll(clock, indicator);

        Scene scene = new Scene(root, 535, 140);

        primaryStage.setTitle("DigitalClock");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                time.inc();
                int hours = time.getHours();
                int minutes = time.getMinutes();
                int seconds =  time.getSeconds();
                boolean isPm = time.getIsPm();
                clock.setTime(hours, minutes, seconds);
                indicator.setIsPm(isPm);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
