package labprogramacion1.Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Cuotas {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    double cantidadprestamo, interesmensual, cuotamensual, tasainteres, comision, comisionmensual, seguromensual, seguro, totalprestamo;
    int plazomes;
    
        System.out.println("Ingrese su monto de prestamo: ");
        cantidadprestamo = entrada.nextDouble();
        
        System.out.println("Ingrese el plazo en meses: ");
        plazomes = entrada.nextInt();
        cuotamensual = cantidadprestamo / plazomes;
        
        System.out.println("Ingrese la tasa del interes mensual: ");
        tasainteres = entrada.nextDouble();
        tasainteres = tasainteres / 100;
        interesmensual = cuotamensual * tasainteres;
        
        System.out.println("Ingrese la comision por cuota: ");
        comision = entrada.nextDouble();
        comision = comision / 100;
        comisionmensual = cuotamensual * comision;
        
        System.out.println("Ingrese la cuota de seguro mensual: ");
        seguro = entrada.nextDouble();
        seguromensual = cuotamensual * seguro;
        
        totalprestamo = cuotamensual + interesmensual + comisionmensual + seguro;
        
        System.out.println("----CUOTAS MENSUALES----");
        System.out.println("Cuota de pago Mensual: HNL "+cuotamensual);
        System.out.println("Total a pagar: HNL "+totalprestamo);
    
    }
}
