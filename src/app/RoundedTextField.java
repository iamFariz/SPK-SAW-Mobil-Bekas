/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author nishom
 */
public class RoundedTextField extends JTextField implements MouseListener {

    boolean activate = false;
    
    public RoundedTextField() {
        Font fieldFont = new Font("Arial", Font.PLAIN, 20);
        setFont(fieldFont);
        setBackground(Color.white);
        setForeground(Color.gray.brighter());
        setColumns(30);
        setBorder(BorderFactory.createCompoundBorder(
                new CustomeBorder(),
                new EmptyBorder(new Insets(15, 25, 15, 75))));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (activate == false) {
           this.setText("");
        }
        activate = true;
        this.setForeground(Color.black);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public void setActivate(boolean activate){
        this.activate = activate;
    }

    //border
    class CustomeBorder extends AbstractBorder {

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y,
                int width, int height) {
            // TODO Auto-generated method stubs
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(12));
            g2d.setColor(new Color(0,0,0,0.1F)); 
            g2d.drawRoundRect(x, y, width - 1, height - 1, 25, 25);
        }
    }

}
