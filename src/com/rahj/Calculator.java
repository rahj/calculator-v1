/**
 * This is a simple calculator package in Java using Swing components
 *
 * September 21, 2020
 * by Reynaldo A. Hipolito
 */
package com.rahj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    private JFrame frame;
    private JPanel rootPanel;
    private JButton buttonMultiplication;
    private JButton buttonDivision;
    private JButton buttonAddition;
    private JButton buttonSubstraction;
    private JButton buttonClear;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button0;
    private JButton buttonEquals;
    private JLabel labelOutput;
    private JButton buttonPoint;
    private String label;
    private int labelLength = 10;
    private String labelValue;
    private boolean[] arithmetic = new boolean[4];
    private String answerStringValue;

    public Calculator()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //menudo
        JMenuBar menuBar        = new JMenuBar();
        JMenu fileMenu          = new JMenu("File");
        JMenu aboutMenu         = new JMenu("About");

        //menudo items
        JMenuItem fileItemClose = new JMenuItem("Close");
        JMenuItem aboutItemAuthor = new JMenuItem("Author");

        fileMenu.add(fileItemClose);
        aboutMenu.add(aboutItemAuthor);
        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);

        //menu items actions
        fileItemClose.addActionListener(this);
        aboutItemAuthor.addActionListener(this);

        this.frame = new JFrame();
        this.frame.setContentPane(rootPanel);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.pack();
        this.frame.setSize(400, 500);
        this.frame.setTitle("RAHJ v.1 Calculator");
        this.frame.setResizable(false);
        this.frame.setJMenuBar(menuBar);
        this.frame.setVisible(true);

        //button actions
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonMultiplication.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonAddition.addActionListener(this);
        buttonSubstraction.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonEquals.addActionListener(this);

        //removed the focus paint
        button0.setFocusPainted(false);
        button1.setFocusPainted(false);
        button2.setFocusPainted(false);
        button3.setFocusPainted(false);
        button4.setFocusPainted(false);
        button5.setFocusPainted(false);
        button6.setFocusPainted(false);
        button7.setFocusPainted(false);
        button8.setFocusPainted(false);
        button9.setFocusPainted(false);
        buttonMultiplication.setFocusPainted(false);
        buttonDivision.setFocusPainted(false);
        buttonAddition.setFocusPainted(false);
        buttonSubstraction.setFocusPainted(false);
        buttonClear.setFocusPainted(false);
        buttonPoint.setFocusPainted(false);
        buttonEquals.setFocusPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String buttonAction = e.getActionCommand();
        this.label          = this.labelOutput.getText();

        /**
         * Clear label output if it contains only single character with 0, x, /, + and -
         */
        switch (this.label) {
            case "0":
            case "x":
            case "/":
            case "+":
            case "-":
            case ".":
                this.clearLabelOutput();
                break;
            default:
                break;
        }

        switch (buttonAction) {
            case "0":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "0");
                break;

            case "1":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "1");
                break;

            case "2":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "2");
                break;

            case "3":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "3");
                break;

            case "4":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "4");
                break;

            case "5":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "5");
                break;

            case "6":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "6");
                break;

            case "7":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "7");
                break;

            case "8":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "8");
                break;

            case "9":
                //prevent string label length from more than the allowed label length
                if (this.labelOutput.getText().length() > this.labelLength) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + "9");
                break;

            case "x":
                this.arithmetic[0] = true;
                this.setLabelValue(this.labelOutput.getText());
                this.labelOutput.setText("x");
                break;

            case "/":
                this.arithmetic[1] = true;
                this.setLabelValue(this.labelOutput.getText());
                this.labelOutput.setText("/");
                break;

            case "+":
                this.arithmetic[2] = true;
                this.setLabelValue(this.labelOutput.getText());
                this.labelOutput.setText("+");
                break;

            case "-":
                this.arithmetic[3] = true;
                this.setLabelValue(this.labelOutput.getText());
                this.labelOutput.setText("-");
                break;

            case "Clear":
                this.labelOutput.setText("0");
                break;

            case ".":
                //find if the string already has a point
                if (this.labelOutput.getText().contains(".")) {
                    return;
                }

                this.labelOutput.setText(this.labelOutput.getText() + ".");
                break;
            case "=":
                if (this.labelOutput.getText().length() <= 0) {
                    this.labelOutput.setText("0");
                    return;
                }

                /**
                 * Calculate the arithmetic value
                 *
                 * arithmetic[0] = x
                 * arithmetic[1] = /
                 * arithmetic[2] = +
                 * arithmetic[3] = -
                 */
                if (this.arithmetic[0]) {
                    double firstValue  = Double.parseDouble(this.getLabelValue());
                    double secondValue = Double.parseDouble(this.labelOutput.getText());

                    double answerValue = (firstValue * secondValue);
                    this.answerStringValue = Double.toString(answerValue);
                }

                if (this.arithmetic[1]) {
                    double firstValue  = Double.parseDouble(this.getLabelValue());
                    double secondValue = Double.parseDouble(this.labelOutput.getText());

                    double answerValue = (firstValue / secondValue);
                    this.answerStringValue = Double.toString(answerValue);
                }

                if (this.arithmetic[2]) {
                    double firstValue  = Double.parseDouble(this.getLabelValue());
                    double secondValue = Double.parseDouble(this.labelOutput.getText());

                    double answerValue = (firstValue + secondValue);
                    this.answerStringValue = Double.toString(answerValue);
                }

                if (this.arithmetic[3]) {
                    double firstValue  = Double.parseDouble(this.getLabelValue());
                    double secondValue = Double.parseDouble(this.labelOutput.getText());

                    double answerValue = (firstValue - secondValue);
                    this.answerStringValue = Double.toString(answerValue);

                }

                if (this.answerStringValue.endsWith(".0")) {
                    this.answerStringValue = this.answerStringValue.replace(".0", "");
                }
                this.labelOutput.setText(this.answerStringValue);
                break;

            case "Close":
                System.exit(0);
                break;

            case "Author":
                this.labelOutput.setText(this.label);
                JOptionPane.showMessageDialog(this.frame, "Reynaldo A. Hipolito © 2020 \r\n rahj.1986@gmail.com \r\n", "Author", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                break;
        }

    }

    private void clearLabelOutput()
    {
        this.labelOutput.setText("");
    }

    public String getLabelValue()
    {
        return labelValue;
    }

    public void setLabelValue(String labelValue)
    {
        this.labelValue = labelValue;
    }
}
