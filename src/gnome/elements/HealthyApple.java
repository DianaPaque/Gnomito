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
public class HealthyApple extends Apple{
    
    public static final int WIDTH = 30;
    public static final int HEIGHT = 30;

    public HealthyApple(int x, int y) {
        super(x, y, WIDTH, HEIGHT, Color.RED);
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
}
