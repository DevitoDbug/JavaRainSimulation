import javax.swing.*;

public class Main {


    public static void main  (String[] args) {
        PanelClass panel = new PanelClass();
        JFrame frame = new JFrame("Rain Simulation");

        frame.add(panel);

        frame.pack();
        frame.setBounds(200 , 50 , 1000 , 700 );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}