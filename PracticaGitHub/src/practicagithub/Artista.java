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
   this.nombre=n;
   this.anoNacimiento=a;
 
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
