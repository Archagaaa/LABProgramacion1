package labprogramacion1.Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Clics {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int clic100 = 100, clic60 = 60, clic20 = 20;
        double precio100 = 0.25, precio60 = 0.30, precio20 = 0.80, costototal, costopromedio, ISV, totalISV;
        
        costopromedio = (clic100 * precio100) + (clic60 * precio60) + (clic20 * precio20) / 180;
        costototal = (clic100 * precio100) + (clic60 * precio60) + (clic20 * precio20);
        
        ISV = costototal * 0.16;
        totalISV = costototal + ISV;
        
        System.out.println("Su costo promedio es: "+String.format("%.2f",costopromedio));
        System.out.println("Su ISV es: "+ISV);
        System.out.println("Su total mas ISV es: "+String.format("%.2f",totalISV));
        
    }
}
