package com.company;

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
    private String binary1;
    private String operator;
    private String binary2;

    public Main() {

        //Window Container
        frame = new JFrame();

        //Calculator Buttons and Functions
        JButton buttonAddition = new JButton("+");
        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //count++;
                //label.setText("I'm testing " + count);
            }
        });

        JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //count--;
                //label.setText("I'm testing " + count);
            }
        });

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "*";
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                binary1 = inputField.getText();
                inputField.setText("");

            }
        });

        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 /*
                    ENTER DIVISION CODE HERE
                 */
            }
        });

        JButton buttonSquare = new JButton("x²");
        buttonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                    ADD SQUARE FUNCTION HERE
                 */
            }
        });

        JButton buttonSquareRoot = new JButton("√ ");
        buttonSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                    ADD SQUARE ROOT FUNCTION HERE
                 */
            }
        });

        JButton buttonCompute = new JButton("=");
        buttonCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                JTextArea outputfield = (JTextArea) panelOutPut.getComponent(1);
                binary2 = inputField.getText();
                if(operator.equals("*")){
                    int decimalValue1 = Integer.parseInt(binary1,2);
                    int decimalValue2 = Integer.parseInt(binary2,2);
                    int multipliedValue = decimalValue1 * decimalValue2;
                    outputfield.setText(Integer.toString(multipliedValue));
                }
            }
        });

        JButton buttonToggle = new JButton("Toggle Binary/Decimal");
        buttonToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                    CONVERT BINARY TO DECIMAL, VICE VERSA
                 */
            }
        });

        JButton buttonClear = new JButton("C");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                    CLEAR INPUT AND OUTPUT
                 */
            }
        });

        JButton buttonZero = new JButton("0");
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                String oldString = inputField.getText();
                String newString = oldString + "0";
                inputField.setText(newString);

            }
        });

        JButton buttonOne = new JButton("1");
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea inputField = (JTextArea) panelInputBox.getComponent(1);
                String oldString = inputField.getText();
                String newString = oldString + "1";
                inputField.setText(newString);
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



