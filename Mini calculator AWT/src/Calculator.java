import java.awt.*;
import java.awt.event.*;
abstract class Calculator extends Frame implements ActionListener {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame container");

        Label label = new Label("First number: ");
        Label anotherLabel = new Label("Second number: ");
        Label selectOperation = new Label("Select operation: ");
        Label result = new Label("Result is: ");

        frame.add(label);
        frame.add(anotherLabel);
        frame.add(selectOperation);
        frame.add(result);

        TextField firstNumber = new TextField(5);
        TextField secondNumber = new TextField(5);

        frame.add(firstNumber);
        frame.add(secondNumber);

        /*int numar1 = Integer.parseInt(String.valueOf(firstNumber));
        int numar2 = Integer.parseInt(String.valueOf(secondNumber));*/

        Choice operation = new Choice();
        operation.add("+"); operation.add("-"); operation.add("*"); operation.add("/");
        frame.add(operation);

        Button calculate = new Button("Calculate");
        frame.add(calculate);

        //Setam layout-ul frame-ului

        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
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

        gbc.gridx = 3;
        gbc.gridy = 1;
        frame.add(calculate, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 2;
        frame.add(result, gbc);

        frame.setSize(500, 500);
        frame.setTitle("Mini Calculator App");
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setVisible(true);

        firstNumber.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                TextField firstNumber = (TextField) e.getSource();
                int numar1 = Integer.parseInt(String.valueOf(firstNumber));
            }
        });

        secondNumber.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                TextField secondNumber = (TextField) e.getSource();
                int numar2 = Integer.parseInt(String.valueOf(secondNumber));
            }
        });
        calculate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}