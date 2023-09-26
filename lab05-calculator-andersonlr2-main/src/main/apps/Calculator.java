package main.apps;

import javax.swing.*;
import java.awt.*;

public class Calculator{

    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
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
        JTextField leftOperand = new JTextField(5);
        JTextField rightOperand = new JTextField(5);
        numPanel.add(leftOperand);
        numPanel.add(rightOperand);
        frame.add(numPanel,BorderLayout.CENTER);
    }

    private void initializeResults(){

    }

    private void initializeButtons(){
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");
    }

    private double getLeftNum(){
        return 1.0;
    }

    private double getRightNum(){
        return 1.0;
    }

    private void updateResult(double result){

    }

}