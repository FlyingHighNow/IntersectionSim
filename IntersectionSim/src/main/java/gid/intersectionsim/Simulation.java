/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gid.intersectionsim;



import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author Jakob
 */
public class Simulation 
{
    
    public Simulation()
    {
        
    }
    
    public JFrame start()
    {
        JFrame frame = new JFrame();
        
        try {
            BufferedImage img = ImageIO.read(new File("src\\main\\java\\gid\\intersectionsim\\crossroads.png"));
            ImageIcon icon = new ImageIcon(img);
            
            JLabel label = new JLabel(icon);
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            panel.add(label);
            
      
            frame.add(panel);
            frame.setSize(1296,759);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return frame;
    }
}