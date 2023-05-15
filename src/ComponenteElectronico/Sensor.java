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
public class Sensor extends ComponenteElectronico {  
    
     private final String TIPO;
     private final String UNIDADDEMEDIDA;
     private final int VALOR;
    
    public Sensor(DispositivoElectronico esParteDe, String TIPO, String UNIDADDEMEDIDA, int VALOR, 
            String FABRICANTE, String NUMEROSERIE, String MARCA, String NOMBRE, float costo)
    {
        super(esParteDe,FABRICANTE,NUMEROSERIE,MARCA,NOMBRE,costo);
        this.TIPO=TIPO;
        this.UNIDADDEMEDIDA=UNIDADDEMEDIDA;
        this.VALOR=VALOR;
       
    }

     /**
      * metodo para cambiar el dispositivo electronico al que pertenece
      * @param esParteDe 
      */
     @Override
     public void CambiarDispositivoElectronico(DispositivoElectronico esParteDe)
     {
        this.esParteDe=esParteDe;
     }
     @Override
     public DispositivoElectronico getDispositivoDueño() 
     {
       return esParteDe;
     }
     
     
  //getters para los atributos finales
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
    public String getTipo()
    {
        return TIPO;   
    }
    public String getUnidadDeMedida()
    {
        return UNIDADDEMEDIDA;    
    }
    public int getValor()
    {
        return VALOR;    
    }
    //setter para costo
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
        todo+="\n-------Sensor-------\n";
        todo+="es parte de: "+esParteDe.getNombre()+"\n";
        todo+="Tipo: "+TIPO+"\n";
        todo+="UnidadDeMedida: "+UNIDADDEMEDIDA+"\n";
        todo+="Valor "+VALOR+"\n";
        todo+="Fabricante: "+FABRICANTE+"\n";
        todo+="Numero Serie: "+NUMEROSERIE+"\n";
        todo+="Marca: "+MARCA+"\n";
        todo+="Nombre: "+NOMBRE+"\n";
        todo+="Costo: "+costo;
        return todo;
        
    }
    
}
