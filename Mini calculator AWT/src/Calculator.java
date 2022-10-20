import java.awt.*;
import java.awt.event.*;
abstract class Calculator extends Frame implements ActionListener {
    Frame frame = new Frame("Frame container");
    Label label = new Label("First number: ", Label.CENTER);
    Label anotherLabel = new Label("Second number: ", Label.CENTER);
    Label selectOperation = new Label("Select operation: ");
    Label result = new Label("Show result: ", Label.CENTER);

    TextField firstNumber = new TextField(5);
    TextField secondNumber = new TextField(5);
    Button calculate = new Button("Calculate");
    Choice operation = new Choice();
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    Calculator() {
        //Adaugam etichetele pe frame
        frame.add(label);
        frame.add(anotherLabel);
        frame.add(selectOperation);
        frame.add(result);

        //Adaugam campurile pentru introducerea valorilor numerice
        frame.add(firstNumber);
        frame.add(secondNumber);

        //Adaugam lista cu operatii matematice
        operation.add("+"); operation.add("-"); operation.add("*"); operation.add("/");
        frame.add(operation);

        //Adaugam butonul pentru calcul
        frame.add(calculate);

        //Setam layout-ul frame-ului
        frame.setLayout(layout);

        //Organiza afisarea componentelor
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(firstNumber, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(anotherLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(secondNumber, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        frame.add(selectOperation, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        frame.add(operation, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(calculate, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        frame.add(result, gbc);

        //Setam caracteristicile containerului frame
        frame.setSize(500, 250);
        frame.setTitle("Mini Calculator App");
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setVisible(true);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button calcul = (Button) e.getSource();
                try {
                    Float firstInput = Float.parseFloat(String.valueOf(firstNumber).formatted("%.2f"));
                    Float secondInput = Float.parseFloat(String.valueOf(secondNumber).formatted("%.2f"));

                    String resolution = (firstInput.isNaN() || secondInput.isNaN()) ? "Invalid argument.":"Continue";
                    System.out.println(resolution);

                } catch(NumberFormatException ignore) {
                    System.out.println("You added an invalid argument!");
                }
                System.out.println("Please add a numeric value.");
            }
        });

        //Adaugam functionalitatea de inchidere a ferestrei
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Calculator(){
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
    }
}