
package ExampleBySir;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TryMenu {
    JMenuBar menuBar;
    JMenu menu1, menu2, submenu;
    JMenuItem item1, item2, item3, h1, h2;
    
    TryMenu(){
        JFrame f = new JFrame("Try Menu");
        JMenuBar menuBar = new JMenuBar();
        
        
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        item1 = new JMenuItem("New");
        item2 = new JMenuItem("Open");
        item3 = new JMenuItem("Exit");
        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.add(item3);
        
        menu2 = new JMenu("Help");
        submenu = new JMenu("Submenu");
        menu2.add(submenu);
        h1 = new JMenuItem("Live Support");
        h2 = new JMenuItem("Email Support");
        submenu.add(h1);
         menu2.addSeparator();
        submenu.add(h2);
         menu2.addSeparator();
        
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TryMenu();
    }
}
