import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class Calculator extends Frame {

    public static void main(String[] args) {
        Frame frame= new Frame();
        frame.setTitle("Mini Calculator App");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setBackground(Color.GRAY);

        Button calculeaza = new Button("Calculeaza");
        calculeaza.setPreferredSize(new Dimension(100, 25));
        frame.add(calculeaza);

        GridBagLayout gridBagLayout = new GridBagLayout();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}