/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Maiguel
 */


public class Disco extends Obra{
   private String discografia;
    private int nCanciones;
    
    public Disco()
    {
    }
    
public Disco (String disco, String Art, int Canc, String titu, int Aedic  )
  {
      this.discografia=disco;
      this.setTitulo(titu);
      this.setAutor(Art);
      this.setAnoEdicion(Aedic);
      this.nCanciones=Canc;
  }
  
public String getDiscografia()
{
return discografia;
}

public void setDiscografia(String disco)
{
this.discografia=disco;
}        

public int getNCanciones()
{
return nCanciones;
}     
        
public void setCanciones(int ncan)
{
this.nCanciones=ncan;
}  

    
public void imprimir()
{
 System.out.println(" Titulo "+this.getTitulo());
 System.out.println(" Autor "+this.getAutor());
 System.out.println(" Año de Edicion "+this.getAnoEdicion());   
 System.out.println(" Discografia "+discografia);
 System.out.println(" Nro Canciones "+nCanciones);
}   
    
    
}
