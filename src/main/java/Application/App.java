package Application;

import Interface.Bar;
import Interface.BarPanel;
import Interface.Visualizer;
import Logic.Sorter;
import javax.swing.*;
import java.awt.*;

/**


 */


public class App
{
    public static void main( String[] args ) {
        int[] numbers = new int[]{5, 2, 3, 4, 1, 8, 2, 12, 3, 15};
        System.out.println("Original version");
        Sorter.display(numbers);

        //Sorter.bubbleSort(numbers); Bubble Sort
        Sorter.selectionSort(numbers);
        System.out.println("Sorted version");
        Sorter.display(numbers);

        //Visualizer visualizer = new Visualizer("Visualizerr", 300, 400);
        //Bar bar = new Bar();
        //visualizer.display();
        //visualizer.add(bar);
        //visualizer.createBarPlot(numbers);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        JFrame frame = new JFrame("VISUALIZER");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //panel.add(new Bar(100, 200, 0, 0, Color.WHITE));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);


    }
}
