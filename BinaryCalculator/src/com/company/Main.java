package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame;
    private JPanel panelBasicFunctions;
    private JPanel panelInputBoxes;
    private JPanel panelOutPut;

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
                /*
                    ENTER MULTIPLICATION CODE HERE
                 */

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

        JButton buttonSquare = new JButton("^2");
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
                /*
                    SAVE FIRST NUMBER, FIND OPERATION, GET SECOND NUMBER, DO MATH
                 */
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
                    CLEAR INPUT OUTPUT
                 */
            }
        });
        //------------------------------------------------------------------------

        //Panels
        panelInputBoxes = new JPanel();
        panelInputBoxes.setLayout(new GridLayout(1,3,5,150));
        panelInputBoxes.setBorder(new EmptyBorder(new Insets(20, 300, 20, 300)));

        panelBasicFunctions = new JPanel();
        panelBasicFunctions.setLayout(new GridLayout(3,4,15,15));
        panelBasicFunctions.setBorder(BorderFactory.createEmptyBorder(25,150,25,150));

        panelOutPut = new JPanel();
        panelOutPut.setLayout(new GridLayout(1,3,5,5));
        panelOutPut.setBorder(BorderFactory.createEmptyBorder(25,300,75,300));



        //-------------------------------------------------------------------------------------------------
        JLabel inputLabel = new JLabel("Input: ");
        JTextArea inputField = new JTextArea(1,15);
        panelInputBoxes.add(inputLabel);
        panelInputBoxes.add(inputField);

        JLabel outputLabel = new JLabel("Output: ");
        JTextArea outputField = new JTextArea(1,15);
        outputField.setEditable(false);
        panelOutPut.add(outputLabel);
        panelOutPut.add(outputField);

        panelBasicFunctions.add(buttonAddition);
        panelBasicFunctions.add(buttonSubtraction);
        panelBasicFunctions.add(buttonSquare);
        panelBasicFunctions.add(buttonDivide);
        panelBasicFunctions.add(buttonMultiplication);
        panelBasicFunctions.add(buttonSquareRoot);
        panelBasicFunctions.add(buttonCompute);
        panelBasicFunctions.add(buttonToggle);
        panelBasicFunctions.add(buttonClear);


        frame.add(panelInputBoxes,BorderLayout.NORTH);
        frame.add(panelBasicFunctions,BorderLayout.CENTER);
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
