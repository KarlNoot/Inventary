/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_en_progra3;

/**
 *
 * @author Luisc
 */
public class Profesor  extends Usuario {
        //Atributos propios de profesor
        private String numeroEmpleado;
        private String departamento;
        
        
    //Constructor
    public Profesor(int id_local, String nombre_local, String apellido_local, String numeroEmpleado, String departamento) {
        super(id_local, nombre_local, apellido_local);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
    }
    //Getter and setter

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //Metodo proio de profesor
    public void impartirClase(){
        System.out.println(getNombre() + 
                "trabaja en el departamento de: " + departamento +".");
    
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        
        System.out.println("Numero de empleado: " + numeroEmpleado);
        System.out.println("Departamento: "+ departamento);
    
    }
    
}
