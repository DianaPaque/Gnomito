/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnome.elements;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public abstract class Apple extends Sprite{

    public Apple(int x, int y, int width, int height, Color color) {
        super(x, y, width, height,color);
    }
    
    public boolean checkHit(int x, int y){
        return x >= this.getX() && x <= this.getX() + this.getWidth() 
                && y >= this.getY() && y <= this.getY() + this.getHeight();
    }
    
}
