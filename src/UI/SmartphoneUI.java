/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Smartphone;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class SmartphoneUI extends Canvas {
     Frame canvas;
    ImageCanvas imagen_smartphone;
    ImageCanvas imagen_microprocesador;
    ImageCanvas imagen_sensor;
    ImageCanvas imagen_pantalla;
    public SmartphoneUI(Smartphone mi_smartphone)
    {
    imagen_smartphone = new ImageCanvas("Imagenes/smartphone.jpg",10,10,100,100);
    imagen_microprocesador =  new ImageCanvas("Imagenes/microprocesador.jpg",100,10,100,100);
    imagen_sensor = new ImageCanvas("Imagenes/sensor.jpg",200,10,100,100);
    imagen_pantalla = new ImageCanvas("Imagenes/pantalla.jpg",300,10,100,100);
    canvas = new Frame();
    canvas.add(this);
    canvas.setSize(500,500);
    addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_smartphone.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone); 
    if(imagen_microprocesador.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getCPU());
    if(imagen_sensor.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getSensor());
     if(imagen_pantalla.getHitBox().contains(e.getPoint()))System.out.println(mi_smartphone.getPantalla());
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
    g.drawImage(imagen_smartphone.getImage(),10,10,100,100,this);
    g.drawImage(imagen_microprocesador.getImage(),100,10,100,100,this);
    g.drawImage(imagen_sensor.getImage(),200,10,100,100,this);
    g.drawImage(imagen_pantalla.getImage(), 300, 10,100,100, this);
    }
}
