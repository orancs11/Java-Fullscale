package Interface;

import javax.swing.*;
import java.awt.*;

public class BarPanel extends JPanel{
    private static final Color BACKGROUND_COLOR = Color.black;
    public BarPanel(){
        super();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        this.setBackground(BACKGROUND_COLOR);

    }
}
