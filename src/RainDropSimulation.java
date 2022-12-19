import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RainDropSimulation {
    Random r = new Random();

    double x = r.nextDouble(1000) ;
    double y  = -100;
    int size = r.nextInt(10);
    double speed = r.nextDouble(9);

    ArrayList<RainDrop> rainDrops ;

    RainDropSimulation()
    {
        rainDrops = new ArrayList<>();
    }


    void addRainDrop()
    {

            rainDrops.add(new RainDrop(x, y, size, speed));
            x = r.nextDouble(1000) ;
            size = r.nextInt(10);
            speed = r.nextDouble(1);

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

        System.out.println("\n\n");
        for (RainDrop rainDrop : rainDrops)
        {
            g.setColor(Color.cyan);
            g.fillRect((int) rainDrop.getX(), (int) rainDrop.getY(), rainDrop.getSize()/2, rainDrop.getSize());

        }
    }
}
