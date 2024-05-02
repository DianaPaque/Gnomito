/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnome;
import gnome.elements.Apple;
import gnome.elements.Gnome;
import gnome.elements.HealthyApple;
import gnome.elements.PoisonApple;
import gnome.elements.Sprite;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Garden extends Sprite{
    
    private Gnome gnome;
    private ArrayList<Apple> apples;
    public static final int TYPE_HEALTHY = 1;
    public static final int TYPE_POISONED = 2;

    public Garden(int x, int y, int width, int height) {
        super(x, y, width, height, Color.GREEN);
        
        int px = (width - 80) / 2;
        int py = (height - 80) / 2;
                
        gnome = new Gnome(px, py);
        apples = new ArrayList<>();
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillRect(x, y, width, height);
        
        gnome.draw(g);
        for(Apple apple : apples){
            apple.draw(g);
        }
        
    }
    
    public void addApple(int type){
        
        int px = (int) (Math.random() * (width - HealthyApple.WIDTH));
        int py = (int) (Math.random() * (height - HealthyApple.HEIGHT));
        
        Apple apple = null;
        
        if(type == TYPE_HEALTHY){
            apple = new HealthyApple(px, py);
        }
        else if(type == TYPE_POISONED){
            apple = new PoisonApple(px, py);
        }
        else{
            throw new RuntimeException("Invalid apple type" + type);
        }
        apples.add(apple);
    }
    
    public Apple checkHitApple(int x, int y){
        for(Apple apple : apples){
            if(apple.checkHit(x, y)){
                return apple;
            }
        }
        return null;
    }
/*
    private void addHealtyApple(){
        int px = (int) (Math.random() * (width - HealthyApple.WIDTH));
        int py = (int) (Math.random() * (height - HealthyApple.HEIGHT));
        
        HealthyApple apple = new HealthyApple(px, py);
        Happles.add(apple);
    }
    
    private void addPoisonApple(){
        int px = (int) (Math.random() * (width - PoisonApple.WIDTH));
        int py = (int) (Math.random() * (height - PoisonApple.HEIGHT));
        
        PoisonApple apple2 = new PoisonApple(px, py);
        Papples.add(apple2);
    }
*/
    
    public void keyPressed(int code){
        if(code == KeyEvent.VK_UP){
            gnome.move(KeyEvent.VK_UP);
        }
        if(code == KeyEvent.VK_DOWN){
            gnome.move(KeyEvent.VK_DOWN);
        }
        if(code == KeyEvent.VK_LEFT){
            gnome.move(KeyEvent.VK_LEFT);
        }
        if(code == KeyEvent.VK_RIGHT){
            gnome.move(KeyEvent.VK_RIGHT);
        }
        if(code == KeyEvent.VK_H){
            addApple(TYPE_HEALTHY);
        }
        if(code == KeyEvent.VK_P){
            addApple(TYPE_POISONED);
        }
    }
    
    private void checkAppleCollision() {
    int gnomeX = gnome.getX();
    int gnomeY = gnome.getY();
    int gnomeWidth = gnome.getWidth();
    int gnomeHeight = gnome.getHeight();

    for (int i = 0; i < apples.size(); i++) {
        Apple apple = apples.get(i);
        int appleX = apple.getX();
        int appleY = apple.getY();
        int appleWidth = apple.getWidth();
        int appleHeight = apple.getHeight();

        // Check for overlapping rectangles (Axis Aligned Bounding Box - AABB)
        if (gnomeX < appleX + appleWidth &&
                gnomeX + gnomeWidth > appleX &&
                gnomeY < appleY + appleHeight &&
                gnomeY + gnomeHeight > appleY) {

            // Remove the apple and update gnome size
            apples.remove(i);
            if (apple instanceof HealthyApple) {
                gnome.aumentarTamano(); // Assuming aumentarTamano() increases width and height
            } else if (apple instanceof PoisonApple) {
                gnome.disminuirTamano(); // Assuming disminuirTamano() decreases width and height
            }

            // Exit loop after eating one apple
            break;
        }
    }
}
    
    public void mousePressed(int x, int y){
        Apple hit = checkHitApple(x, y);
        
        if(hit != null){
            apples.remove(hit);
        }
    }
 }
