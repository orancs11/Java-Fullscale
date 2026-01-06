package Application;

import Interface.Bar;
import Interface.SceneBuilder;
import Logic.Utilities;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App
{
    public static void main( String[] args ) {
        SceneBuilder sceneBuilder = new SceneBuilder(1000, 1000);
        sceneBuilder.display();
    }
}
