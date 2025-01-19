import javafx.scene.layout.Pane;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
/**
 * A class that shows the digital clock's time mode
 *
 * @author Aniekan Ekarika
 */
public class TimeMode extends Pane
{
    protected LocalTime now;
    protected ClockProgram time;
    protected PmIndicator indicator;
    protected ClockFrame clock;
    
    public TimeMode()
    {
        start();
    }
    
    private void drawMode()
    {
        time = new ClockProgram(now.getHour(),now.getMinute(),now.getSecond());
        clock = new ClockFrame(20,20);
        indicator = new PmIndicator(480,35);
        this.getChildren().addAll(clock, indicator);
    }
        
    public void start()
    {
        now = LocalTime.now();
        drawMode();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                time.incSec();
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
