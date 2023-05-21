/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Computadora;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * modelo para el despliegue de computadora
 * @author ACR
 */
public class ComputadoraUI{
    
    public ComputadoraUI(Computadora mi_computadora,CanvasUI canvas,int x,int y,int w,int h)
    {
    ImageForCanvas imagen_computadora = new ImageForCanvas("Imagenes/computadora.png",x,y,w,h);
    MicroprocesadorUI imagen_microprocesador =  new MicroprocesadorUI(mi_computadora.getCPU(),
            canvas,x+100,y,w,h);
    canvas.addComponent(imagen_computadora);
    canvas.addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_computadora.getHitBox().contains(e.getPoint()))System.out.println(mi_computadora); 
    }
    
    });
    canvas.setVisible(true);
    }
}

