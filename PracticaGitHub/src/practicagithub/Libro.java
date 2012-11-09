/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

public class Libro  extends Obra {

  private String editorial;
  private int nPaginas;
  private Obra Oautor;
    
    public Libro(String edit, String titu, String autoR, int aO,int pag)
    {
      this.editorial=edit;
      this.Oautor.setTitulo(titu);
      this.Oautor.setAutor(autoR);
      this.Oautor.setAnoEdicion(aO);
      this.nPaginas=pag;
  }
  
   public String getEditorial()
  {
   return editorial;
  }
   
    public void setEditorial(String edito)
  {
   this.editorial=edito;
  }
  
   public int getNPaginas()
  {
   return nPaginas;
  }
  
    public void setNPaginas(int paginas)
  {
   this.nPaginas=paginas;
  }


  public void imprimir()
  {
 
  }
   
}
