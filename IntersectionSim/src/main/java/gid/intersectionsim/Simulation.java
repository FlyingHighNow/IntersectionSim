/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gid.intersectionsim;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Jakob
 */
public class Simulation 
{
    
    public Simulation()
    {
        
    }
    
    public void start()
    {
        JFrame frame = new JFrame("IntersectionSim");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        frame.setContentPane(pane);

        frame.setVisible(true);
    }
    
}
