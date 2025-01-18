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
    public TimeMode()
    {
        LocalTime now = LocalTime.now();
        ClockProgram time = new ClockProgram(now.getHour(),now.getMinute(),now.getSecond(),now.getNano() / 100_000_000);
        ClockFrame clock = new ClockFrame(20,20);
        PmIndicator indicator = new PmIndicator(480,35);
        
        this.getChildren().addAll(clock, indicator);
        
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
        timer.scheduleAtFixedRate(task, 0, 100);
    }
}
