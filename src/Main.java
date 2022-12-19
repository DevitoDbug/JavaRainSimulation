import javax.swing.*;

public class Main {


    public static void main  (String[] args) {
        PanelClass panel = new PanelClass();
        JFrame frame = new JFrame("Rain Simulation");

        panel.setBounds(0,0,1000,700);
        frame.add(panel);

        frame.setLayout(null);
        frame.setBounds(200 , 0 , 1000 , 700 );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}