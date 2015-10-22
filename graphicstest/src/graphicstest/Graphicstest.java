/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphicstest;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rwalker
 */
public class Graphicstest extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JLabel label1 = new JLabel ("Test");
        
        // JText field = new JText(""); 
        
        JFrame main1 = new JFrame ();
        JMenu menu1 = new JMenu("Hello");
        
        main1.setSize(200,475);
        main1.setLocation(200,100);
        main1.add(label1);
        main1.add(menu1);
        main1.setVisible(true);
        
        
        
    }
    
}
