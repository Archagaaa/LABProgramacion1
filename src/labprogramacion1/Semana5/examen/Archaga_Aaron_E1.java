package labprogramacion1.Semana5.examen;

import java.util.Scanner;

public class Archaga_Aaron_E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do {
            System.out.println("Ingrese una opcion: "+
                                "\n1- Piramide"+
                                "\n2- El mayor"+
                                "\n3- Ejercicio 3"+
                                "\n4- Caracter Vocales"+
                                "\n5- Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("----PIRAMIDE----");
                    int numeroinicial = 1;
                    int cantidadfilas = 6;
                    
                    System.out.println("Cantidad de filas de la piramide: "+cantidadfilas);
                    
                    for (int nfilas = 1; nfilas <= cantidadfilas; nfilas++) {
                        int sumadefila = 0;
                        for (int contador = 0; contador < nfilas; contador++) {
                            System.out.print(numeroinicial + " ");
                            sumadefila += numeroinicial;
                            
                            //El numero inicial aumenta en 2 ya que son numeros impares
                            numeroinicial += 2; 
                        }
                        System.out.println("= "+sumadefila);
                    }
                    break;
                
                case 2:
                    System.out.println("---- EL MAYOR ----");
                    int numeromayor = 0;
                    int suma = 0;
                    double promedio = 0;
                    int numero;
                    int contador = 0;
                    
                    //Esto revisa el primer numero ingresado
                    boolean primernumero = true; 
                    
                    while(true){
                        System.out.println("Ingrese un numero o la palabra - no -");
                        String respuesta = sc.next();
                        
                        if(respuesta.equals("no")){
                            break;
                        }
                        
                        //Esto convierte la respuesta del usuario si es un numero a un int
                        numero = Integer.parseInt(respuesta);
                        suma += numero;
                        
                        contador++; //Este contador cuenta cuantos numeros se van ingresando
                        
                        if (primernumero){
                            numeromayor = numero;
                            primernumero = false;
                        }
                        else if(numeromayor < numero) {
                            numeromayor = numero;
                        }
                    }
                    if (contador > 0){
                        promedio = suma / contador;
                        System.out.println("El numero mayor fue: "+numeromayor);
                        System.out.println("El promedio fue: "+promedio);
                    }
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("HASTA LUEGO");
                    break;
            }
            
        } while(opcion != 5);
        
        System.out.println("Vuelva a introducir una opcion");
    }
}
