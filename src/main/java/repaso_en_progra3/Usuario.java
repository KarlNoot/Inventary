/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_en_progra3;

/**
 *
 * @author Luisc
 */
public class Usuario {
    //Atributos
    public int id;
    public String nombre;
    public String apellido;
    
    //constructor
    public Usuario(int id_local, String nombre_local,
            String apellido_local){
        this.id = id_local;
        this.nombre = nombre_local;
        this.apellido = apellido_local;
        
}
//Getters % Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    //Metodo para imprimir o mostrar informacion xD
    public void mostrarInformacion(){
        System.out.println("ID: 00000280574" + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido:" + apellido);
                
                    
                
              
    }
}
