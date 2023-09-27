package apps;

/**
 * @author Leah Anderson
 * @verison Sept 26, 2023
 */

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator{

    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final String NAME = "Calculator";
    private static final String RESULT_PREAMBLE = "Result = ";
    private static final String ERROR_MESSAGE = "Error";
    private JFrame frame;
    private JTextField leftOpField;
    private JTextField rightOpField;
    private JLabel resultLabel;

    public Calculator(){
        createFrame();
        initializeComponents();
        displayFrame();
    }
    
    /**@return returns the frame */
    public JFrame getFrame(){
        return this.frame;
    }

    private void createFrame(){
        frame = new JFrame();
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeComponents(){
        inititalizeInputs();
        initializeResults();
        initializeButtons();
    }

    private void displayFrame(){
        frame.pack();
        frame.setVisible(true);
    }

    private void inititalizeInputs(){
        JPanel numPanel = new JPanel();
        leftOpField = new JTextField(5);
        rightOpField = new JTextField(5);
        numPanel.add(leftOpField, BorderLayout.LINE_START);
        numPanel.add(rightOpField,BorderLayout.CENTER);
        frame.add(numPanel, BorderLayout.NORTH);
    }

    private void initializeResults(){
        JPanel resultPanel = new JPanel();
        this.resultLabel = new JLabel(RESULT_PREAMBLE);
        resultPanel.add(resultLabel);
        frame.add(resultPanel, BorderLayout.SOUTH);

    }

    private void initializeButtons(){
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                updateResult(getLeftNum()+getRightNum());
            }
        });
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                updateResult(getLeftNum()-getRightNum());
            }
        });
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                updateResult(getLeftNum()*getRightNum());
            }
        });
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (getRightNum() == 0){
                    updateResult(Double.NaN);
                }
                else{
                    updateResult(getLeftNum()/getRightNum());
                }
            }
        });
        JPanel buttons = new JPanel();
        buttons.add(addButton); buttons.add(subButton); 
        buttons.add(multButton); buttons.add(divButton);
        frame.add(buttons, BorderLayout.CENTER);
    }

    /**@return double returns the left number */
    private double getLeftNum(){
        double leftNum;
        String leftInput = leftOpField.getText();
        if(!leftInput.trim().equals("")){
            try{
                leftNum = Double.parseDouble(leftInput);
                return leftNum;
            }
            catch(Exception e){
                return Double.NaN;
            }
        }
        return Double.NaN;
    }
 
    /**@return double returns the left number */
    private double getRightNum(){
        double rightNum;
        String rightInput = rightOpField.getText();
        if(!rightInput.trim().equals("")){
            try{
                rightNum = Double.parseDouble(rightInput);
                return rightNum;
            }
            catch(Exception e){
                return Double.NaN;
            }
        }
        return Double.NaN;
    }

    /**@param result the result of previous math */
    private void updateResult(double result){
        if (((Double)result).isNaN()){
            this.resultLabel.setText(RESULT_PREAMBLE + ERROR_MESSAGE);
        }
        else{
            this.resultLabel.setText(RESULT_PREAMBLE + result);
        }
    }

    public static void main(String args[]){
        new Calculator();
    }

}