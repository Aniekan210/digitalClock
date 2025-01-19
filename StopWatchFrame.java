import javafx.scene.layout.Pane;
/**
 * Write a description of class StopWatchFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StopWatchFrame extends Pane
{
    protected double x;
    protected double y;
    protected Number hourTenth;
    protected Number hourUnit;
    protected Number minuteTenth;
    protected Number minuteUnit;
    protected Number secondTenth;
    protected Number secondUnit;
    protected Number deciSecTenth;
    protected Number deciSecUnit;
    
    public StopWatchFrame(double x, double y)
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
        
        Colon colon3 = new Colon(x+6*widthOfDigit+8*space+2*widthOfColon, y+41/2);
        
        deciSecTenth = new Number(x+7*widthOfDigit+9*space+3*widthOfColon,y);
        deciSecUnit = new Number(x+8*widthOfDigit+10*space+3*widthOfColon,y);
        
        this.getChildren().addAll(hourTenth, hourUnit, colon1, minuteTenth, minuteUnit, colon2, secondTenth, secondUnit, colon3, deciSecTenth, deciSecUnit);
    }
    
    public void setTime(int hours, int minutes, int secs, int deci)
    {
        hourTenth.setValue(hours/10);
        hourUnit.setValue(hours%10);
        minuteTenth.setValue(minutes/10);
        minuteUnit.setValue(minutes%10);
        secondTenth.setValue(secs/10);
        secondUnit.setValue(secs%10);
        deciSecTenth.setValue(deci/10);
        deciSecUnit.setValue(deci%10);
    }
}
