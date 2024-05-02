/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnome.elements;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author usuario
 */
public class GhostApple extends Apple{

    public static final int WIDTH = 30;
    public static final int HEIGHT = 30;

    public GhostApple(int x, int y) {
        super(x, y, WIDTH, HEIGHT, Color.GRAY);
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
}
