/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DispositivoElectronicoDeConsumo.Computadora;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author 01806
 */
public class ComputadoraUI extends Canvas {
     Frame canvas;
    ImageCanvas imagen_computadora;
    ImageCanvas imagen_microprocesador;
    public ComputadoraUI(Computadora mi_computadora)
    {
    imagen_computadora = new ImageCanvas("Imagenes/computadora.png",10,10,100,100);
    imagen_microprocesador =  new ImageCanvas("Imagenes/microprocesador.jpg",100,10,100,100);
    canvas = new Frame();
    canvas.add(this);
    canvas.setSize(500,500);
    addMouseListener(
    new MouseAdapter(){
        
    @Override
    public void mousePressed(MouseEvent e)
    { 
    if(imagen_computadora.getHitBox().contains(e.getPoint()))System.out.println(mi_computadora); 
    if(imagen_microprocesador.getHitBox().contains(e.getPoint()))System.out.println(mi_computadora.getCPU()); 
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
    g.drawImage(imagen_computadora.getImage(),10,10,100,100,this);
    g.drawImage(imagen_microprocesador.getImage(),100,10,100,100,this);
    }
}

