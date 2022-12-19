import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RainDropSimulation {
    Random r = new Random();

    double x = r.nextDouble(0, 2000) ;
    double y  = r.nextDouble(-600, -100);

    double length = r.nextDouble(2 , 4);
    int size = r.nextInt(5, 10);

    double speed = r.nextDouble(4 , 10);

    ArrayList<RainDrop> rainDrops ;

    RainDropSimulation()
    {
        rainDrops = new ArrayList<>();
    }


    void addRainDrop()
    {

            rainDrops.add(new RainDrop(x, y, size, speed));
            x = r.nextDouble(0, 2000) ;
            size = r.nextInt(5, 10);
            speed = r.nextDouble(4 , 10);
            y  = r.nextDouble(-500, -100);


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
        //for (RainDrop rainDrop : rainDrops)
        for (int i = 0 ; i < rainDrops.size() ; i++)
        {
            g.setColor(Color.cyan);
            g.fillRect((int) rainDrops.get(i).getX(), (int) rainDrops.get(i).getY(),
                    rainDrops.get(i).getSize()/(int)length, rainDrops.get(i).getSize()+5);

            //Regenerating if we have reached the end of the panel
            if ((int) rainDrops.get(i).getY() > 800)
            {
                rainDrops.remove(i);
                rainDrops.add(new RainDrop(x, y, size, speed));
                x = r.nextDouble(0, 2000) ;
                size = r.nextInt(5, 10);
                speed = r.nextDouble(4 , 10);
                y  = r.nextDouble(-500, -100);

            }
        }

    }
}
