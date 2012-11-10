/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Gloria
 */


public class Obra {
    
    private String titulo;
  private int anoEdicion;
  private Artista autor;

   
   public Obra (String titu, int anoE, String nA)
    {
      this.anoEdicion=anoE;
      this.autor.setNombre(nA);
      this.titulo=titu;
  }
  
   public String getTitulo()
  {
   return titulo;
  }
   
    public void setTitulo(String ti)
  {
   this.titulo=ti;
  }
  
   public String getAutor()
  {
   return autor.getNombre();
  }
  
     public void setAutor(String aut)
  {
   this.autor.setNombre(aut);
  }
   
  public int getAnoEdicion()
  {
   return anoEdicion;
  }

  public void setAnoEdicion(int ae)
  {
   this.anoEdicion=ae;
  }
   
  
  
  
}
