/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Scanner;

/**
 *
 * @author brisheth
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        // este metodo es el principal de mi clase
        String nombrePersona; // es la variable para almacenar un nombre
        String apellidoPersona;
        String ciudad;
        int edad;
        
        
        Scanner entrada = new Scanner(System.in); // me permite ingresar info
        
        System.out.println("Ingrese su Nombre por favor: ");
        nombrePersona = entrada.nextLine();
        System.out.println("Ingrese su Apellido por favor: ");
        apellidoPersona = entrada.nextLine();
        System.out.println("Ingrese su Edad por favor: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // esto es una limpiesa de mi buffer de entrada
        System.out.println("Ingrese su Ciudad por favor: ");
        ciudad = entrada.nextLine();
        
        System.out.printf("Mi nombre es: %s\nMi apellido es: "
                + "%s\nMi edad es: %s\nMi ciudad es: %s", 
                nombrePersona, apellidoPersona, edad, ciudad);

        
    }
    
}
