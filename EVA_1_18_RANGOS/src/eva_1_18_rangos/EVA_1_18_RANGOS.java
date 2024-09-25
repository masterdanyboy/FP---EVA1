/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce una calificación");
        califa = captu.nextInt();
        
        if(califa >= 0 && califa <= 100){
            System.out.println("CALIFICACIÓN VÁLIDA");
        }else{
            System.out.println("CALIFICACIÓN NO VÁLIDA");
        }
    }
    
}
