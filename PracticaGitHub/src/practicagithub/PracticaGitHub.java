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
    static Pelicula[] obritaP;
    static String Ob="", Titulo, AutorO, editori,discogra, busquedad="", productor, AutorP;
    static int nob=0, anoA=0,  nro_obras=0, con_obras=0,npag=0 , ncanc=0, nro_peliculas=0, anoP=0, opcrepor=0; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        menuP();
    }
    public static void menuP() throws IOException {        
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
                System.out.print("Ingrese Año de Nacimiento del Artista : ");      
                try
                    {
                    xAnio=Integer.parseInt(lectura.readLine());  
                    }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del Año");          
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
                System.out.println("Año de Nacimiento del Artista : "+xArtistas[indice].getAnoNacimiento());      
                System.out.println("****************************************"); 
                
                indice++;
               }
                
                break;
           case 2:
                                do
                {   
                System.out.println("Desea cargar un Libro (L) o un Disco (D) ");
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
                  System.out.println("¿Cuantas va a registrar? ");
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
                System.out.println("Año de Edición");
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
                    System.out.println("Los libros registrados son: ");
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
                    System.out.println("*************************************");
                    System.out.println("Consultar Editorial y Nro de Paginas ");
                    System.out.println("*************************************");
                    
                    String Cedito="";
                    int nPagB=0;                    
                     do
                     {
                     System.out.println("\n Ingrese la Editorial: "); 
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
                    
                    int sw=0,SecuenB=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                    
                       SecuenB=SecuenB+1;
                       if(obritaL[Z].getEditorial().equals(Cedito) && obritaL[Z].getNPaginas()==nPagB)
                       {    
                           System.out.println("Encontro el registro en la posicion "+SecuenB+" el registro es: "); 
                           System.out.println("Titulo "+obritaL[Z].getTitulo()+" Autor "+obritaL[Z].getAutor()+" Editorial "+obritaL[Z].getEditorial()+" Nro Paginas "+obritaL[Z].getNPaginas());                 
                           sw=1;
                       }
                         
                    }
                    if (sw!=1) {
                         System.out.println("\n Los datos buscados no se encuentran cargados");
                     }
                    }//busqueda del libro con la consulta editorial y paginas
                 
                 
                  if(busquedad.equalsIgnoreCase("D"))       
                 {                        
                    System.out.println("Los Discos registrados son: ");
                    int Secuen1=0;
                    for (int Z=0;Z<obritaD.length;Z++)
                    {                   
                       Secuen1=Secuen1+1;
                       System.out.println("Discos "+obritaD[Z].getTitulo()+"----->"+Secuen1);  
                    }
                    System.out.println("\n Seleccione el titulo del Disco a busca por el numero que lo indica ");
                    int posDisco;
                    posDisco=Integer.parseInt(lectura.readLine());
                    System.out.println("************************");
                    System.out.println("Los Datos del disco son: ");
                    System.out.println("Titulo "+obritaD[posDisco-1].getTitulo()+" Autor "+obritaD[posDisco-1].getAutor()+" Discografia "+obritaD[posDisco-1].getDiscografia()+" Nro Canciones "+obritaD[posDisco-1].getNCanciones());                 
                    System.out.println("************************\n");
                                     System.out.println("\n*************************************");
                    System.out.println("Consultar Discografia y Nro de Canciones ");
                    System.out.println("*************************************");
                    
                    String Cedito="";
                    int nDisB=0;                    
                     do
                     {
                     System.out.println("\n Ingrese La Discografia: "); 
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
                    System.out.println("\n Ingrese el Nro Canciones: ");
                    try
                    {
                    nDisB=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Error: Debe ingresar un valor numerico");          
                        }    
                    }while (nDisB==0);
                    
                    int sw=0,Secu=0;
                    for (int Z=0;Z<obritaD.length;Z++)
                    {                    
                       Secu=Secu+1;
                       if(obritaD[Z].getDiscografia().equals(Cedito) && obritaD[Z].getNCanciones()==nDisB)
                       {
                           System.out.println("Encontro el registro en la posicion "+Secu+" el registro es: "); 
                           System.out.println("Titulo "+obritaD[Z].getTitulo()+" Autor "+obritaD[Z].getAutor()+" Discografia "+obritaD[Z].getDiscografia()+" Nro Discografia "+obritaD[Z].getNCanciones());                 
                           sw=1;
                       }
                        
                    }
                    if (sw!=1) {
                         System.out.println("\n Los datos buscados no se encuentran cargados");
                     }
             
                 }
             
                     break;
           case 3:             
                do
                    {
                    System.out.println("\n Cuantas peliculas va a registrar?? : ");
                    try
                    {
                    nro_peliculas=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Error: Debe ingresar un valor numerico");          
                        }    
                    }while (nro_peliculas==0);
                
                int con_pelis=0, can_inter=0, pelis=0;
                 for(int jPel=0;jPel<nro_peliculas;jPel++){
                    pelis=jPel+1;
                  System.out.println("Cargue el Autor Para la Pelicula: "+pelis);
                
                int totart=xArtistas.length,Secuen=0;
                for (int o=0;o<totart;o++)
                {                   
                    Secuen=Secuen+1;
                     System.out.println(xArtistas[o].getNombre()+"------>"+Secuen);
                }
                System.out.println("Seleccione el autor por el numero que lo identifica");
                
                int posActorP=0;
                posActorP=Integer.parseInt(lectura.readLine());
                AutorP=xArtistas[posActorP-1].getNombre();  
                System.out.println("El autor Seleccionado es : "+AutorP);                
              
                 do
                {
                System.out.println("Ano de Edicion");
                try
                {
                anoP=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Error: Debe ingresar un valor numerico");          
                    }    
                }while (anoP==0);
                    
                
                   productor="";
                   con_pelis=con_pelis+1;
                   System.out.println("\n Ingrese Datos del registro "+con_pelis+ ":");
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
                   do
                    {
                    System.out.println("\n Productora: ");
                    try
                    {
                    productor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Error: Debe ingresar un valor numerico");          
                        }    
                    }while (productor.equals(""));
                   
                
                   do
                    {
                    System.out.println("\n Ingrese el numero de interpretes: ");
                    try
                    {
                    can_inter=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Error: Debe ingresar un valor numerico");          
                        }    
                    }while (can_inter==0);
                   Artista [] inter = new Artista[can_inter]; 
                   Pelicula [] obritaP= new Pelicula [nro_peliculas]; 
                for (int oA=0;oA<can_inter;oA++)
                {
                    inter [oA] = new Artista(); 
                    System.out.println("Los Autores existentes son: ");
                    int totartP=xArtistas.length,SecuenP=0;
                    for (int o1P=0;o1P<totartP;o1P++)
                    {                   
                        SecuenP=SecuenP+1; 
                        System.out.println(xArtistas[o1P].getNombre()+"------>"+SecuenP);
                    }
                    int posActor1=0;
                    System.out.println("Seleccione el autor por el numero que lo identifica");
                    posActor1=Integer.parseInt(lectura.readLine());
                    System.out.println("El autor Seleccionado es : "+xArtistas[posActor1-1].getNombre());                
                    inter[oA].setNombre(xArtistas[posActor1-1].getNombre()); 
                 }
                //aquiiiiiiiiiiiiiiiiiiiiiiiiii
                obritaP[jPel] = new Pelicula (Titulo, AutorP, anoP, productor,inter);
                //
               }
                 
                   //busqueda de pelicula con todo los atributos
                System.out.println("Las Peliculas registradas son ");
                    int SecuenP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                   
                       SecuenP=SecuenP+1;
                       System.out.println("Pelicula "+obritaP[Z].getTitulo()+"----->"+SecuenP);                     
                       
                    }
                    System.out.println("\n Seleccione el titulo de la pelicula a busca por el numero que lo indica ");
                    int posPelicu=0;
                    posPelicu=Integer.parseInt(lectura.readLine());
                    System.out.println("************************");
                    System.out.println("Los Datos del pelicula son:");
                    System.out.println("Titulo "+obritaP[posPelicu-1].getTitulo()+" Autor "+obritaP[posPelicu-1].getAutor()+" Productora "+obritaP[posPelicu-1].getProductora());                 
                    
                         for (int Z1=0;Z1<obritaP[posPelicu-1].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[posPelicu-1].getInterpretes()[Z1].getNombre());
                    
                    }
                    System.out.println("************************\n");
                 
                    System.out.println("\n*************************************");
                    System.out.println("Consultar Productora ");
                    System.out.println("*************************************");
                    
                    String Conpro="";
                     do
                     {
                     System.out.println("\n Ingrese La Productora: "); 
                     try
                     {
                      Conpro=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                     }    
                    }while(Conpro.equals(""));
                     
                    int swP=0,SecuenBP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                    
                       SecuenBP=SecuenBP+1;
                       if(obritaP[Z].getProductora().equals(Conpro))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SecuenBP+" el registro es: "); 
                           System.out.println("Titulo "+obritaP[Z].getTitulo()+" Autor "+obritaP[Z].getAutor()+" Productora "+obritaP[Z].getProductora());                 
                           for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[Z].getInterpretes()[Z1].getNombre());
                    
                    }
                           swP=1;
                       }
                         
                    }
                    if (swP!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados");
                break;
          
           case 4:
                menuReportes();
               break;
    
           case 5:
                System.out.println("Ha salido del sistema"); 
                break;
           default :               
                System.out.println("La opcion no es valida");                
         }   
     }while(opcion!=5);  
         
               
    }


    public static void menuReportes() throws IOException 
    {
        // TODO code application logic here
         BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
     
    do
      {   
        opcrepor=0;

        System.out.println("******* Opciones de los Reportes *******");
        System.out.println("Generar Listado de Obras ---------------------------------->1");
        System.out.println("Generar Listado de Peliculas ------------------------------>2");     
        System.out.println("Busqueda de todas las Obras de un Autor (Nombre)  --------->3"); 
        System.out.println("Busqueda de todas las Peliculas de un Autor (Nombre)------->4"); 
        System.out.println("Regresar al menu principal--------------------------------->5"); 
        System.out.println(""); 
        System.out.print("Ingrese Opcion : ");             

        try
         {
          opcrepor=Integer.parseInt(lectura.readLine());  
         }
        catch (IOException e)
         {
          System.out.println("Error: Se ha producido un error en la lectura de la opcion");          
         }    
        catch (NumberFormatException e)
         {
          System.out.println("Error: Debe ingresar un valor numerico ");          
         }    

        switch(opcrepor)
         { 
            case 1:
            { 
                System.out.println("Listado de Libros ");
                System.out.println("--------------------------------------------");
                for (int Z=0;Z<obritaL.length;Z++) 
                {
                    System.out.println("Informacion Del Registro");
                       obritaL[Z].imprimir();
                       System.out.println("------------------------------------");
                }
                System.out.println("******************************************* ");
                System.out.println("Listado de Discos ");
                for (int Z=0;Z<obritaD.length;Z++) 
                {
                    System.out.println("Informacion Del Registro");
                       obritaD[Z].imprimir();
                       System.out.println("------------------------------------");
                }
                break;
            }  
            case 2:
            {
              System.out.println("Listado de Peliculas ");
                for (int Z=0;Z<obritaP.length;Z++) 
                {
                    System.out.println("Informacion Del Registro");
                       obritaP[Z].imprimir();
                            for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[Z].getInterpretes()[Z1].getNombre());
                    
                    }
                       System.out.println("------------------------------------");
                }
                break;
            }
          
            
            case 3:
            {
                String nombreAutor="";                
                 do
                    {
                    System.out.println("\n Ingrese el nombre del autor: ");
                    try
                    {
                    nombreAutor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                    }while (nombreAutor.equals(""));
                    
                    int sL=0,SeBL=0,sD=0,SeBD=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                    
                       SeBL=SeBL+1;
                       if(obritaL[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SeBL+" el registro es: "); 
                           System.out.println("El Titulo del Libro es "+obritaL[Z].getTitulo()+" Autor "+obritaL[Z].getAutor()+" Editorial "+obritaL[Z].getEditorial()+" Nro Paginas "+obritaL[Z].getNPaginas());                 
                           sL=1;
                       }
                         
                    }
                    if (sL!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados en libros ");

                    for (int Z=0;Z<obritaD.length;Z++)
                    {                    
                       SeBD=SeBD+1;
                       if(obritaD[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SeBD+" el registro es: "); 
                           System.out.println("El Titulo del Disco es "+obritaD[Z].getTitulo()+" Autor "+obritaD[Z].getAutor()+" Discografia "+obritaD[Z].getDiscografia()+" Nro Canciones "+obritaD[Z].getDiscografia());                 
                           sD=1;
                       }
                         
                    }
                    if (sD!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados");
                    break;
            }  
            case 4:
                {
                 String nombreAutor="";                
                 do
                  {
                    System.out.println("\n Ingrese el nombre del autor de la pelicula: ");
                    try
                    {
                    nombreAutor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Error: Se ha producido un error en la lectura del valor ingresado");          
                        }    
                   }while (nombreAutor.equals(""));
                    
                    int sP=0,SeBP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                    
                       SeBP=SeBP+1;
                       if(obritaP[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SeBP+" el registro es: "); 
                           System.out.println("El Titulo de la pelicula es "+obritaP[Z].getTitulo()+" Autor "+obritaP[Z].getAutor()+" Productora "+obritaP[Z].getProductora());
                           for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[Z].getInterpretes()[Z1].getNombre());
                    
                    }
                           sP=1;
                       }
                         
                    }
                    if (sP!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados en libros ");

                   break;
                }
            case 5:
            {
                menuP();
                break;
            }
        }
      }while(opcrepor!=5);
    }//fin del menu    
        
} //fin clase 


    
    

