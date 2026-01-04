package Application;

import Interface.Bar;
import Logic.Utilities;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame();
        JPanel inputPanel = new JPanel(new FlowLayout());
        JPanel upperPanel = new JPanel();
        JPanel labelPanel = new JPanel();
        upperPanel.setLayout(new BoxLayout(upperPanel, BoxLayout.Y_AXIS));
        JPanel barPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        JPanel mainPanel = new JPanel(new BorderLayout());

        JTextField inputField = new JTextField("Enter Number", 20);
        JButton sendButton = new JButton("Confirm");
        JLabel label = new JLabel();
        int[] tempArr = new int[]{0};

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String message = "";
                if(!Utilities.isNumericString(inputField.getText())){
                    message = "Please enter a numerical value (1 - 100)";
                    label.setText(message);
                }
                tempArr[0] = Utilities.convertInt(inputField.getText());
                System.out.println(tempArr[0]);
            }
        });

        int[] arr = new int[]{1, 25, 31, 4, 5, 6, 7, 8, 9, 10};

        for(int number : arr) {
            int width = 100;
            int height = number * 10;
            Bar bar = new Bar(width, height, 0, 25, Color.lightGray);
            barPanel.add(bar);
        }
        labelPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        upperPanel.add(inputPanel);
        upperPanel.add(labelPanel);

        mainPanel.add(upperPanel, BorderLayout.NORTH);
        mainPanel.add(barPanel, BorderLayout.SOUTH);

        frame.setSize(1000, 1000);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
