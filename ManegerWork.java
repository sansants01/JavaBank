package com.company;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ManegerWork extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel ("Клиент:");
    private JRadioButton radio1 = new JRadioButton ("delete:");
    private JRadioButton radio2 = new JRadioButton ("add:");




    public  ManegerWork (){
        super("Клиенты");
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



    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += input.getText() + "\n";
            message += (radio1.isSelected() ? "клиент удален" : "клиент добавлен") + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }





}
