/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Smartphone;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class SmartphoneUI {
    ImageForCanvas imagen_smartphone;
    public SmartphoneUI(Smartphone mi_smartphone,CanvasUI canvas,int x,int y,int w,int h)
    {
     imagen_smartphone = new ImageForCanvas("Imagenes/smartphone.jpg",x,y,w,h);
    MicroprocesadorUI imagen_microprocesador = new MicroprocesadorUI(
            mi_smartphone.getCPU(),canvas,x+100,y,w,h);
    SensorUI imagen_sensor = new SensorUI(mi_smartphone.getSensor(),canvas,x+200,y,w,h);
    PantallaUI imagen_pantalla = new PantallaUI(mi_smartphone.getPantalla(),canvas,x+300,y,w,h);
    canvas.addComponent(imagen_smartphone);
    canvas.addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_smartphone.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone); 
    }
    
    });
  
    }
    
   
}
