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


    
}

