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
    TextField resultDisplay = new TextField(5);
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
        frame.add(resultDisplay);
        firstNumber.addActionListener(this);
        secondNumber.addActionListener(this);
        resultDisplay.addActionListener(this);

        //Adaugam lista cu operatii matematice
        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");
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

        gbc.gridx = 3;
        gbc.gridy = 1;
        frame.add(resultDisplay, gbc);

        //Setam caracteristicile containerului frame
        frame.setSize(500, 250);
        frame.setTitle("Mini Calculator App");
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setVisible(true);

        //Adaugam functionalitatea de inchidere a ferestrei
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        firstNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char characters = e.getKeyChar();
                if(!(Character.isDigit(characters)) || (characters == KeyEvent.VK_BACK_SPACE) || (characters == KeyEvent.VK_DELETE)){
                    e.consume();
                }
            }
        });
        secondNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char characters = e.getKeyChar();
                if(!(Character.isDigit(characters)) || (characters == KeyEvent.VK_BACK_SPACE) || (characters == KeyEvent.VK_DELETE)){
                    e.consume();
                }
            }
        });
        resultDisplay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char characters = e.getKeyChar();
                if(!(Character.isDigit(characters)) || (characters == KeyEvent.VK_BACK_SPACE) || (characters == KeyEvent.VK_DELETE)){
                    e.consume();
                }
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Float firstInput = Float.parseFloat(String.valueOf(firstNumber));
            Float secondInput = Float.parseFloat(String.valueOf(secondNumber));

        } catch(NumberFormatException a) {

        }
    }
    public static void main(String[] args) {
        new Calculator() {
        };
    }
}