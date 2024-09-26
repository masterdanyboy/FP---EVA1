/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_23_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el número del día (1 a 19");        
        mes = captu.nextInt ();
        captu.nextLine();
        //ELEGIR ENTRE MÚLTIPLES ALTERNATIVAS
        switch (mes){
            case 1:
                System.out.println("Enero");
                break; //Interrumpe el switch (lo termina)
            case 2:
                System.out.println("Febrero");
                break; //Interrumpe el switch (lo termina)
            case 3:
                System.out.println("Marzo");
                break; //Interrumpe el switch (lo termina)
            case 4:
                System.out.println("Abril");
                break; //Interrumpe el switch (lo termina)
            case 5:
                System.out.println("Mayo");
                break; //Interrumpe el switch (lo termina)
            case 6:
                System.out.println("Junio");
                break; //Interrumpe el switch (lo termina)
            case 7:
                System.out.println("Julio");
                break; //Interrumpe el switch (lo termina)
            case 8:
                System.out.println("Agosto");
                break; //Interrumpe el switch (lo termina)
            case 9:
                System.out.println("Septiembtre");
                break; //Interrumpe el switch (lo termina)
            case 10:
                System.out.println("Octubre");
                break; //Interrumpe el switch (lo termina)
            case 11:
                System.out.println("Noviembre");
                break; //Interrumpe el switch (lo termina)
            case 12:
                System.out.println("Diciembre");
                break; //Interrumpe el switch (lo termina)
            default://opcional, se ejecuta, cuando no existe una opción
                    //no tiene break, Y ES LA ÚLTIMA INSTRUCCIÓN DEL SWITCH
                        System.out.println("Número no válido(Solo del 1 al 12)");
    }
    
}
}