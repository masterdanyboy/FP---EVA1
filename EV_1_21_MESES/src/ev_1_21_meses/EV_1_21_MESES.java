/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev_1_21_meses;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EV_1_21_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el número del mes (1 a 12)");
        meses = captu.nextInt();
        captu.nextLine();
        
        if(meses ==1){
            System.out.println("Enero");
        }else if (meses == 2){
            System.out.println("Febrero");
        }else if (meses == 2){
            System.out.println("Febrero");
        }else if (meses == 3){
            System.out.println("Marzo");
        }else if (meses == 4){
            System.out.println("Abril");
        }else if (meses == 5){
            System.out.println("Mayo");
        }else if (meses == 6){
            System.out.println("Junio");
        }else if (meses == 7){
            System.out.println("Julio");
        }else if (meses == 8){
            System.out.println("Agosto");
        }else if (meses == 9){
            System.out.println("Septiembre");
        }else if (meses == 2){
            System.out.println("Octubre");
        }else if (meses == 2){
            System.out.println("Noviembre");
        }else if (meses == 2){
            System.out.println("Diciembre");
        }else{
            System.out.println("Número del mes es incorrecto!!!");
                    
        }
    }
    
}
