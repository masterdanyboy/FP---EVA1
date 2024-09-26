/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_22_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int díaSem;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el número del día (1 a 7");        
        díaSem = captu.nextInt ();
        captu.nextLine();
        //ELEGIR ENTRE MÚLTIPLES ALTERNATIVAS
        switch(díaSem){
            case 1:
                System.out.println("Domingo");
                break; //Interrumpe el switch (lo termina)
            case 2:
                System.out.println("Lunes");
                break; //Interrumpe el switch (lo termina)
            case 3:
                System.out.println("Martes");
                break; //Interrumpe el switch (lo termina)
            case 4:
                System.out.println("Miércoles");
                break; //Interrumpe el switch (lo termina)
            case 5:
                System.out.println("Jueves");
                break; //Interrumpe el switch (lo termina)
            case 6:
                System.out.println("Viernes");
                break; //Interrumpe el switch (lo termina)
            case 7:
                System.out.println("Sábado");
                break; //Interrumpe el switch (lo termina)
            default://opcional, se ejecuta, cuando no existe una opción
                    //no tiene break, Y ES LA ÚLTIMA INSTRUCCIÓN DEL SWITCH
                        System.out.println("Número no válido(Solo del 1 al 7)");

                
        }
    }
    
}
