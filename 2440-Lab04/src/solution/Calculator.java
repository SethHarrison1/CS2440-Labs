package solution;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Calculator
{
    private JFrame frame;
    private JTextField rightOperand;
    private JTextField leftOperand;
    private JLabel resultLabel;

    public JFrame getFrame()
    {
        return frame;
    }

    public Calculator()
    {
        frame = new JFrame();
        frame.setTitle("calculator");
        frame.setLocation(100, 100);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");
        addButton.setName("addButton");
        subButton.setName("subButton");
        multButton.setName("multButton");
        divButton.setName("divButton");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(multButton);
        buttonPanel.add(divButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        JPanel textPanel = new JPanel();
        leftOperand = new JTextField(10);
        rightOperand = new JTextField(10);
        leftOperand.setName("leftOperand");
        rightOperand.setName("rightOperand");
        textPanel.add(leftOperand);
        textPanel.add(rightOperand);
        frame.add(textPanel, BorderLayout.NORTH);
        JPanel resultPanel = new JPanel();
        resultLabel = new JLabel("Result =");
        resultLabel.setName("resultLabel");
        frame.add(resultPanel, BorderLayout.WEST);
        resultPanel.add(resultLabel);
        addButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateClickedAdd();
            }
        });
        subButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateClickedSub();
            }
        });
        multButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateClickedMult();
            }
        });
        divButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateClickedDiv();
            }
        });
    }

    public void updateClickedAdd()
    {
        String left = leftOperand.getText();
        String right = rightOperand.getText();
        try
        {
            double leftDouble = Double.parseDouble(left);
            double rightDouble = Double.parseDouble(right);
            double total = leftDouble + rightDouble;
            resultLabel.setText("Result = " + total);
        }
        catch (Exception NumberFormatException)
        {
            resultLabel.setText("Result = Error");
        }
    }

    public void updateClickedSub()
    {
        String left = leftOperand.getText();
        String right = rightOperand.getText();
        try
        {
            double leftDouble = Double.parseDouble(left);
            double rightDouble = Double.parseDouble(right);
            double total = leftDouble - rightDouble;
            resultLabel.setText("Result = " + total);
        }
        catch (Exception NumberFormatException)
        {
            resultLabel.setText("Result = Error");
        }
    }

    public void updateClickedMult()
    {
        String left = leftOperand.getText();
        String right = rightOperand.getText();
        try
        {
            double leftDouble = Double.parseDouble(left);
            double rightDouble = Double.parseDouble(right);
            double total = leftDouble * rightDouble;
            resultLabel.setText("Result = " + total);
        }
        catch (Exception NumberFormatException)
        {
            resultLabel.setText("Result = Error");
        }

    }

    public void updateClickedDiv()
    {
        String left = leftOperand.getText();
        String right = rightOperand.getText();
        if (left.equals("0") || right.equals("0") || left.equals("")
            || right.equals(""))
        {
            resultLabel.setText("Result = Error");
        }
        else
        {
            try
            {
                double leftDouble = Double.parseDouble(left);
                double rightDouble = Double.parseDouble(right);
                double total = leftDouble / rightDouble;
                resultLabel.setText("Result = " + total);
            }
            catch (Exception NumberFormatException)
            {
                resultLabel.setText("Result = Error");
            }
        }
    }

    public static void main(String args[])
    {
        Calculator calc = new Calculator();
    }

}
