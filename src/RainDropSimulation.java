import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RainDropSimulation {
    Random r = new Random();

    double x = r.nextDouble(1000) ;
    double y  = -100;
    int size = r.nextInt(10);
    double speed = r.nextDouble(5);

    ArrayList<RainDrop> rainDrops ;

    RainDropSimulation()
    {
        rainDrops = new ArrayList<>();
    }


    void addRainDrop()
    {
        for ( int i = 0 ; i < 1000  ; i++) {
            rainDrops.add(new RainDrop(x, y, size, speed));
            x = r.nextDouble(1000) ;
            size = r.nextInt(10);
            speed = r.nextDouble(1);
        }
    }

    //updating the postion of each and every raindrop


    void updatePosition ()
    {
        for (RainDrop rainDrop:rainDrops)
        {
            rainDrop.update();
        }
    }

    //drawing the raindrop


    void draw (Graphics  g)
    {

        for (RainDrop rainDrop : rainDrops)
        {
            System.out.println("Draw function x:"+rainDrop.x+" y:"+rainDrop.y);
            g.setColor(Color.white);
            g.fillRect((int) rainDrop.getX(), (int) rainDrop.getY(), rainDrop.getSize()/2, rainDrop.getSize());
        }
    }
}
