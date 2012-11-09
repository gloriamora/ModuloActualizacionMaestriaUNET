/*
 * Clase ARTISTA
 * Grupo Gloria, Maiguel, Rosmary, Ysmary
 * Maestria en Informatica
 */
package practicagithub;

/**
 *
 * @author Gloria
 */
public class Artista {
    
  private String nombre;
  private int anoNacimiento;
  
  public Artista (String n, int a)
  {
   setNombre(n);
   setAnoNacimiento(a);
 
  }     
   public int getAnoNacimiento()
  {
   return anoNacimiento;
  }        
   public void setAnoNacimiento(int a)
  {
   this.anoNacimiento=a;   
  }        
   public String getNombre()
  {
   return nombre;   
  }        
   public void setNombre(String n)
  {
   this.nombre=n;   
  }        
 
  
  
}
