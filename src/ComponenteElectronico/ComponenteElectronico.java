/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponenteElectronico;

import DispositivoElectronico.DispositivoElectronico;

/**
 *
 * @author 01806
 */
     public abstract class ComponenteElectronico extends DispositivoElectronico
    {   
     protected DispositivoElectronico esParteDe;   
     
     public ComponenteElectronico(DispositivoElectronico esParteDe,String FABRICANTE, 
             String NUMEROSERIE, String MARCA, String NOMBRE,float costo)
     {
     super(FABRICANTE,NUMEROSERIE,MARCA,NOMBRE,costo); 
     this.esParteDe=esParteDe;
     }
     /**
      * metodo para cambiar el dispositivo electronico al que pertenece
      * @param esParteDe 
      */
     public void CambiarDispositivoElectronico(DispositivoElectronico esParteDe)
     {
        this.esParteDe=esParteDe;
     }
     public DispositivoElectronico getDispositivoDueño() 
     {
       return esParteDe;
     }
    }

