/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author ttleo
 */
public abstract class Persona {
    //Propiedades
    private String nombre;
    private int edad;
    private String identidad;
    private String sexo;
    
    //Constructor de la clase
    public Persona() {
        
    }
    
    //Establecer y obtener.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
    public String getIentidad() {
        return identidad;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    
    abstract void informacionPersonal();
    
}
