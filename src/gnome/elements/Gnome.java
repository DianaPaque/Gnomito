/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnome.elements;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author usuario
 */
public class Gnome extends Sprite{
    
    //public static final int INITIAL_WIDTH = 80;
    //public static final int INITIAL_HEIGHT = 80;
    public static int width = 80;
    public static int height = 80;
    public static final int STEP = 10;

    public Gnome(int x, int y) {
        super(x, y, width, height, Color.MAGENTA);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public void move(int code){
        if(code == KeyEvent.VK_UP){
            y -= STEP;
        }
        if(code == KeyEvent.VK_DOWN){
            y += STEP;
        }
        if(code == KeyEvent.VK_LEFT){
            x -= STEP;
        }
        if(code == KeyEvent.VK_RIGHT){
            x += STEP;
        }
    }
    
    public void aumentarTamano(){
        width += 10;
        height += 10;
    }
    
    public void disminuirTamano(){
        width -= 10;
        height -= 10;
    }
    
}
