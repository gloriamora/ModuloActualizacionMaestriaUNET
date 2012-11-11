/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Autores de la Practica de GitHub
 * Integrantes: García Maiguel  C.I. 13.350.705
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
    static Libro[] obritaL;
    static Disco[] obritaD;
    static String Ob="", Titulo, AutorO, editori,discogra, busquedad="";
    static int nob=0, anoA=0,nro_obras=0, con_obras=0,npag=0 , ncanc=0;     
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
               
                System.out.println("Indique la cantidad de artistas a cargar: ");
                numero_artistas =Integer.parseInt(lectura.readLine());
                int conArt=0;
                xArtistas = new Artista[numero_artistas]; 
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
                System.out.println("****************************************"); 
                System.out.println("Los Datos Registrados del Artista son:"); 
                System.out.println("Artista : "+xArtistas[indice].getNombre());
                System.out.println("Anio de Nacimiento del Artista : "+xArtistas[indice].getAnoNacimiento());      
                System.out.println("****************************************"); 
                
                indice++;
               }
                
                break;
           case 2:
                                do
                {   
                System.out.println("Desea cargar Libro (L) o Disco (D) ");
                try
                    {
                      Ob=lectura.readLine();  
                    }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado ");          
                    }    
                
                } while(Ob.equals("") || (!Ob.equalsIgnoreCase("L") && !Ob.equalsIgnoreCase("D")) );
                
                do
                {   
                  System.out.println("Cuantas va a registrar?? ");
                  try
                    {
                      nro_obras=Integer.parseInt(lectura.readLine());  
                    }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (nro_obras==0);
                if(Ob.equalsIgnoreCase("L")) {
              obritaL = new Libro[nro_obras];
          }
                  if(Ob.equalsIgnoreCase("D")) {
              obritaD = new Disco[nro_obras];
          }
                
                con_obras=0;
                for (int j=0;j<nro_obras;j++){
                Titulo="";
                AutorO="";
                anoA=0;
                editori="";
                discogra="";
                con_obras=con_obras+1;
                
                     System.out.print("Ingrese Datos del registro "+con_obras+ ": ");                
                     do
                     {
                     System.out.println("\n Titulo: "); 
                     try
                     {
                      Titulo=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                     }    
                    }while(Titulo.equals(""));
                
                System.out.println("Los Autores existentes son: ");
                
                int totart=xArtistas.length,Secuen=0;
                for (int o=0;o<totart;o++)
                {                   
                    Secuen=Secuen+1;
                     System.out.println(xArtistas[o].getNombre()+"------>"+Secuen);
                }
                System.out.println("Seleccione el autor por el numero que lo identifica");
                
                int posActor=0;
                posActor=Integer.parseInt(lectura.readLine());
                AutorO=xArtistas[posActor-1].getNombre();  
                System.out.println("El autor Seleccionado es : "+AutorO);                
                
                do
                {
                System.out.println("Ano de Edicion");
                try
                {
                anoA=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (anoA==0);

                   if(Ob.equalsIgnoreCase("L"))
                    {
                     do
                     {
                     System.out.println("\n Editorial: "); 
                     try
                     {
                      editori=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                     }    
                    }while(editori.equals(""));
                     
                do
                {
                System.out.println("Nro de Paginas");
                try
                {
                npag=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (npag==0);
                
                obritaL[j] = new Libro(editori, Titulo, AutorO, anoA,npag);
               }//Fin del else Libros
                    if(Ob.equalsIgnoreCase("D"))
                    {
                     do
                     {
                     System.out.println("\n Discografia : "); 
                     try
                     {
                      discogra=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                     }    
                    }while(discogra.equals(""));
                     
                do
                {
                System.out.println("Nro de Canciones");
                try
                {
                ncanc=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (ncanc==0);
                obritaD[j] = new Disco(discogra, AutorO, ncanc , Titulo, anoA);             
                    }
               
                   
            
                do
                 {
                   System.out.println("Que desea buscar Libros(L) o Discos(D) ");
                   try
                   {
                     busquedad=lectura.readLine();  
                   }
                   catch (IOException e)
                   {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                   }    
                 }while(busquedad.equals(""));
                        
                 if(busquedad.equalsIgnoreCase("L"))       
                 {                        
                    System.out.println("Los libros registrados son ");
                    int Secuen1=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                   
                       Secuen1=Secuen1+1;
                       System.out.println("Libro "+obritaL[Z].getTitulo()+"----->"+Secuen1);  
                    }
                    System.out.println("\n Seleccione el titulo del libro a busca por el numero que lo indica ");
                    int posLibro=0;
                    posLibro=Integer.parseInt(lectura.readLine());
                    System.out.println("************************");
                    System.out.println("Los Datos del libro son:");
                    System.out.println("Titulo "+obritaL[posLibro-1].getTitulo()+" Autor "+obritaL[posLibro-1].getAutor()+" Editorial "+obritaL[posLibro-1].getEditorial()+" Nro Paginas "+obritaL[posLibro-1].getNPaginas());                 
                    System.out.println("************************\n");
                    System.out.println("Consultar Editorial y Nro de Paginas ");
                    System.out.println("*************************************");
                    
                    String Cedito="";
                    int nPagB=0;                    
                     do
                     {
                     System.out.println("\n Ingrese La Editorial: "); 
                     try
                     {
                      Cedito=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                     }    
                    }while(Cedito.equals(""));
                     
                    do
                    {
                    System.out.println("\n Ingrese el Nro Paginas: ");
                    try
                    {
                    nPagB=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Error: Debe ingresar un valor numerico");          
                        }    
                    }while (nPagB==0);
                    
                    int sw=0,Secuen=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                    
                       Secuen=Secuen+1;
                       if(obritaL[Z].getEditorial().equals(Cedito) && obritaL[Z].getNPaginas()==nPagB)
                       {    
                           System.out.println("Encontro el registro en la posicion "+Secuen+" el registro es: "); 
                           System.out.println("Titulo "+obritaL[Z].getTitulo()+" Autor "+obritaL[Z].getAutor()+" Editorial "+obritaL[Z].getEditorial()+" Nro Paginas "+obritaL[Z].getNPaginas());                 
                           sw=1;
                       }
                         
                    }
                    if (sw!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados");
                    
                 }
                    
                 }
               }//Fin del for
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
