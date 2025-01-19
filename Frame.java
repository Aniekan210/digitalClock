import javafx.scene.layout.Pane;

/**
 * Write a description of class StopWatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frame extends Pane
{
    protected TimeMode clock;
    protected Stopwatch watch;
    protected boolean isClock;
    
    public Frame()
    {
        clock = new TimeMode();
        watch = new Stopwatch();
        isClock = true;
        drawFrame();
    }
    
    private void drawFrame() 
    {
        this.getChildren().addAll(clock);
    }
    
    public void toggle()
    {
        if(isClock) 
        {
            this.getChildren().remove(clock);
            this.getChildren().add(watch);
        }
        else
        {
            this.getChildren().remove(watch);
            this.getChildren().add(clock);
        }
    }
}
