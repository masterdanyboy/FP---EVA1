/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_6_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_6_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIÓN DE VARIABLES
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner (System.in);
        
        //CAPTURAR
        System.out.println("Captura tu nombre completo:");
        nombre = captu.nextLine();
        
        System.out.println("Captura la curp");
        curp = captu.nextLine();
        
        System.out.println("Captura la edad");
        edad = captu.nextInt();
        
        System.out.println("Captura el promedio");
        promedio = captu.nextDouble();
        
        
        //IMPRESIÓN
        
        System.out.println("SECCIÓN DE IMPRESIÓN DE DATOS:");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
               
        
                
                
    }
    
}
