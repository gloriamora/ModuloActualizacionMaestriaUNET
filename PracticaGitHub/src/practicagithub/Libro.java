/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

public class Libro extends Obra {

  private String editorial;
  private int nPaginas;
  private Obra Oautor;
    
    /**
     *
     * @param editor
     * @param titu
     * @param autoR
     * @param aO
     * @param pag
     */
    public Libro(String editor, String titu, String autoR, int aO,int pag)

    {
      this.editorial=editor;
      this.Oautor.setTitulo(titu);
      this.Oautor.setAnoEdicion(aO);
      this.Oautor.setAutor(autoR);
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
