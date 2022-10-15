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

        LayoutManager gridBagLayout = new GridBagLayout();
        frame.setLayout(gridBagLayout);


        //Adaugarea primelo numere
        TextField primulNumar = new TextField("Add first number:");
        frame.add(primulNumar);

        TextField numarSecund = new TextField("Add second number:");
        frame.add(numarSecund);

        //Selectarea operatiei matematice
        Choice operatie = new Choice();
        operatie.add("+");
        operatie.add("-");
        operatie.add("*");
        operatie.add("/");
        frame.add(operatie);

        //Afisarea rezultatului


        GridBagConstraints gridBagConstraints;
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add(primulNumar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add(numarSecund, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        frame.add(operatie, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        //frame.add(, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        //frame.add(, gridBagConstraints);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}