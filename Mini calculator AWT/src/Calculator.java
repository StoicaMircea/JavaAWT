import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class Calculator extends Frame {

    public static void main(String[] args) {
        Frame frame= new Frame();
        frame.setTitle("Mini Calculator App");
        frame.setVisible(true);
        frame.setSize(500,500);

        LayoutManager gridBagLayout = new GridBagLayout();
        frame.setLayout(gridBagLayout);

        Label firstNumber = new Label("Add a number");
        frame.add(firstNumber);

        TextField numar1 = new TextField();
        frame.add(numar1);

        Label secondNumber = new Label("Add another number");
        frame.add(secondNumber);

        TextField numar2 = new TextField();
        frame.add(numar2);

        Choice operatie = new Choice();
        operatie.add("+"); operatie.add("-");
        operatie.add("*"); operatie.add("/");
        frame.add(operatie);

        Button calcul = new Button("Calculate");
        frame.add(calcul);

        Label result = new Label("Result is");
        frame.add(result);

        GridBagConstraints afisare;

        afisare = new GridBagConstraints();
        afisare.gridx = 0;
        afisare.gridy = 0;
        frame.add(firstNumber, afisare);

        afisare = new GridBagConstraints();
        afisare.gridx = 0;
        afisare.gridy = 1;
        afisare.gridwidth = 50;
        afisare.gridheight = 50;
        frame.add(numar1, afisare);

        afisare = new GridBagConstraints();
        afisare.gridx = 1;
        afisare.gridy = 0;
        frame.add(secondNumber, afisare);

        afisare = new GridBagConstraints();
        afisare.gridx = 1;
        afisare.gridy = 1;
        afisare.gridwidth = 50;
        afisare.gridheight = 50;
        frame.add(numar2, afisare);

        afisare = new GridBagConstraints();
        afisare.gridx = 2;
        afisare.gridy = 1;
        frame.add(operatie, afisare);

        afisare = new GridBagConstraints();
        afisare.gridx = 3;
        afisare.gridy = 0;
        frame.add(result, afisare);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}