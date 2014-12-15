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
import java.awt.Color;



public class Voronoi implements DrawListener {
    private static int SIZE = 512;
    private Point[][] nearest = new Point[SIZE][SIZE];  // which point is pixel (i, j) nearest?

    private Draw draw = new Draw();


    public Voronoi() {
        draw.setCanvasSize(SIZE, SIZE);
        draw.setXscale(0, SIZE);
        draw.setYscale(0, SIZE);
        draw.addListener(this);
        draw.show(20);
    }

    public void mousePressed(double x, double y) {
        Point p = new Point(x, y);
        System.out.println("Inserting:       " + p);

        // compare each pixel (i, j) and find nearest point
        draw.setPenColor(Color.getHSBColor((float) Math.random(), .7f, .7f));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Point q = new Point(i, j);
                if ((nearest[i][j] == null) || (q.distanceTo(p) < q.distanceTo(nearest[i][j]))) {
                    nearest[i][j] = p;
                    draw.filledSquare(i+0.5, j+0.5, 0.5);
                }
            }
        }

        // draw the point afterwards
        draw.setPenColor(Color.BLACK);
        draw.filledCircle(x, y, 4);
        draw.show(20);
        System.out.println("Done processing: " + p);
    }


    // save the screen to a file
    public void keyTyped(char c) { draw.save("voronoi" + c + ".png"); }

    // must implement these since they're part of the interface
    public void mouseDragged(double x, double y)  { }
    public void mouseReleased(double x, double y) { }


    // test client
    public static void main(String[] args) {
        new Voronoi();
    }
 
   
}
