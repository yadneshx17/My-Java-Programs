package GUITUTO.FRAME;

import javax.swing.*;
import java.awt.*;

public class ChildFrame extends JFrame{

    ChildFrame() {
        this.setTitle("Our Gui Projects"); // sets title of frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of window/application.
        this.setResizable(false); // prevent window/frame from being resized.
        this.setSize(420, 420); // sets x and y dimensions of the frame/window
        this.setVisible(true); // makes frame visible.

        // Setting Window Icon (top left corner).
        ImageIcon image = new ImageIcon("Image.png"); // Create and ImageIcon.
        this.setIconImage(image.getImage()); // change icon of a Frame.
        this.getContentPane().setBackground(Color.CYAN); // Change colors Default Colors.
        // Custom Colors.
        this.getContentPane().setBackground(new Color(0, 0, 0)); // RGB ( R, G, B ) values.
    }
}
