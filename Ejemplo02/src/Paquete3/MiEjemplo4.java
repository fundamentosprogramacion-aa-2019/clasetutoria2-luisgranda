/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import java.util.Scanner;

/**
 *
 * @author brisheth
 */
public class MiEjemplo4 {
    public static void main(String[] args) {
        String nombrePersona; // es la variable para almacenar un nombre
        String ciudad;
        int promedio;
        int edad;
        int nota1;
        int nota2;
        
        Scanner entrada = new Scanner(System.in); // me permite ingresar info
        
        System.out.println("Ingrese su Nombre por favor: ");
        nombrePersona = entrada.nextLine();
        
        System.out.println("Ingrese su Edad por favor: ");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su primer nota por favor: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese su segunda nota por favor: ");
        nota2 = entrada.nextInt();
        
        promedio = (nota1 + nota2)/2 ;
        
        entrada.nextLine(); // esto es una limpiesa de mi buffer de entrada
        System.out.println("Ingrese su Ciudad por favor: ");
        ciudad = entrada.nextLine();
        
        
        
        System.out.printf("Mi nombre es: %s\nMi ciudad es: %s\nMi edad es: "
                + "%d\nMis notas son: %d y %d \nMi Promedio es: %d", 
                nombrePersona, ciudad, edad, nota1, nota2, promedio);
        
    }
    
}
