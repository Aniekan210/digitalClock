import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * Class for a singular digital line
 *
 * @author Aniekan Ekarika
 */
public class DigitalLine extends Rectangle 
{
    protected double x;
    protected double y;
    protected double width;
    protected double height;
    protected boolean isOn;
    
    public DigitalLine(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isOn = true;
        drawLine();
    }
    
    public void setIsOn(boolean value)
    {
        this.isOn = value;
        drawLine();
    }
    
    private void drawLine()
    {   
        Color currentColor = isOn ? Color.rgb(255, 00, 00) : Color.rgb(64, 64, 64);
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height); 
        this.setFill(currentColor);
    }
}
