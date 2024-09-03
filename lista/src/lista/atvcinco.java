
package lista;
import java.util.Scanner;

public class atvcinco {
   Scanner sc = new Scanner(System.in);
   private String frase;
   public atvcinco(String frase){
      this.frase = frase;
      
      
   }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
   public void impri(){
       System.out.println("digite algo");
       frase = sc.next();
       System.out.println(frase.replaceAll("a","*"));
       
   }
}
