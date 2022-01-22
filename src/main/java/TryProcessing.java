import com.sun.scenario.Settings;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int x = 0;
    public static int y = 0;
    public static int z = 0;
    public static int a = 0;

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        ellipse(x,100, DIAMETER,DIAMETER);
        ellipse(y,200,DIAMETER,DIAMETER);
        ellipse(z,300,DIAMETER,DIAMETER);
        ellipse(a,400,DIAMETER,DIAMETER);
        x++;
        y=y+2;
        z=z+3;
        a=a+4;
    }
    
    
}
