
package labprogramacion1.Semana3;

import java.util.Scanner;


public class Archaga_Aaron_Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Ingrese el ejercicio que desea realizar:"+
                            "\n----------"+
                            "\n1- Cadena"+
                            "\n2- Notas"+
                            "\n3- Clases"+
                            "\n----------");
        opcion = sc.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("-----CADENA-----");
                String cadena;
                int contador = 0,repeticionmax = 0,conteocaracter = 0;
                char chrepetido = ' ', caracter = 0;
                
                System.out.println("Ingrese la palabra: ");
                cadena = sc.nextLine();
                int largo = cadena.length();
                        
                while (caracter < 256){
                    while(conteocaracter < largo){
                    }
                    caracter++;
                }
                        
                
            break;
            
            case 2:
                System.out.println("-----NOTAS-----");
                int contador2 = 1;
                double cantidadnota, nota,suma = 0, notamayor = -1, notamenor = 101, promedio;
                
                System.out.println("Ingrese la cantidad de notas que desea poner: ");
                cantidadnota = sc.nextInt();
                
                while (contador2 <= cantidadnota){
                    System.out.print("Ingrese la nota "+contador2+": ");
                    nota = sc.nextDouble();
                    
                    while (nota > 100 || nota < 0){
                        System.out.println("La nota tiene que ser un valor entre 0 y 100");
                        System.out.println("Ingrese la nota "+contador2+": ");
                        nota = sc.nextDouble();
                    }
                    
                    suma += nota;
                    
                    while (nota < notamenor){
                        notamenor = nota;
                    }
                    while (nota > notamayor){
                        notamayor = nota;
                    }
                    contador2++;
                    
                }
                promedio = suma / cantidadnota;
                System.out.println("El promedio es: "+String.format( "%.2f", promedio));
                System.out.println("La nota mayor es: "+notamayor);
                System.out.println("La nota menor es: "+notamenor);
            break;
            
            case 3:
                System.out.println("-----CLASES-----");
                
            break;
        }
        
    }
}

