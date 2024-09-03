/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.Scanner;
public class atvquarto {
    Scanner sc = new Scanner(System.in);    
    private String frase;
    private String fraseC;
public atvquarto (String frase){

    this.frase = frase;

}

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }


public void impri(){
    String frasecortada = frase.substring(11,27);
    System.out.println("didigte uma palavra mairo de oito letras");
    fraseC = sc.next();
    if(fraseC.length() >8) {
    System.out.println(frasecortada);
    System.out.println(frase.toUpperCase());
    System.out.println(frase.toLowerCase());
   
    }else {
   System.err.println("digite algo maior do que 8 caracteres"); 
 }    
    
    
}

}
