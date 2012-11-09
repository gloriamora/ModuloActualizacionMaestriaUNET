/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Autores de la Practica de GitHub
 * Integrantes: García Maigel  C.I. 13.350.705
 *              García Ysmary  C.I. 14.942.513
 *              Mora Gloria    C.I. 10.164.768
 *              Ordoñez Rosmary C.I.15.028.532 
 * 
 * /**
 *
 * @author GRUPO DE MODULO DE PROGRAMACION de la MAESTRIA EN INFORMATICA UNET
 */
package practicagithub;

import java.io.*;

/**
 *

 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
         BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
    int opcion;
    do
      {   
        opcion=0;

        System.out.println("******* Opciones del Sistema *******");
        System.out.println("Crear Artista --------------------->1");
        System.out.println("Registrar Obras del Artista ------->2");     
        System.out.println("Registrar Peliculas del Artista --->3"); 
        System.out.println("Reportes -------------------------->4"); 
        System.out.println("Salir  ---------------------------->5"); 
        System.out.println(""); 
        System.out.print("Ingrese Opcion : ");             

        try
         {
          opcion=Integer.parseInt(lectura.readLine());  
         }
        catch (IOException e)
         {
          System.out.println("Error: Se ha producido un error en la lectura de la opcion");          
         }    
        catch (NumberFormatException e)
         {
          System.out.println("Error: Debe ingresar un valor numerico ");          
         }    

        switch(opcion)
         {
           case 1:
                System.out.println("Modulo en Construcción"); 
                break;
           case 2:
                System.out.println("Modulo en Construcción");    
                break;
           case 3:
                System.out.println("Modulo en Construcción");    
                break;
           case 4:
                System.out.println("Modulo en Construcción");    
                break;
           case 5:
                System.out.println("Ha salido del sistema"); 
                break;
           default :               
                System.out.println("La opcion no es valida");                
         }   
     }while(opcion!=5);  
      
               
               
        
    }
}
