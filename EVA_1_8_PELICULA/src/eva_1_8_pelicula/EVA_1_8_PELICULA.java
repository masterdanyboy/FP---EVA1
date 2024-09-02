/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIÓN DE VARIABLES
        String nombre;
        String genero;
        int duración;
        String reparto;
        String clasificación;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        
        //CAPTURAR
        System.out.println("Captura el nombre de la película:");
        nombre = captu.nextLine();

        System.out.println("Captura el genero de la película");
        genero = captu.nextLine();
        
        System.out.println("Captura la duración de la película en segundos");
        duración = captu.nextInt();
        
        System.out.println("Captura el reparto de la película");
        reparto = captu.nextLine();
        captu.nextLine();
        
        System.out.println("Captura la clasificación");
        clasificación = captu.nextLine();
        
        //IMPRIMIMOS
        System.out.println("Impresión de las capturas---");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duración);
        System.out.println(reparto);
        System.out.println(clasificación);
        
                
        
                
        
        
        
        
        
      
      
        
                
               
    }
    
}
