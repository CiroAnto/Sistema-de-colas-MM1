/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecolamm1;

import java.util.Scanner;


public class SistemaDeColaMM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent= new Scanner (System.in);
        System.out.println("\tIngrese los datos: ");
        
        System.out.println("Ingrese el valor de llegadas: ");
        double lleg=ent.nextDouble();
        System.out.println("Ingrese valor de capacidad de atencion: ");
        double cap =ent.nextDouble();
        
        System.out.println("");
        double l=lleg/60;
        double u=cap/60;
        double probabilidad=l/u;
        double  wq=0;
        if (lleg>cap) {
            wq=l/(u*(u-l));
        }
        if (lleg<cap) {
            wq=u;
        }
        
        double lq=probabilidad*wq;
        double ws=wq+1/u;
        double ls=probabilidad/(1-probabilidad);
        
        System.out.println("\tDatos: ");
        System.out.println("Media de llegada λ: "+l);
        System.out.println("Media de servicio µ: " +u);
        System.out.println("Probabilidad: " +probabilidad);
        System.out.println("Tiempo de clientes de espera en cola Wq: "+wq);
        System.out.println("Numero promedio de clientes en sistema Lq: "+lq);
        System.out.println("Tiempo de espera de un cliente en sistema Ws: "+ws);
        System.out.println("Numero promedio de clientes en la cola Ls: " +ls);
        System.out.println("");
        
        System.out.println("\tParte dinamica: ");
        System.out.println("Ingrese la cantidad que puede tener la cola: ");
        double enCola=ent.nextDouble();
        
        double Pln=(1-(l/u))*Math.pow(l/u, enCola);
        System.out.println("Probabilidad de que halla " +enCola+ " en la cola es: "+Pln*100);
    }
    
}
