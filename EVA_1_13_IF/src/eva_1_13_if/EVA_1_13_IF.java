/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_13_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTUREN LA EDAD
        int edad;
        Scanner captu = new Scanner (System.in);
        System.out.println("Captura la edad");
        edad = captu.nextInt();
        
        //INSTRUCCIÓN IF
        //SI (ALGO SE CUMPLE)
        //QUE HAGO SI SE CUMPLE
        //SI NO SE CUMPLE (OPCIONAL) ES FALSO
        //QUE HACEN SI SE CUMPLE
        if (edad >= 18){//BLOQUEO DE VERDADERO
            System.out.println("Adulto: mayor de edad");
        }else{
            System.out.println("Menor de edad.");
        }
                
    }
    
}
