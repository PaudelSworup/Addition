package com.logintut;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addition extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JTextField jt1, jt2;
    JButton submit;

    Addition(){
        setTitle("User input");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);


        label1 = new JLabel("Enter 1st num:");
        label1.setBounds(20,50,100,20);
        c.add(label1);
        jt1=new JTextField();
        jt1.setBounds(130,50,100,20);
        c.add(jt1);

        label2 = new JLabel("Enter 2nd num:");
        label2.setBounds(20,100,100,20);
        c.add(label2);
        jt2=new JTextField();
        jt2.setBounds(130,100,100,20);
        c.add(jt2);

        label3 = new JLabel("hello");

        submit = new JButton("Calculate");
        submit.setBounds(130,200,80,20);
        c.add(submit);

        submit.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jt1.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "please enter first number");
            return;
        }
        if(jt2.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "please enter second number");
            return;
        }
        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = 0;

        if (e.getSource().equals(submit)) {
            c = a + b;
            label3.setText(String.valueOf(c));
            JOptionPane.showMessageDialog(new JFrame(), label3);

        }



    }
}


public class Main {

    public static void main(String[] args) {
	Addition a = new Addition();
    }
}
