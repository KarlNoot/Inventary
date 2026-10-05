package repaso_en_progra3;

/**
 * @author Luisc
 */
public class Ejemplo_repaso_progra2_280574 {

    public static void main(String[] args) {

        // crear objetos
        Alumno alumno1 = new Alumno(1, "Luis", "Rodriguez", "ISW", "3ero");
        Alumno alumno2 = new Alumno(2, "Panchito", "Medina", "ISW", "6to");
        Profesor profesor1 = new Profesor(200, "Martin ", "Sanchez", "Empleado 777", "Guaymas");

        System.out.println("----Alumno 1----");
        alumno1.mostrarInformacion();
        alumno1.estudiar();

        System.out.println("----Alumno 2----");
        alumno2.mostrarInformacion();
        alumno2.estudiar();

        System.out.println("---PROFESOR---");
        profesor1.mostrarInformacion();
        profesor1.impartirClase();
    }
}