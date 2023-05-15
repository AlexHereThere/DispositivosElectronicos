/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 01806
 */
public class ImageCanvas{
    private BufferedImage imagen;
    private final Rectangle HITBOX;
    
public ImageCanvas(String dir_imagen,int X,int Y,int W, int H)
{
    try{
       imagen=ImageIO.read(new File(dir_imagen));
       } catch (Exception e)
        {
        e.printStackTrace();
        }
    HITBOX= new Rectangle(X,Y,W,H);
 
}
public Rectangle getHitBox()
{
return HITBOX;    
}



public BufferedImage getImage()
{
return imagen;
}
}
    

