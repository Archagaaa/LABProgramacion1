package labprogramacion1.Semana2;

import java.util.Scanner;


public class Archaga_Aaron_PlanillaEmpleado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double horasMes, tarifaHora,salarioSemanal;
        String nombre;
        
        System.out.print("Ingrese su nombre y apellido: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la cantidad de horas laboradas al mes: ");
        horasMes = entrada.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        tarifaHora = entrada.nextDouble();
        salarioSemanal = (horasMes * tarifaHora)/4;
        
        System.out.println("----Boleta Empleado----");
        System.out.println("Nombre de empleado: "+nombre);
        System.out.println("Horas de trabajo Mensual: "+horasMes);
        System.out.println("Tarifa por hora: "+tarifaHora);
        System.out.println("Salario Semanal: "+salarioSemanal);
    }
    
}
