/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;


import ComponenteElectronico.Microprocesador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *modelo para el despliegue microprocesador 
 * @author ACR
 */
public class MicroprocesadorUI {
    ImageForCanvas imagen;
    public MicroprocesadorUI(Microprocesador mi_microprocesador,CanvasUI canvas,int x,int y,int w, int h) 
    {
    imagen = new ImageForCanvas("Imagenes/microprocesador.jpg",x,y,w,h);
    canvas.addComponent(imagen);
    canvas.addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen.getHitBox().contains(e.getPoint()))System.out.println(mi_microprocesador); 
    }
    
    });
    }
     
}
