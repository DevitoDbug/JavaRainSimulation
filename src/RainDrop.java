public class RainDrop {

    double x ;
    double y ;
    int size ;
    double speed;

    public RainDrop(double x, double y, int size, double speed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    //updates the drops y position based on the speed of the drop
    void update ()
    {
        y  += speed ;
        speed += 0.03;//simulate gravity effect i.e drop moving faster as it goes down
    }
}
