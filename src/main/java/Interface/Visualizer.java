package Interface;


import javax.swing.*;

public class Visualizer extends JFrame{

    public Visualizer(String title, int width, int height){
        super(title.isEmpty() ? "Visualizer" : title);
        this.setSize(width, height);
    }
    public void display(){
        this.setVisible(true);
    }

}
