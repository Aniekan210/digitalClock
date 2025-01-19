import javafx.scene.layout.Pane;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class StopWatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stopwatch extends Pane
{
    protected ClockProgram stopwatch;
    protected StopWatchFrame frame;
    
    public Stopwatch()
    {
        this.stopwatch = new ClockProgram(true);
        this.frame = new StopWatchFrame(20,20);
        
        this.getChildren().add(frame);
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                stopwatch.incDeci();
                int hours = stopwatch.getHours();
                int minutes = stopwatch.getMinutes();
                int seconds =  stopwatch.getSeconds();
                int deci = stopwatch.getDeciSecs();
                frame.setTime(hours, minutes, seconds, deci);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 10);
    }
    
    
}
