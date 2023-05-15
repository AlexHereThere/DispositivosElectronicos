/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivoElectronicoDeConsumo;

import ComponenteElectronico.Pantalla;
import ComponenteElectronico.ComponenteElectronico;

/**
 *
 * @author 01806
 */
public class Television extends DispositivoElectronicoDeConsumo{
  
    private final Pantalla PANTALLA;
    
    public Television(Pantalla PANTALLA,
            String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo) {
        super(FABRICANTE, NUMEROSERIE, MARCA, NOMBRE, costo);
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
        todo+="\n-------Television-------\n";
        todo+="Esta Encendido?: "+encendido+"\n";
        todo+="Fabricante: "+FABRICANTE+"\n";
        todo+="Numero Serie: "+NUMEROSERIE+"\n";
        todo+="Marca: "+MARCA+"\n";
        todo+="Nombre: "+NOMBRE+"\n";
        todo+="Costo: "+costo+"\n";
        todo+="Pantalla: "+PANTALLA.getNombre();
        return todo;
        
    }
}
