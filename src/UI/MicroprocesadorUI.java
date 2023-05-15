/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;


import ComponenteElectronico.Microprocesador;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author 01806
 */
public class MicroprocesadorUI extends Canvas {
    Frame canvas;
    ImageCanvas imagen;
    public MicroprocesadorUI(Microprocesador mi_microprocesador)
    {
    imagen = new ImageCanvas("Imagenes/microprocesador.jpg",10,10,100,100);
    canvas = new Frame();
    canvas.add(this);
    canvas.setSize(500,500);
    addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen.getHitBox().contains(e.getPoint()))System.out.println(mi_microprocesador); 
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
    g.drawImage(imagen.getImage(),10,10,100,100,this);
    }
}
