import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;
    String currentOperator="";
    float runningTotal=0;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton, clearButton;
    JButton multiButton;
    JButton subButton;
    JButton addButton;
   public Calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(500,200);

        displayLabel = new JLabel();
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        eightButton.addActionListener(this);
        jf.add(eightButton);


        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
        sixButton.addActionListener(this);
        jf.add(sixButton);
        
        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(330,130,80,80);
        divButton.setFont(new Font("Arial",Font.PLAIN,40));
        divButton.addActionListener(this);
        jf.add(divButton);

        multiButton=new JButton("x");
        multiButton.setBounds(330,230,80,80);
        multiButton.setFont(new Font("Arial",Font.PLAIN,40));
        multiButton.addActionListener(this);
        jf.add(multiButton);

        subButton=new JButton("-");
        subButton.setBounds(330,330,80,80);
        subButton.setFont(new Font("Arial",Font.PLAIN,40));
        subButton.addActionListener(this);
        jf.add(subButton);

        addButton=new JButton("+");
        addButton.setBounds(330,430,80,80);
        addButton.setFont(new Font("Arial",Font.PLAIN,40));
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton=new JButton("Clear");
        clearButton.setBounds(430,430,80,80);
        clearButton.setFont(new Font("Arial",Font.PLAIN,20));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if (e.getSource() == equalButton) {
            try {
        float newValue = Float.parseFloat(displayLabel.getText());

        // Perform the final operation
        if (!currentOperator.isEmpty()) {
            switch (currentOperator) {
                case "+":
                    runningTotal += newValue;
                    break;
                case "-":
                    runningTotal -= newValue;
                    break;
                case "*":
                    runningTotal *= newValue;
                    break;
                case "/":
                    if (newValue != 0) {
                        runningTotal /= newValue;
                    } else {
                        displayLabel.setText("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    displayLabel.setText("Invalid operation");
                    return;
            }
        }

        // Show final result
        displayLabel.setText(String.valueOf(runningTotal));
        currentOperator = ""; // Reset operator after calculation

    } catch (NumberFormatException ex) {
        displayLabel.setText("Error");
    }
    } else if (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == multiButton || e.getSource() == divButton) {
        try {
            float newValue = Float.parseFloat(displayLabel.getText());

            // Apply the current operator to update runningTotal
            if (!currentOperator.isEmpty()) {
                switch (currentOperator) {
                    case "+":
                        runningTotal += newValue;
                        break;
                    case "-":
                        runningTotal -= newValue;
                        break;
                    case "*":
                        runningTotal *= newValue;
                        break;
                    case "/":
                        if (newValue != 0) {
                            runningTotal /= newValue;
                        } else {
                            displayLabel.setText("Error: Division by zero");
                            return;
                        }
                        break;
                    default:
                        break;
                }
            } else {
                // First number input sets the runningTotal
                runningTotal = newValue;
            }

            // Set the new operator and clear for the next number
            if (e.getSource() == addButton) currentOperator = "+";
            if (e.getSource() == subButton) currentOperator = "-";
            if (e.getSource() == multiButton) currentOperator = "*";
            if (e.getSource() == divButton) currentOperator = "/";
            displayLabel.setText("");
            } catch (NumberFormatException ex) {
                    displayLabel.setText("Error");
                }
            } else if (e.getSource() == clearButton) {
                // Reset everything
                runningTotal = 0;
                currentOperator = "";
                displayLabel.setText("");
                isOperatorClicked = false;
            }
        }
}