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
public class Pantalla extends ComponenteElectronico{
    
    private final int RESOLUCIONX;
    private final int RESOLUCIONY;        
            

    public Pantalla(DispositivoElectronico esParteDe,int RESOLUCIONX,
    int RESOLUCIONY, String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo) {
        super(esParteDe,FABRICANTE,NUMEROSERIE,MARCA,NOMBRE,costo);
        this.RESOLUCIONX=RESOLUCIONX;
        this.RESOLUCIONY=RESOLUCIONY;
       
    }
    
    @Override
    public void CambiarDispositivoElectronico(DispositivoElectronico esParteDe) {
        this.esParteDe=esParteDe;
    }

    @Override
    public DispositivoElectronico getDispositivoDueño() {
        return esParteDe;
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
    public int getResolucionX()
    {
        return RESOLUCIONX;    
    }
    public int getResolucionY()
    {
        return RESOLUCIONY;    
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
        todo+="\n-------Pantalla-------\n";
        todo+="es parte de: "+esParteDe.getNombre()+"\n";
        todo+="Resolucion X: "+RESOLUCIONX+"\n";
        todo+="Resolucion Y: "+RESOLUCIONY+"\n";
        todo+="Fabricante: "+FABRICANTE+"\n";
        todo+="Numero Serie: "+NUMEROSERIE+"\n";
        todo+="Marca: "+MARCA+"\n";
        todo+="Nombre: "+NOMBRE+"\n";
        todo+="Costo: "+costo;
        return todo;
        
    }
    
}
