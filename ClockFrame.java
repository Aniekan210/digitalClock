import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * A class that acts as the clock layout and controller
 *
 * @author Aniekan Ekarika
 */
public class ClockFrame extends Pane
{
    protected double x;
    protected double y;
    protected Number hourTenth;
    protected Number hourUnit;
    protected Number minuteTenth;
    protected Number minuteUnit;
    protected Number secondTenth;
    protected Number secondUnit;
    
    public ClockFrame(double x, double y)
    {
        this.x = x;
        this.y = y;
        drawClock();
    }
    
    private void drawClock()
    {  
        double space = 14;
        double widthOfDigit = 54;
        double heightOfDigit = 98;
        double widthOfColon = 10;
        
        hourTenth = new Number(x,y);
        hourUnit = new Number(x+widthOfDigit+space,y);
        
        Colon colon1 = new Colon(x+2*(widthOfDigit+space), y+41/2);
        
        minuteTenth = new Number(x+2*widthOfDigit+3*space+widthOfColon,y);
        minuteUnit = new Number(x+3*widthOfDigit+4*space+widthOfColon,y);
        
        Colon colon2 = new Colon(x+4*widthOfDigit+5*space+widthOfColon, y+41/2);
        
        secondTenth = new Number(x+4*widthOfDigit+6*space+2*widthOfColon,y);
        secondUnit = new Number(x+5*widthOfDigit+7*space+2*widthOfColon,y);
        
        this.getChildren().addAll(hourTenth, hourUnit, colon1, minuteTenth, minuteUnit, colon2, secondTenth, secondUnit);
    }
    
    public void setTime(int hours,int minutes, int seconds)
    {        
        hourTenth.setValue(hours/10);
        hourUnit.setValue(hours%10);
        minuteTenth.setValue(minutes/10);
        minuteUnit.setValue(minutes%10);
        secondTenth.setValue(seconds/10);
        secondUnit.setValue(seconds%10);
    }
}
