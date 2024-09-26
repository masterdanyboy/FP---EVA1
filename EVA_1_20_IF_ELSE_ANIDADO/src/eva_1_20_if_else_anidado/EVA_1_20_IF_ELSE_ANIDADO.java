/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_20_IF_ELSE_ANIDADO {

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
        
        if(díaSem == 1){
            System.out.println("Domingo");
        }else if (díaSem == 1){
            System.out.println("Lunes");
        }else if (díaSem == 2){
            System.out.println("Martes");
        }else if (díaSem == 3){
            System.out.println("Miércoles");
        }else if (díaSem == 4){
            System.out.println("Jueves");
        }else if (díaSem == 5){
            System.out.println("Viernes");
        }else if (díaSem == 6){
            System.out.println("Sábadazo");
        }else if (díaSem == 7){
        }else{
            System.out.println("Número de día es incorrecto!!");
        }
    }
}