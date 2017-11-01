
package advancejava;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;


public class TryBorderLayout {
    static JFrame aWindow = new JFrame("Border Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);

        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.blue);

        BorderLayout border = new BorderLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(border);

        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button;
        
        content.add(button = new JButton("EAST"), BorderLayout.EAST);
        button.setBorder(edge);
        
        content.add(button = new JButton("WEST"), BorderLayout.WEST);
        button.setBorder(edge);
        
        content.add(button = new JButton("SOUTH"), BorderLayout.SOUTH);
        button.setBorder(edge);
        
        content.add(button = new JButton("NORTH"), BorderLayout.NORTH);
        button.setBorder(edge);
        
        content.add(button = new JButton("CENTER"), BorderLayout.CENTER);
        button.setBorder(edge);
        
        aWindow.setVisible(true);
        //aWindow.pack();

    }
}
