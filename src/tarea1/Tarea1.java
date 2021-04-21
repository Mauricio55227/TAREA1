/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;
import java.util.Scanner;

/**
 *
 * @author BLANQUET
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año_actual = 2021;
        int año_x;
        int años;
            Scanner entrada = new Scanner(System.in);   
 
            System.out.println("Ingrese el año para comenzar:");
            año_x = entrada.nextInt();
        
        if (año_actual > año_x){
            años = (año_actual - año_x);
            System.out.println("Los años que han pasado: " + años + "años");
        } else if (año_x > año_actual) {
            años = (año_x - año_actual);
            System.out.println("Faltan " + años + "años");
        }
    }
}