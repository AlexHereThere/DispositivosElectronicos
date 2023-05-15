/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Computadora;
import DispositivoElectronicoDeConsumo.Smartphone;
import DispositivoElectronicoDeConsumo.Television;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class TodoUI extends Canvas {
     Frame canvas;
     ImageCanvas imagen_tv;
     ImageCanvas imagen_pantalla_tv;
      
    ImageCanvas imagen_computadora;
    ImageCanvas imagen_microprocesador_pc;
    
    ImageCanvas imagen_smartphone;
    ImageCanvas imagen_microprocesador_s;
    ImageCanvas imagen_sensor_s;
    ImageCanvas imagen_pantalla_s;
     
     
    public TodoUI(Television mi_television, Computadora mi_computadora, Smartphone mi_smartphone)
    {
    imagen_tv = new ImageCanvas("Imagenes/television.jpg",10,10,100,100);
    imagen_pantalla_tv = new ImageCanvas("Imagenes/pantalla.jpg",100,10,100,100);
    
     imagen_computadora = new ImageCanvas("Imagenes/computadora.png",10,100,100,100);
    imagen_microprocesador_pc =  new ImageCanvas("Imagenes/microprocesador.jpg",100,100,100,100);
    
    imagen_smartphone = new ImageCanvas("Imagenes/smartphone.jpg",10,200,100,100);
    imagen_microprocesador_s = new ImageCanvas("Imagenes/microprocesador.jpg",100,200,100,100);
    imagen_sensor_s = new ImageCanvas("Imagenes/sensor.jpg",200,200,100,100);
    imagen_pantalla_s =  new ImageCanvas("Imagenes/pantalla.jpg",300,200,100,100);
    
    canvas = new Frame();
    canvas.setSize(500,500);
    canvas.add(this);
    addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_tv.getHitBox().contains(e.getPoint()))System.out.println(mi_television); 
    if(imagen_pantalla_tv.getHitBox().contains(e.getPoint()))System.out.println(mi_television.getPantalla()); 
    
    if(imagen_computadora.getHitBox().contains(e.getPoint()))System.out.println(mi_computadora); 
    if(imagen_microprocesador_pc.getHitBox().contains(e.getPoint()))System.out.println(mi_computadora.getCPU()); 
    
    if(imagen_smartphone.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone); 
    if(imagen_microprocesador_s.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getCPU());
    if(imagen_sensor_s.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getSensor());
      if(imagen_pantalla_s.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getPantalla());
    }
    
    });
    canvas.setVisible(true);
    }
    
    public void cerrar()
    {
    canvas.dispose();
    }
    
     @Override
    public void paint(Graphics g)
    {
     g.drawImage(imagen_tv.getImage(),10,10,100,100,this);
     g.drawImage(imagen_pantalla_tv.getImage(), 100,10,100,100, this);
     
     g.drawImage(imagen_computadora.getImage(),10,100,100,100, this);
     g.drawImage(imagen_microprocesador_pc.getImage(),100,100,100,100,this);
     
     g.drawImage(imagen_smartphone.getImage(),10,200,100,100,this);
     g.drawImage( imagen_microprocesador_s.getImage(),100,200,100,100,this);
     g.drawImage( imagen_sensor_s.getImage(),200,200,100,100,this);
     g.drawImage(imagen_pantalla_s.getImage(),300,200,100,100,this);
    }
}
