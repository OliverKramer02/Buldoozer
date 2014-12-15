/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voronoi;

/**
 *
 * @author Olli
 */
public interface DrawListener {
    
    public void mousePressed (double x, double y);
    public void mouseDragged (double x, double y);
    public void mouseReleased(double x, double y);
    public void keyTyped(char c);


}
