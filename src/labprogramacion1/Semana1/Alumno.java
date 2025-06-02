package labprogramacion1.Semana1;

/**
 *
 * @author Aaron Archaga
 */
public class Alumno {
    public static void main (String[] args){
        //Entrada de Datos
        String nombreAlumno = "Aaron", carrera;
        int numeroCuenta = 22451016;
        carrera = "Sistemas";
        double promedio = 75.5;
        nombreAlumno = nombreAlumno+" Archaga";
        
        //Salida de Datos
        System.out.println("**** DATOS DE ALUMNOS ****");
        System.out.print("Numero de Cuenta: "+numeroCuenta+
                         "\nNombre del Alumno: "+nombreAlumno+
                         "\nPromedio del Alumno: "+promedio+"\n");
    }
}
