package Application;

import Interface.Bar;

import javax.swing.*;
import java.awt.*;

/**


 */


public class App
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame();

        JPanel inputPanel = new JPanel(new FlowLayout());
        JPanel barPanel = new JPanel(new FlowLayout());
        JPanel mainPanel = new JPanel(new GridBagLayout());

        JTextField inputField = new JTextField("Enter Number", 40);
        JButton sendButton = new JButton("Confirm");
        Bar bar = new Bar(100, 100, 0, 0, Color.red);

        inputPanel.add(inputField);
        inputPanel.add(sendButton);

        barPanel.add(bar);

        mainPanel.add(inputPanel);
        mainPanel.add(barPanel);

        frame.setSize(1000, 1000);
        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
