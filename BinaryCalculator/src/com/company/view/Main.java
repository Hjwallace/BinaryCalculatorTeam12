package com.company.view;
import com.company.model.SingleIntegerCalculator;
import com.company.model.TwoIntegerCalculator;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    private JFrame frame;
    private JPanel panelFunctionsRight;
    private JPanel panelInputBox;
    private JPanel panelOutPut;
    private JPanel panelFunctionsLeft;
    private TwoIntegerCalculator TwointegerCalculator;
    private String firstBinary;
    private JTextArea inputField;
    private JTextArea outputField;
    private String operator;
    private boolean isBinary = true;
    public Main() {
        //Window Container
        frame = new JFrame();
        //Calculator Buttons and Functions
        JButton buttonAddition = new JButton("+");
        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                firstBinary = inputField.getText();
                inputField.setText("");
                operator = "+";
            }
        });
        JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                firstBinary = inputField.getText();
                inputField.setText("");
                operator = "-";
            }
        });
        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                firstBinary = inputField.getText();
                inputField.setText("");
                operator = "*";
            }
        });
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                firstBinary = inputField.getText();
                inputField.setText("");
                operator = "/";
            }
        });
        JButton buttonToggle = new JButton("Toggle Binary/Decimal");
        buttonToggle.setEnabled(false);
        buttonToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputField.setText(TwoIntegerCalculator.toggleBinaryDecimal(outputField.getText(), isBinary));
                isBinary = !isBinary;
            }
        });
        JButton buttonSquare = new JButton("x²");
        buttonSquare.setEnabled(false);
        buttonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                outputField = (JTextArea) panelOutPut.getComponent(1);
                SingleIntegerCalculator calculator = new SingleIntegerCalculator();
                int result = calculator.calculationOfBinary(inputField.getText(), false);
                outputField.setText(String.valueOf(result));
                buttonToggle.setEnabled(true);
            }
        });
        JButton buttonSquareRoot = new JButton("√ ");
        buttonSquareRoot.setEnabled(false);
        buttonSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                outputField = (JTextArea) panelOutPut.getComponent(1);
                SingleIntegerCalculator calculator = new SingleIntegerCalculator();
                int result = calculator.calculationOfBinary(inputField.getText(), true);
                outputField.setText(String.valueOf(result));
                buttonToggle.setEnabled(true);
            }
        });
        JButton buttonCompute = new JButton("=");
        buttonCompute.setEnabled(false);
        buttonCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputField = (JTextArea) panelOutPut.getComponent(1);
                String secondBinary = inputField.getText();
                outputField.setText(TwoIntegerCalculator.equals(firstBinary, secondBinary, operator));
                buttonToggle.setEnabled(true);
            }
        });
        JButton buttonClear = new JButton("C");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField = (JTextArea) panelInputBox.getComponent(1);
                outputField = (JTextArea) panelOutPut.getComponent(1);
                inputField.setText("");
                outputField.setText("");
                operator = null;
                buttonSquareRoot.setEnabled(false);
                buttonSquare.setEnabled(false);
                buttonToggle.setEnabled(false);
                buttonCompute.setEnabled(false);
            }
        });
        JButton buttonZero = new JButton("0");
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // if firstBinary is not null ->  { enable = }
                if (operator != null) buttonCompute.setEnabled(true);
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                String oldString = inputField.getText();
                String newString = oldString + "0";
                inputField.setText(newString);
                buttonSquareRoot.setEnabled(true);
                buttonSquare.setEnabled(true);
            }
        });
        JButton buttonOne = new JButton("1");
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator != null) buttonCompute.setEnabled(true);
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                String oldString = inputField.getText();
                String newString = oldString + "1";
                inputField.setText(newString);
                buttonSquareRoot.setEnabled(true);
                buttonSquare.setEnabled(true);
            }
        });
        //------------------------------------------------------------------------
        //Panels
        panelInputBox = new JPanel();
        panelInputBox.setLayout(new FlowLayout());
        panelInputBox.setBorder(new EmptyBorder(new Insets(20, 300, 20, 300)));
        panelFunctionsLeft = new JPanel();
        panelFunctionsLeft.setLayout(new GridLayout(3,4,15,15));
        panelFunctionsLeft.setBorder(BorderFactory.createEmptyBorder(25,150,25,50));
        panelFunctionsRight = new JPanel();
        panelFunctionsRight.setLayout(new GridLayout(3,4,15,15));
        panelFunctionsRight.setBorder(BorderFactory.createEmptyBorder(25,50,25,75));
        panelOutPut = new JPanel();
        panelOutPut.setLayout(new FlowLayout());
        panelOutPut.setBorder(BorderFactory.createEmptyBorder(25,300,75,300));
        //-------------------------------------------------------------------------------------------------
        JLabel inputLabel = new JLabel("Input: ");
        JTextArea inputField = new JTextArea(1,15);
        panelInputBox.add(inputLabel);
        panelInputBox.add(inputField);
        JLabel outputLabel = new JLabel("Output: ");
        JTextArea outputField = new JTextArea(1,15);
        inputField.setEditable(false);
        outputField.setEditable(false);
        panelOutPut.add(outputLabel);
        panelOutPut.add(outputField);
        panelFunctionsLeft.add(buttonZero);
        panelFunctionsLeft.add(buttonOne);
        panelFunctionsLeft.add(buttonAddition);
        panelFunctionsLeft.add(buttonSubtraction);
        panelFunctionsRight.add(buttonSquare);
        panelFunctionsLeft.add(buttonDivide);
        panelFunctionsLeft.add(buttonMultiplication);
        panelFunctionsRight.add(buttonSquareRoot);
        panelFunctionsRight.add(buttonCompute);
        panelFunctionsRight.add(buttonToggle);
        panelFunctionsRight.add(buttonClear);
        frame.add(panelInputBox,BorderLayout.NORTH);
        frame.add(panelFunctionsLeft, BorderLayout.BEFORE_LINE_BEGINS);
        frame.add(panelFunctionsRight,BorderLayout.CENTER);
        frame.add(panelOutPut,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Binary Calculator");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}