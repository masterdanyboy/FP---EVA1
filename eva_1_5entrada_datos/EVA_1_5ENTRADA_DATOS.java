/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_5ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        //CAPTURA DE DATOS DEL TECLADO:
        //Scanner -- herramienta (Clase)
        //Scanner:es un tipo de dato
        Scanner captu; //incorporar la herramienta al código (import)
        //no existe, hay que crearla
        captu = new Scanner (System.in);//creamos la herramienta scanner
        
        System.out.println("Introduce tu nombre completo: ");
        //capturar (asignar un valor a la variable)
        nombre = captu.nextLine(); //capturamos todo el texto
                                    //hasta que presiona "enter"
        //IMPRIMIR LOS DATOS:
        System.out.println("DATOS CAPTURADOS");
        System.out.println(nombre);
               
    }
    
}
