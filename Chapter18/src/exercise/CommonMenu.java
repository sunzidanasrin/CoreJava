
package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class CommonMenu {

    
    public static JMenuBar displayMenu(JFrame f) {
       JMenuBar menubar = new JMenuBar();
       JMenu menu1 = new JMenu("File");
       JMenuItem item1 = new JMenuItem("frame1");
       item1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new Frame1().setVisible(true);
           }
       
       });
       JMenuItem item2 = new JMenuItem("frame2");
       item2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new Frame2().setVisible(true);
           }
       
       });
       JMenuItem item3 = new JMenuItem("frame3");
       item3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
                System.exit(0);
           }
       
       });
       menu1.add(item1);
       menu1.addSeparator();
       menu1.add(item2);
       menu1.addSeparator();
       menu1.add(item3);
       menu1.addSeparator();
       menubar.add(menu1);
       f.setExtendedState(JFrame.MAXIMIZED_BOTH);
       return menubar;
    }
    
}
