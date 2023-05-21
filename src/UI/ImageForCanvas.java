/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *clase para crear las imagenes con su hitbox
 * @author ACR
 */
public class ImageForCanvas{
    private BufferedImage imagen;
    private final Rectangle HITBOX;
    private final int POSITIONX;
    private final int POSITIONY;
    private final int WIDTH;
    private final int HEIGHT;
    
public ImageForCanvas(String dir_imagen,int X,int Y,int W, int H)
{
    try{
       imagen=ImageIO.read(new File(dir_imagen));
       } catch (Exception e)
        {
        e.printStackTrace();
        }
    HITBOX= new Rectangle(X,Y,W,H);
    POSITIONX=X;
    POSITIONY=Y;
    WIDTH=W;
    HEIGHT=H;
}
public Rectangle getHitBox()
{
return HITBOX;    
}

public int getPositionX()
{
return POSITIONX;    
}
public int getPositionY()
{
return POSITIONY;    
}
public int getWidth()
{
return WIDTH;    
}
public int getHeight()
{
return HEIGHT;
}

public BufferedImage getImage()
{
return imagen;
}
}
    

