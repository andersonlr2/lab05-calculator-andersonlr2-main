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

    }

    private void initializeResults(){

    }

    private void initializeButtons(){

    }

    private double getLeftNum(){

    }

    private double getRightNum(){

    }

    private void updateResult(double result){

    }

}