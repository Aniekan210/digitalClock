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
    protected boolean isPm;
    
    public ClockProgram(int hours, int minutes, int seconds, boolean isPm)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isPm = isPm;
    }
    
    public ClockProgram()
    {
        this(12,0,0,false);
    }
    
    public boolean getIsPm() { return isPm; }
    
    public int getHours() { return hours; }
    
    public int getMinutes() { return minutes; }
    
    public int getSeconds() { return seconds; }
    
    public void inc()
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
}
