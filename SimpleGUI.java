package com.company;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JButton upmoney = new JButton("пополнить счет");
    private JButton awaymoney = new JButton("перевести деньги");
    private JButton outmoney = new JButton("снять деньги");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel ("Номер счета:");
    private JRadioButton radio1 = new JRadioButton ("delete:");
    private JRadioButton radio2 = new JRadioButton ("add:");



    public  SimpleGUI (){
        super("Счета");
        this.setBounds(500, 500, 1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(15,10,10,10));
        container.add(label);
        container.add(input);



        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);



        button.addActionListener(new ButtonEventListener ());
        container.add(button);
        upmoney.addActionListener(new UpmoneyEventLisitener ());
        container.add(upmoney);
        awaymoney.addActionListener(new AwaymoneyEventLisitener ());
        container.add(awaymoney);
        outmoney.addActionListener(new OutmoneyEventLisitener ());
        container.add(outmoney);


    }



    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
           // message += "Button was pressed \n";
            message += "номер счета " + input.getText() + "\n";
            message += (radio1.isSelected() ? "счет удале" : "счет создан") + "\n";
        //    message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }



    class UpmoneyEventLisitener implements ActionListener{
        public void actionPerformed (ActionEvent d){
            String message = "";
            message += "счет пополнен";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }



    class AwaymoneyEventLisitener implements ActionListener{
        public void actionPerformed (ActionEvent f){
            String message = "";
            message += "деньги переведены";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }



    class OutmoneyEventLisitener implements ActionListener{
        public void actionPerformed (ActionEvent j){
            String message = "";
            message += "деньги переведены";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }


}
