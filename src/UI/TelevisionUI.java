/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Television;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class TelevisionUI{
    
    public TelevisionUI(Television mi_television,CanvasUI canvas,int x ,int y,int w,int h)
    {
    ImageForCanvas imagen_tv = new ImageForCanvas("Imagenes/television.jpg",x,y,w,h);
    PantallaUI imagen_pantalla = new PantallaUI(mi_television.getPantalla(),canvas,x+100,y,w,h);
    canvas.addComponent(imagen_tv);
    canvas.addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_tv.getHitBox().contains(e.getPoint()))System.out.println(mi_television); 
    }
    
    });
    }
    
    
}

