import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelClass extends JPanel implements ActionListener {
    RainDropSimulation rain = new RainDropSimulation();
    Timer timer ;
    PanelClass()
    {
        timer = new Timer (1 , this);
        timer.start();
        for(int i = 0 ; i<1000; i++)
            rain.addRainDrop();

        this.setBackground(Color.BLACK);
        this.setVisible(true);

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        rain.draw(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rain.updatePosition();
        repaint();

    }
}
