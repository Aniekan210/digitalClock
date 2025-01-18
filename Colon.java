import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * A class that is a colon between the numbers
 *
 * @author Aniekan Ekarika
 */
public class Colon extends Pane
{
    protected double x;
    protected double y;
    
    public Colon(double x, double y)
    {
        this.x = x;
        this.y = y;
        drawColon();
    }
    
    private void drawColon()
    {
        double width = 8;
        double height = 15;
        double space = 20;
        
        Rectangle rect1 = new Rectangle(x, y, width, height);
        Rectangle rect2 = new Rectangle(x, y+height+space, width, height);
        rect1.setFill(Color.rgb(255, 0, 0));
        rect2.setFill(Color.rgb(255, 0, 0));
        
        this.getChildren().addAll(rect1,rect2);
    }
}
