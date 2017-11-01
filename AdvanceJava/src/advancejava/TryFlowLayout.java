package advancejava;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TryFlowLayout {

    static JFrame aWindow = new JFrame("This is the FlowLayout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);

        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.blue);

        FlowLayout flow = new FlowLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(flow);

        
        for (int i = 1; i <= 6; i++) {
            content.add(new JButton("Press" + i));

        }
        aWindow.setVisible(true);
        aWindow.pack();

    }
}
