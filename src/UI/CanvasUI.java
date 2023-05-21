/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author 01806
 */
public class CanvasUI extends Canvas {
    
    ArrayList<ImageForCanvas> imagenes = new ArrayList<>();
    
    public void addComponent(ImageForCanvas nuevo_elemento)
    {
    imagenes.add(nuevo_elemento);  
    }
    
    @Override
    public void paint(Graphics g)
    {
        for(ImageForCanvas imagen:imagenes)
        {
         g.drawImage(imagen.getImage(), imagen.getPositionX(),
            imagen.getPositionY(),
            imagen.getWidth(),imagen.getHeight(), this);
        }
   
      
    }
}
