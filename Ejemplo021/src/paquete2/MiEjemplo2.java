/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author brisheth
 */
public class MiEjemplo2 {
    public static void main(String[] args) {
        // este metodo es el principal de mi clase
        String nombrePersona; // es la variable para almacenar un nombre
        String apellidoPersona;
        int edad;
        
        nombrePersona = "Luis Granda";
        apellidoPersona = "Granda Aguilar";
        edad = 36;
        
        Scaner entrada = new Scaner(System.in);
        /**
        System.out.println("Mi nombre es: "+nombrePersona+"\n\n\tMi apellido "
                + "es: " +apellidoPersona);
        */
        System.out.printf("Mi nombre es: %s\n\tMi apellido es: %s\nMi edad es: %s",
                nombrePersona, apellidoPersona, edad);
    }
    
}
