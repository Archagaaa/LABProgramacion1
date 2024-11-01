package labprogramacion1.Semana4;

import java.util.Scanner;
import java.util.Random;


public class Archaga_Aaron_Estructura {
    
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int contadorreves = 0;
        int contadorperfecto = 0;
        int contadorprimo = 0;
        int contadorvotacion = 0;
        
        System.out.println("Ingrese el ejercicio que desea realizar:"+
                            "\n----------"+
                            "\n1- Palabras alreves"+
                            "\n2- Numero Perfecto"+
                            "\n3- Primos"+
                            "\n4- Votaciones"+
                            "\n5- Salir"+
                            "\n----------");
        opcion = sc.nextInt();
        
            switch(opcion){
                case 1:
                    contadorreves++;
                    System.out.println("----PALABRAS AL REVES----");
                    String palabra, reves = "";
                
                    //Ingresamos la palabra
                    System.out.println("Ingrese la palabra");
                    palabra = sc.next();
                    //El for nos imprime la palabra al reves
                    for(int length = palabra.length() - 1; length >= 0; length--) {
                        reves += palabra.charAt(length);
                    }
                    System.out.println("La palabra alreves es: "+reves);
                    break;
                
                case 2:
                    contadorperfecto++;
                    System.out.println("----NUMERO PERFECTO----");
                    int numero = 0;
                    int divisor = 0;
                    
                    //Ingresamos el numero
                    System.out.println("Ingrese un numero:");
                    numero = sc.nextInt();
                    
                    for (int contador = 1; contador < numero; contador++){
                        //El if verifica que el nunmero del divisor se pueda dividir con el numero ingresado
                        if (numero % contador == 0){
                            divisor += contador;
                        }
                    }    
                        //desplega si es perfecto o no
                        if (divisor == numero){
                            System.out.println("El numero es perfecto");
                        }
                        else{
                            System.out.println("El numero no es perfecto");
                        }
                    break;
                
                case 3:
                    contadorprimo++;
                    System.out.println("----NUMEROS PRIMOS----");
                    Random random = new Random();
                    int aleatorio = random.nextInt(100); //Genera un numero aleatorio del 1-100
                    int primo = 0, contador2 = 1;
                    
                    while (contador2 <= aleatorio) {
                        //If verifica si el contador es divisior del numero generado
                        if (aleatorio % contador2 == 0){
                            primo += contador2;
                        }
                        //Si es primo lo despliega
                        if (primo == aleatorio + 1){
                            System.out.println("El "+aleatorio+" es divisor");
                            System.out.println("Divisores de el numero "+aleatorio+" son 1 y "+aleatorio);
                        }
                    contador2++;   
                    }
                    break;   
                case 4:
                    contadorvotacion++;
                    System.out.println("----VOTACIONES----");
                    System.out.println("Ingrese cuantos votantes hay en el pais");
                    int votantes = sc.nextInt();
                    
                    for (int conta = 1; conta <= votantes; conta++){
                        
                    }
                    
                    break;
                case 5:
                    System.out.println("Usted entro a palabras al reves "+contadorreves+" veces");
                    System.out.println("Usted entro a numeros perefectos "+contadorperfecto+" veces");
                    System.out.println("Usted entro a numeros primos "+contadorprimo+" veces");
                    System.out.println("Usted entro a votaciones "+contadorvotacion+" veces");
            }   
            
    }
}
