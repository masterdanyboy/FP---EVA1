/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_17_CONTROL_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear variables y capturar usuario y contraseña
        String usu, pwd;
        Scanner captu = new Scanner (System.in);
        System.out.println("Usuario: ");
        usu = captu.nextLine();
        System.out.println("Password: ");
        pwd = captu.nextLine();
        
        if(usu.equals("Admin") && pwd.equals ("1234")){
            System.out.println("Acceso concedido!!!");
        }else{
            System.out.println("Acceso denegado!!");
        }
        
    }
    
}
