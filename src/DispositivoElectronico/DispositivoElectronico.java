/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivoElectronico;

import ComponenteElectronico.ComponenteElectronico;
import java.util.ArrayList;

/**
 *
 * @author 01806
 */
    public abstract class DispositivoElectronico{
    protected final String FABRICANTE;
    protected final String NUMEROSERIE;
    protected final String MARCA;
    protected final String NOMBRE;
    protected float costo;
    protected ArrayList<ComponenteElectronico> componentes;

    public DispositivoElectronico(String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE,float costo) {
        this.FABRICANTE=FABRICANTE;
        this.NUMEROSERIE=NUMEROSERIE;
        this.MARCA=MARCA;
        this.NOMBRE=NOMBRE;
        this.costo=costo;
        componentes=new ArrayList<>();
    }
    
    //getters para los atributos finales
    public String getFabricante()
    {
    return FABRICANTE;    
    }
    public String getNumeroSerie()
    {
    return NUMEROSERIE;    
    }
    public String getMarca()
    {
    return MARCA;    
    }
    public String getNombre()
    {
    return NOMBRE;   
    }
    //setter para COSTO
    public void setCosto(float costo)
    {
    this.costo=costo;
    }
    
    //getter para COSTO
    public float getCosto()
    {
    return costo;    
    }
  
    /**
     * metodo para agregar un nuevo componente al listado de componentes que se tiene
     * @param nuevo
     */
    public void agregarComponente(ComponenteElectronico nuevo) {
    componentes.add(nuevo);
    }

      /**
     * metodo para quitar un componente al listado de componentes que se tiene
     * @param numeroDeComponente
     */
    public void quitarComponente(int numeroDeComponente) {
    componentes.remove(numeroDeComponente);
    }

}
