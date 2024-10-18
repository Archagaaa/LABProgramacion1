package labprogramacion1.Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Formulas {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int numerador1, numerador2, denominador1, denominador2;
        double resultado;
        
        /*
        //EjercicioA
        System.out.println("Ejercicio A");
        System.out.println("Ingrese el primer numerador:");
        numerador1 = entrada.nextInt();
        System.out.println("Ingrese el primer denominador:");
        denominador1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numerador:");
        numerador2 = entrada.nextInt();
        System.out.println("Ingrese el segundo denominador:");
        denominador2 = entrada.nextInt();
        
        resultado = (numerador1 / denominador1) + (numerador2 / denominador2);
        System.out.println("El resultado es: "+resultado);
        */
        
        //EjercicioB
        System.out.println("Ejercicio B");
        System.out.println("Ingrese el primer numerador: ");
        numerador1 = entrada.nextInt();
        System.out.println("Ingrese el primer denominador: ");
        denominador1 = entrada.nextInt();
        System.out.println("Ingrese la variable del primero denominador: ");
        String denominador1var1 = entrada.next();
        System.out.println("Ingrese el primer numero del segundo numerador: ");
        numerador2 = entrada.nextInt();
        System.out.println("Ingrese la variable 1 del numerador2: ");
        String var1num2 = entrada.next();
        System.out.println("Ingrese la variable 2 del numerador2: ");
        String var2num2 = entrada.next();
        System.out.println("Ingrese el segundo denominador: ");
        denominador2 = entrada.nextInt();
        
        resultado = (numerador1 / (denominador1var1 - denominador1)) - ((numerador2*var1num2*var2num2)/denominador2);
        System.out.println("Su resultado es: "+resultado);
    }
}
