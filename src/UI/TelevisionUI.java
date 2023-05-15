/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

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
public class TelevisionUI extends Canvas {
     Frame canvas;
     ImageCanvas imagen_tv;
     ImageCanvas imagen_pantalla;
    public TelevisionUI(Television mi_television)
    {
    imagen_tv = new ImageCanvas("Imagenes/television.jpg",10,10,100,100);
    imagen_pantalla = new ImageCanvas("Imagenes/pantalla.jpg",100,10,100,100);
    canvas = new Frame();
    canvas.setSize(500,500);
    canvas.add(this);
    addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_tv.getHitBox().contains(e.getPoint()))System.out.println(mi_television); 
    if(imagen_pantalla.getHitBox().contains(e.getPoint()))System.out.println(mi_television.getPantalla()); 
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
     g.drawImage(imagen_pantalla.getImage(), 100,10,100,100, this);
    }
}

