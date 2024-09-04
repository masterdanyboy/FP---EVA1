/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_10_operaciones2;

/**
 *
 * @author Usuario
 */
public class EVA_1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONCATENACIÓN CADENAS:
        //OPERADOR DE CONCATENACIÓN +
        //Mismo símbolo con diferentes usos:
        //sobrecarga de operadores
        String nombre = "Daniel";
        String apellido = "Navarrete";
        String nomComp;
        
        //concatenar: unir cadenas de texto
        nomComp = nombre + " " + apellido;
       
        
        //imprimir los datos        
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Apellido del usuario: " + apellido);
        System.out.println("Nombre completo: " + nomComp);
                
    }
    
}
