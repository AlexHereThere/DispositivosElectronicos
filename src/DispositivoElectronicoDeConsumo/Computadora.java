package DispositivoElectronicoDeConsumo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import ComponenteElectronico.ComponenteElectronico;
import ComponenteElectronico.Microprocesador;
/**
 *
 * @author 01806
 */
public class Computadora extends DispositivoElectronicoDeConsumo{


protected Microprocesador cpu;
protected long ramMB;

 public Computadora(Microprocesador cpu, long ramMB,
            String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo) {
        super(FABRICANTE, NUMEROSERIE, MARCA, NOMBRE, costo);
        this.cpu=cpu;
        cpu.CambiarDispositivoElectronico(this);
        this.ramMB=ramMB;
       
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
    
    public void setCPU(Microprocesador cpu)
    {
        this.cpu=cpu; 
    }
    public Microprocesador getCPU()
    {
        return cpu;    
    }
    
    public void setRamMB(long ramMB)
    {
        this.ramMB=ramMB;
    }
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
        todo+="\n-------Computadora-------\n";
        todo+="Esta Encendido?: "+encendido+"\n";
        todo+="Fabricante: "+FABRICANTE+"\n";
        todo+="Numero Serie: "+NUMEROSERIE+"\n";
        todo+="Marca: "+MARCA+"\n";
        todo+="Nombre: "+NOMBRE+"\n";
        todo+="Costo: "+costo+"\n";
        todo+="CPU: "+cpu.getNombre()+"\n";
        todo+="RAM MB: "+ramMB+"\n";
        return todo;
        
    }
}