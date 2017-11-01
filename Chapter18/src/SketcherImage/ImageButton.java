/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SketcherImage;

import java.awt.BorderLayout;
import javafx.scene.control.ToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ImageButton {

    public ImageButton() {
    JFrame f = new JFrame("JToolBar Demo");
    JToolBar toolbar = new JToolBar("Applications");
    JButton btnCalendar = new JButton(new ImageIcon(getClass().getResource("/imag/Blue.gif")));
    JButton btnClock = new JButton(new ImageIcon(getClass().getResource("/imag/Red.gif")));
    JButton btnContacts = new JButton(new ImageIcon(getClass().getResource("/imag/Green.gif")));
    JButton btnMail = new JButton(new ImageIcon(getClass().getResource("/imag/Circle.gif")));
    JButton btnMessage = new JButton(new ImageIcon(getClass().getResource("/imag/Open.gif")));
    JButton btnPhone = new JButton(new ImageIcon(getClass().getResource("/imag/Yellow.gif")));
    
   toolbar.add(btnCalendar);
   toolbar.add(btnClock);
   toolbar.add(btnContacts);
   toolbar.add(btnMail);
   toolbar.add(btnMessage);
   toolbar.add(btnPhone);
   
   f.setLayout(new BorderLayout());
   f.getContentPane().add(toolbar, BorderLayout.PAGE_START);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   f.setSize(500, 200);
   f.setVisible(true);
    }
    public static void main(String[] args) {
        new ImageButton();
    }
   
}
