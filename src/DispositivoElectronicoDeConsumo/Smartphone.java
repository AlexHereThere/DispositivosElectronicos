/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivoElectronicoDeConsumo;

import ComponenteElectronico.Microprocesador;
import ComponenteElectronico.Pantalla;
import ComponenteElectronico.Sensor;
import ComponenteElectronico.ComponenteElectronico;

/**
 *
 * @author 01806
 */
public class Smartphone extends Computadora {

private final Sensor SENSORDEHUELLA;
private final Pantalla PANTALLA;


 public Smartphone(Microprocesador cpu, Sensor SENSORDEHUELLA, Pantalla PANTALLA, long ramMB,
            String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo) {
        super(cpu,ramMB,FABRICANTE, NUMEROSERIE, MARCA, NOMBRE, costo);
        this.SENSORDEHUELLA=SENSORDEHUELLA;
        SENSORDEHUELLA.CambiarDispositivoElectronico(this);
        this.PANTALLA=PANTALLA;
        PANTALLA.CambiarDispositivoElectronico(this);
    }
 
 
 //metodos por ser DispositivoElectronico y finales
    @Override
    public String getFabricante()
    {
        return FABRICANTE;    
    }
    @Override
    public String getNumeroSerie()
    {
        return NUMEROSERIE;    
    }
    @Override
    public String getMarca()
    {
        return MARCA;    
    }
    @Override
    public String getNombre()
    {
        return NOMBRE;   
    }
    public Sensor getSensor()
    {
        return SENSORDEHUELLA;
    }
    public Pantalla getPantalla()
    {
        return PANTALLA;
    }
      /**
     *setter para costo
     * @param costo
     */
    @Override
    public void setCosto(float costo)
    {
        this.costo=costo;
    }
    //getter para costo
    @Override
    public float getCosto()
    {
        return costo;    
    }
    
@Override
    public void setCPU(Microprocesador cpu)
    {
        this.cpu=cpu; 
    }
@Override
    public Microprocesador getCPU()
    {
        return cpu;    
    }
    
@Override
    public void setRamMB(long ramMB)
    {
        this.ramMB=ramMB;
    }
@Override
    public long getRamMB()
    {
        return ramMB;    
    }
    
@Override
    public void encender()
   {
    encendido=true;    
   }
@Override
   public void apagar()
   {
    encendido=false;  
   }
@Override
   public boolean esEncendido()
   {
   return encendido;    
   }

    /**
     * metodo para agregar un nuevo componente al listado de componentes que se tiene
     * @param nuevo
     */
    @Override
    public void agregarComponente(ComponenteElectronico nuevo) {
    componentes.add(nuevo);
    }

      /**
     * metodo para quitar un componente al listado de componentes que se tiene
     * @param numeroDeComponente
     */
    @Override
    public void quitarComponente(int numeroDeComponente) {
    componentes.remove(numeroDeComponente);
    }
    
    @Override
    public String toString()
    {
        String todo="";
        todo+="\n-------Smartphone-------\n";
        todo+="Esta Encendido?: "+encendido+"\n";
        todo+="Fabricante: "+FABRICANTE+"\n";
        todo+="Numero Serie: "+NUMEROSERIE+"\n";
        todo+="Marca: "+MARCA+"\n";
        todo+="Nombre: "+NOMBRE+"\n";
        todo+="Costo: "+costo+"\n";
        todo+="CPU: "+cpu.getNombre()+"\n";
        todo+="SensorDeHuella: "+SENSORDEHUELLA.getNombre()+"\n";
        todo+="Pantalla: "+PANTALLA.getNombre()+"\n";
        todo+="RAM MB: "+ramMB;
        return todo;
        
    }
}
