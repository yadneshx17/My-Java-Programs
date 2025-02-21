package SwingGui;


//import javax.swing.BorderFactory;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import javax.swing.JLabel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// https://introcs.cs.princeton.edu/java/15inout/GUI.java.html

public class ClickCounts implements ActionListener {

    private int clicks  = 0;
    private JFrame frame = new JFrame(); // window
    private JLabel label = new JLabel("Number of Clicks: ");
    private JPanel panel;


    public ClickCounts() {

        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        panel = new JPanel(); // layout
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Gui");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new ClickCounts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of Clicks: " + clicks);
    }
}