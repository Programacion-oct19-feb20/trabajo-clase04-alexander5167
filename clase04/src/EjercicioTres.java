
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
public class EjercicioTres {
    /*
    
    Generar un programa que permita pedir datos por teclado para:
    Ingreso de nombre completos del Estudiante
    Ingreso de nota 1
    Ingreso de nota 2
    Ingreso el ciclo que cura el alumno
    
    luego presentar en pantalla los datos de la siguiente forma
    Informe de alumno:
    Nombre Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    
   /*
    
    */
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        String nombresCompletos;
        int nota1;
        int nota2 ;
        String ciclo ;
        
        
        System.out.println("Ingrese sus Nombres Completos");
        nombresCompletos = entrada.nextLine();
        
        System.out.println("Ingrese Nota 1");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese Nota 2");
        nota2 = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese Ciclo que esta Cursando");
        ciclo = entrada.nextLine();
        
        
        System.out.printf("Informe Alumno:\nnombresCompletos:%s\n\nciclo:%s"
                + "\nnota1:%s\nnota2:%s\n",nombresCompletos,ciclo,nota1,nota2);
          
}
}