/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Gloria
 */
public class Pelicula extends Obra{
    private String productora;
    private Artista[] interpretes;
    
    public Pelicula()
    {
    }
    
public Pelicula (String titu, String Autor, int aEd, String Prod, Artista[] inter)
{
      this.setTitulo(titu);
      this.setAutor(Autor);
      this.setAnoEdicion(aEd);
      this.productora=Prod;
      this.interpretes=inter;
}


public Artista[] getInterpretes()
{
return interpretes;
}     
        
public void setInterpretes(Artista[] inter1)
{
this.interpretes=inter1;
}  

 public String getProductora()
{
 return productora;
}     
        
public void setProductora(String productor)
{
this.productora=productor;
}     

public void imprimir()
{
 System.out.println(" Titulo "+this.getTitulo());
 System.out.println(" Autor "+this.getAutor());
 System.out.println(" Año de Edicion "+this.getAnoEdicion());   
 System.out.println(" Productora "+productora);
 
}
    
}



