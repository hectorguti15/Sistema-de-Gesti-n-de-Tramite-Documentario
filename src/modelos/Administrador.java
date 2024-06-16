/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author FELIPE
 */
public class Administrador extends Persona{
    private int numeroTrabajador;
    private PersonalDependencia[] personalDependencia; 
    
    public Administrador(String nombre, String apellido, int numeroTrabajador, PersonalDependencia[] personalDependencia){
        super(nombre, apellido);
        this.numeroTrabajador = numeroTrabajador;
        this.personalDependencia = personalDependencia;
    }
    
    
}
