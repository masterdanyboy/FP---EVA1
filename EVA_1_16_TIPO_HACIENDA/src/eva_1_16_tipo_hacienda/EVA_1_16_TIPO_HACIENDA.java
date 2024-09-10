/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tipo de persona F --> FÍSICA, M--> MORAL:");
        tipo = captu.nextLine () .charAt(0);
        System.out.println(tipo);
        //IMPRIMIR EL TIPO DE PERSONA:
        //"" --> CADENA DE TEXTO, " --> ES UN CARACTER
        //"F"
    }
    
}
