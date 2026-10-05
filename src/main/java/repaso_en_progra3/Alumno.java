/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_en_progra3;

/**
 *
 * @author Luisc
 */
public class Alumno extends Usuario{
    //Atributos
    private String carrera;
    private String semestre;
    
    
    //Constructor
    public Alumno(int id_local, String nombre_local, String apellido_local,String carrera,String semestre) {
        super(id_local, nombre_local, apellido_local);
        
        this.carrera = carrera;
        this.semestre = semestre;
        
    }
    
    //Getter y Setters

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
 
    public void estudiar(){
        System.out.println(nombre + " está estudiando");
    }    

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        
        System.out.println("Carrera: " + carrera);
        System.out.println("Sesmestre " + semestre);
        
    }
    
    
    
}
