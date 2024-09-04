/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_11_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERSIONES DE TEMPERATURA
        double fahr, cent, kelv;
        Scanner captu = new Scanner (System.in);
        //FAHRENHEIT A CENTÍGRADOS
        System.out.println("Captura los °Fahrenheit:");
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8;//EXPRESIÓN
        System.out.println("°C = " + cent);
        
        //CENTÍGRADOS A FHRENHEIT
        System.out.println("Captura los °Centígrados:");
        cent = captu.nextDouble();
        fahr = (cent * 1.8 + 32 );
        System.out.println("°F = " + fahr);
        
        //KELVIN A CENTÍGRADOS
        System.out.println("Captura los °Kelvin:");
        kelv = captu.nextDouble();
        cent = (kelv - 273.15);
        System.out.println("°C = " + cent);
        
        //CENTÍGRADOS A KELVIN
        System.out.println("Captura los °Centígrados:");
        cent = captu.nextDouble();
        kelv = (cent + 273.15);
        System.out.println("°K = " + kelv);
                
        
        
    }
    
}
