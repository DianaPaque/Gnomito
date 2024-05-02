/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gnomito;

import gnome.Garden;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author usuario
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }
    
    private Garden garden;
    
    public Garden getGarden(){
        return garden;
    }
    
    public void setGarden(Garden garden){
        this.garden = garden;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        garden.draw(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == 'q'){
            System.exit(0);
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_H | evt.getKeyCode() == KeyEvent.VK_P){
            garden.keyPressed(evt.getKeyCode());
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_UP |
           evt.getKeyCode() == KeyEvent.VK_DOWN|
           evt.getKeyCode() == KeyEvent.VK_LEFT|
           evt.getKeyCode() == KeyEvent.VK_RIGHT){
            garden.keyPressed(evt.getKeyCode());
        }
        
        repaint();
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int mx = evt.getX();
        int my = evt.getY();
        
        garden.mousePressed(mx, my);
        
        repaint();
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MainWindow window = new MainWindow();
        window.setSize(800, 600);
        window.setTitle("The gnome's game");
        Garden garden = new Garden(0, 0, window.getWidth(), window.getHeight());
        
        window.setGarden(garden);
        window.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
