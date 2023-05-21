/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import ComponenteElectronico.Pantalla;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class PantallaUI{
     ImageForCanvas imagen;
    public PantallaUI(Pantalla mi_pantalla,CanvasUI canvas,int x,int y,int w, int h)
    {
    imagen = new ImageForCanvas("Imagenes/pantalla.jpg",x,y,w,h);
    canvas.addComponent(imagen);
    canvas.addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen.getHitBox().contains(e.getPoint()))System.out.println(mi_pantalla); 
    }
    
    });
    canvas.setVisible(true);
    }
    
}
