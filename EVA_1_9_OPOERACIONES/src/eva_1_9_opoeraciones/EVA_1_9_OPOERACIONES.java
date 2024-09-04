/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_opoeraciones;

/**
 *
 * @author Usuario
 */
public class EVA_1_9_OPOERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMÉTICAS
        int x = 10;//declaración y asignación
        int y = 5;
        //si necesitamos muchas variables:
        int suma, resta, mult, div, pot, raiz;
        //suma y resta
        suma = x  + y; //operador de suma +
        System.out.println("La suma de x + y :");
        System.out.println(suma);
        
        resta = x - y;
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        //MULTIPLICACIÓN
        mult = x * y;// OPERADOR DE MULTIPLICACIÓN
        System.out.println("La multiplicación de x * y");
        System.out.println(mult);
        
        //DIVISIÓN
        //En Java, las operaciones dependen del tipo de datos
        //divides entero, Java da como resultado entero
        div = x / y; //operador de la división /
        System.out.println ("El resultado de la división");
        System.out.println(div);
        
        x = 5;
        y = 2;
        div = x / y;
        
        System.out.println("División de x (5) / y (2)");
        System.out.println(div);
        
        //división con números
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        
        System.out.println(val1);
        System.out.println(val2);
                
                
        
    }
    
}
