
package SketcherImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SketcherImage {
    public static void main(String[] args) {
        JFrame f = new JFrame("ICon Button");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton b = new JButton(new ImageIcon("D:\\git-urmi\\CoreJava\\Chapter18\\src\\img\\untitled.png"));
         f.getContentPane().add(b);
         f.pack();
         f.setVisible(true);
    }
}
