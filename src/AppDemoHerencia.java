

import ComponenteElectronico.Microprocesador;
import ComponenteElectronico.Pantalla;
import ComponenteElectronico.Sensor;
import DispositivoElectronicoDeConsumo.Computadora;
import DispositivoElectronicoDeConsumo.Smartphone;
import DispositivoElectronicoDeConsumo.Television;
import UI.CanvasUI;
import UI.ComputadoraUI;
import UI.SmartphoneUI;
import UI.TelevisionUI;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Clase para realizar todo lo que se pide de la practica
 * @author ACR
 */
public class AppDemoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
      ArrayList<Television> listaDeTVs = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      Frame ventana = new Frame();
      ventana.setSize(500, 500);
      ventana.setTitle("Dispositivos Electronicos");
      
      //smartphones
      Microprocesador cpu1=new Microprocesador(null,560,2500,
              "Dell","235-523123","infonavit","CPUnico",6500);
      Sensor sensor1=new Sensor(null,"Huella","punto X Y",
              50,"UABC","123-23.12-23","MexicoPower","sedsor",2450);
      Pantalla pantalla1=new Pantalla(null,480,
              650,"Steren","12341234","Nvidia","miramemas",1000);
      Smartphone celular1 = new Smartphone(cpu1,sensor1,pantalla1,1200,
              "Android","GalaxyGT234","Microsoft","GALAXER",12000);
      
     listaDeSmartphones.add(celular1); 
     
       Microprocesador cpu2=new Microprocesador(null,670,2200,
              "Adidas","235-5-23","BBVA","CPUSUPERA",8070);
      Sensor sensor2=new Sensor(null,"Huella","punto X Y",
              50,"Betoben","123-23.12-23","HP","sedsor",2000);
      Pantalla pantalla2=new Pantalla(null,700,
              650,"Marvel","1233121","AMD","MironsMirada",903);
      Smartphone celular2 =new Smartphone(cpu2,sensor2,pantalla2,1200,
              "Apple","11","Microsoft","IphoneYouPhone",30000);
      
      listaDeSmartphones.add(celular2);
      
      //teles
      Pantalla pantalla3=new Pantalla(null,1200,3000,
              "Dish","412-HG3","Reddit","Miridin",7000);
      Television tele1=new Television(pantalla3,"Movistar",
              "5623-3z","MexNet","tevisorchilo",8000);
      
      listaDeTVs.add(tele1);
      
       Pantalla pantalla4=new Pantalla(null,780,1000,
              "Microsoft","412-HG2","Facebook","MiraMax",9000);
      Television tele2=new Television(pantalla4,"Movistar",
              "5623-3z","Nike","televsele",12300);
      
      listaDeTVs.add(tele2);
      
      //computadora
       Microprocesador cpu3=new Microprocesador(null,1760,4300,
              "Nintendo","235-523GFRED","Danonino","CPU-to-you",76560);
       Computadora computadora1 = new Computadora(cpu3,5670,
               "Alien","25GFrD4","Duracell","GamerBoy",12000);
       
      for(Smartphone smartphone:listaDeSmartphones)
      {
          System.out.println(smartphone);    
          System.out.println(smartphone.getCPU());
          System.out.println(smartphone.getSensor());
          System.out.println(smartphone.getPantalla());
      }
      
      for(Television television:listaDeTVs)
      {
          System.out.println(television);
          System.out.println(television.getPantalla());
      }


    
     CanvasUI canvas = new CanvasUI();
     TelevisionUI T = new TelevisionUI(tele1,canvas,10,10,100,100);
     ComputadoraUI C = new ComputadoraUI(computadora1,canvas,10,100,100,100);
     SmartphoneUI S = new SmartphoneUI(celular2,canvas,10,200,100,100);
     ventana.add(canvas);
     ventana.setVisible(true);
     sc.nextLine();
     ventana.dispose();
    }
    
}
