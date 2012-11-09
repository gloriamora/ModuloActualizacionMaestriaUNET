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
    static Artista[] xArtistas;
    static int numero_artistas;
    static String xNombre;
    static int xAnio;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
         BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
    int opcion,indice;
      indice=0;
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
                xArtistas = new Artista[800]; 
                System.out.println("Indique la cantidad de artistas a cargar: ");
                numero_artistas =Integer.parseInt(lectura.readLine());
                int conArt=0;
                for (int i=0;i<numero_artistas ;i++){
                xNombre="";
                xAnio=0;               
                conArt=conArt+1;
                do
                {   
                System.out.print("Ingrese el Artista "+conArt+ ": ");
                System.out.print("\n Ingrese Nombre del Artista : ");
                try
                    {
                    xNombre=lectura.readLine();  
                    }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del nombre");          
                    }    
                } while(xNombre.equals(""));
                do
                {   
                System.out.print("Ingrese Anio de Nacimiento del Artista : ");      
                try
                    {
                    xAnio=Integer.parseInt(lectura.readLine());  
                    }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del Anio");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (xAnio==0);
                xArtistas[indice]= new Artista(xNombre,xAnio);  
                System.out.println("Los Datos Registrados del Artista son :"); 
                System.out.println("Artista : "+xArtistas[indice].getNombre());
                System.out.println("Anio de Nacimiento del Artista : "+xArtistas[indice].getAnoNacimiento());      
                indice++;
               }
                
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
