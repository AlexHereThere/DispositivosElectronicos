/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DispositivoElectronicoDeConsumo;

import DispositivoElectronico.DispositivoElectronico;

/**
 *
 * @author 01806
 */

abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo) {
    super(FABRICANTE, NUMEROSERIE, MARCA, NOMBRE, costo);
    encendido=false;
    }
   
   public void encender()
   {
    encendido=true;    
   }
   public void apagar()
   {
    encendido=false;  
   }
   public boolean esEncendido()
   {
   return encendido;    
   }
}