import javafx.scene.layout.Pane;
/**
 * A class that is a single digital number
 *
 * @author Aniekan Ekarika
 */
public class Number extends Pane
{
    protected int value;
    protected double x;
    protected double y;
    protected boolean[] state;
    
    public Number(double x, double y)
    {
        this(x,y,0);
    }
    
    public Number(double x, double y, int value)
    {
        this.x = x;
        this.y = y;
        initLines();
        setValue(value);
    }
    
    private void initLines()
    {
        int width = 40;
        int height = 5;
        int space = 2;
        
        DigitalLine line1 = new DigitalLine(x,y, height, width);
        DigitalLine line2 = new DigitalLine(x, y+width+height+2*space, height, width);
        DigitalLine line3 = new DigitalLine(x+height+space, y-height-space, width, height);
        DigitalLine line4 = new DigitalLine(x+height+space, y+width+space, width, height);
        DigitalLine line5 = new DigitalLine(x+height+space, y+2*width+height+3*space, width, height);
        DigitalLine line6 = new DigitalLine(x+height+width+2*space,y, height, width);
        DigitalLine line7 = new DigitalLine(x+height+width+2*space, y+width+height+2*space, height, width);
        
        this.getChildren().addAll(line1, line2, line3,line4,line5,line6,line7);
    }
     
    public void setValue(int value)
    {
        this.value = value;
        switch (value)
        {
            case 1:
                this.state = new boolean[]{false,false,false,false,false,true,true};
                break;
            case 2:
                this.state = new boolean[]{false,true,true,true,true,true,false};
                break;
            case 3:
                this.state = new boolean[]{false,false,true,true,true,true,true};
                break;
            case 4:
                this.state = new boolean[]{true,false,false,true,false,true,true};
                break;
            case 5:
                this.state = new boolean[]{true,false,true,true,true,false,true};
                break;
            case 6:
                this.state = new boolean[]{true,true,true,true,true,false,true};
                break;
            case 7:
                this.state = new boolean[]{false,false,true,false,false,true,true};
                break;
            case 8:
                this.state = new boolean[]{true,true,true,true,true,true,true};
                break;
            case 9:
                this.state = new boolean[]{true,false,true,true,false,true,true};
                break;
            default:
                this.state = new boolean[]{true,true,true,false,true,true,true};
        }
        drawNumber();
    }
    
    private void drawNumber()
    {
        for(int i=0; i<7; i++)
        {
            DigitalLine currentLine = (DigitalLine) this.getChildren().get(i);
            currentLine.setIsOn(state[i]);
        }
    }
}
