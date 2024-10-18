package labprogramacion1.Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Cuotas {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    double montoprestamo, interesmensual, interestotal, seguromensual, segurototal, comision, cuotamensual, totalpagar;
    int plazomeses;
    
        System.out.println("Ingrese su monto de prestamo: ");
        montoprestamo = entrada.nextDouble();
        System.out.println("Ingrese el plazo en meses: ");
        plazomeses = entrada.nextInt();
        System.out.println("Ingrese la tasa del interes mensual: ");
        interesmensual = entrada.nextDouble();
        interesmensual = interesmensual / 100;
        System.out.println("Ingrese la comision por cuota: ");
        comision = entrada.nextDouble();
        System.out.println("Ingrese la cuota de seguro mensual: ");
        seguromensual = entrada.nextDouble();
        seguromensual = seguromensual / 100;
        
        
        interestotal = montoprestamo * interesmensual;
        segurototal = montoprestamo * seguromensual;
        cuotamensual = (montoprestamo/plazomeses) + interestotal + segurototal + comision;
        totalpagar = cuotamensual * plazomeses;
        
        System.out.println("----CUOTAS MENSUALES----");
        System.out.println("Cuota de pago mensual: HNL "+cuotamensual);
        System.out.println("Total a pagar: HNL "+totalpagar);
        
       
    }
}
