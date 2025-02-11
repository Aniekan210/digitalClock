/**
 * Clock program
 *
 * @author Aniekan Ekarika
 */
public class ClockProgram
{
    protected int hours;
    protected int minutes;
    protected int seconds;
    protected int deciSec;
    protected boolean isPm;
    
    public ClockProgram(int hours, int minutes, int seconds)
    {
        this.hours = hours % 12;
        if (this.hours == 0) {
            this.hours = 12;
        }
        this.minutes = minutes;
        this.seconds = seconds;
        this.deciSec = 0;
        this.isPm = hours >= 12;
    }
    
    public ClockProgram(boolean isDeciSec)
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.deciSec = 0;
        this.isPm = isDeciSec;
    }
    
    public ClockProgram()
    {
        this(0,0,0);
    }
    
    public boolean getIsPm() { return isPm; }
    
    public int getHours() { return hours; }
    
    public int getMinutes() { return minutes; }
    
    public int getSeconds() { return seconds; }
    
    public int getDeciSecs() { return deciSec; }
    
    public void incSec()
    {
        seconds = seconds + 1;
        if (seconds == 60)
        {
            seconds = 0;
            minutes = minutes + 1;
        }
        if (minutes == 60)
        {
            minutes = 0;
            hours = hours + 1;
            if (hours == 12)
            {
                isPm = !isPm;
            }
        }
        if (hours == 13)
        {
            hours = 1;
        }
    }
    
    public void incDeci()
    {
        deciSec = deciSec + 1;
        if (deciSec == 100)
        {
            deciSec = 0;
            seconds = seconds + 1;
        }
        if (seconds == 60) 
        {
            seconds = 0;
            minutes = minutes + 1;
        }
        if (minutes == 60)
        {
            minutes = 0;
            hours = hours + 1;
        }
    }
}
