
package advancejava;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class TryWinsow2ColorAndCursor {
    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);
        
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.getContentPane().setBackground(Color.red);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aWindow.setVisible(true);
    }
}
