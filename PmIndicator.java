import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/**
 * A class that indicates am or pm
 *
 * @author Aniekan Ekarika
 */
public class PmIndicator extends Pane
{
    protected double x;
    protected double y;
    protected boolean isPm;
    protected Text am;
    protected Text pm;
    
    public PmIndicator(double x, double y)
    {
        this.x = x;
        this.y = y;
        am = new Text("AM");
        pm = new Text("PM");
        drawIndicator();
        setIsPm(false);
    }
    
    private void drawIndicator()
    {
        am.setX(x);
        am.setY(y);
        am.setFont(new Font(24));
        
        pm.setX(x);
        pm.setY(y + 50);
        pm.setFont(new Font(24));
        
        this.getChildren().addAll(am,pm);
    }
    
    public void setIsPm(boolean value)
    {
        if(value)
        {
            am.setFill(Color.rgb(64, 64, 64));
            pm.setFill(Color.rgb(255, 0, 0));
        }
        else
        {
            am.setFill(Color.rgb(255, 0, 0));
            pm.setFill(Color.rgb(64, 64, 64));
        }
    }
}
