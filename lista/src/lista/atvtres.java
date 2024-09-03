
package lista;

public class atvtres {
  String ola ;
  String mundo ;
  String junto = ola + ", " + mundo ;
  public atvtres(String ola,String mundo,String junto){
  this.ola = ola;
  this.junto = junto;
  this.mundo = mundo;
 
      
      
  }

    public String getOla() {
        return ola;
    }

    public void setOla(String ola) {
        this.ola = ola;
    }

    public String getMundo() {
        return mundo;
    }

    public void setMundo(String mundo) {
        this.mundo = mundo;
    }

    public String getJunto() {
        return junto;
    }

    public void setJunto(String junto) {
        this.junto = junto;
    }
  public void impri(){
      junto = ola + ", " + mundo;
      System.out.println(junto);
  }
  
  
}
