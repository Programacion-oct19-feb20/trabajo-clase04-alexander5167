
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    Ingreso de nombre
    Ingreso de ciudad de ncimiento
    Ingreso de edad
    Ingreso de costo de matricula
    
    luego presentar en pantalla los datos de la siguiente forma
    Datos Personales:
    Nombre:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
  
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String Nombres;
        String ciudadNacimiento ;
        int edad;
        double matricula ;
        
        System.out.println("Ingrese sus Nombres");
        Nombres = entrada.nextLine();
        
        System.out.println("Ingrese su ciudad de nacimiento");
        ciudadNacimiento = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt(); // Ingreso de enteros
        
        System.out.println("Ingrese costo de matricula");
        matricula = entrada.nextDouble();  // Ingreso de decimales
        
        System.out.printf("Datos Personales:\nNombres:%s"
                + "\nCiudad de Nacimiento:%s\nEdad:%d\nMatricula:%.2f\n",Nombres 
                , ciudadNacimiento, edad, matricula);
               
}
}