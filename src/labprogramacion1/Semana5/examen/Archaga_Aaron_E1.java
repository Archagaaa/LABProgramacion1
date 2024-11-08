package labprogramacion1.Semana5.examen;

import java.util.Scanner;

public class Archaga_Aaron_E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do {
            System.out.println("=========================="+
                                "\nIngrese una opcion: "+
                                "\n1- Piramide"+
                                "\n2- El mayor"+
                                "\n3- CANALES"+
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
                    String respuestau;
                    
                    do{
                        System.out.println("Ingrese un numero o la palabra - no -");
                        respuestau = sc.next();
                        
                        if(respuestau.equals("no")){
                            break;
                        }
                        
                        //Esto convierte la respuesta del usuario si es un numero a un int
                        numero = Integer.parseInt(respuestau);
                        suma += numero;
                        
                        contador++; //Este contador cuenta cuantos numeros se van ingresando
                        
                        if (numero > numeromayor){
                            numeromayor = numero;
                        }
                  
                    }while(!respuestau.equals("no"));
                    
                    if (contador > 0){
                        promedio = suma / contador;
                        System.out.println("El numero mayor fue: "+numeromayor);
                        System.out.println("El promedio fue: "+promedio);
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("----CANALES----");
                    String nombrecliente;
                    String respuesta;
                    String tipodecaja;
                    int preciodecaja = 0;
                    int contadordenormal = 0;
                    int contadordehd = 0;
                    int subtotal = 0;
                    double total = 0, impuesto;
                    
                    System.out.println("Ingrese su primer nombre:");
                    nombrecliente = sc.next();
                    
                    while(true){
                        String tipodecanal;
                        
                        System.out.println("Ingrese el tipo de canal - NORMAL - o - HD -");
                        tipodecanal = sc.next().toUpperCase();
                        
                        if(tipodecanal.equals("NORMAL")){
                            contadordenormal++;
                            subtotal += 20;
                        }
                        else if (tipodecanal.equals("HD")){
                            contadordehd++;
                            subtotal += 30;
                        }
                        else{
                            System.out.println("Canal no valido vuelva a intentar");
                            continue;
                        }
                        System.out.println("Desea ingresar otro canal - SI - o - NO -");
                        respuesta = sc.next().toUpperCase();
                        
                        if (respuesta.equals("NO")){
                            break;
                        }
                    }
                    
                    System.out.println("Ingrese el tipo de caja: - LIGHTBOX -, - HDBOX - o - DVRBOX- ");
                    tipodecaja = sc.next().toUpperCase();
                    
                    if(tipodecaja.equals("LIGHTBOX")){
                        preciodecaja = 50;
                    }
                    else if(tipodecaja.equals("HDBOX")){
                        preciodecaja = 100;
                    }
                    else if(tipodecaja.equals("DVRBOX")){
                        preciodecaja = 150;
                    }
                    else{
                        System.out.println("Caja no valida vuelva a intentar");
                        continue;
                    }
                    
                    subtotal += preciodecaja;
                    impuesto = subtotal * 0.15;
                    total = subtotal + impuesto;
                    
                    System.out.println("---DETALLES---");
                    System.out.println("Nombre: "+nombrecliente);
                    System.out.println("Cantidad canales NORMALES: "+contadordenormal);
                    System.out.println("Cantidad de canales HD: "+contadordehd);
                    System.out.println("Subtotal: "+subtotal);
                    System.out.println("Impuesto: "+impuesto);
                    System.out.println("Total: "+total);
                    
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
