/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.Scanner;

public class atvseis {
private String frase;
Scanner sc = new Scanner(System.in);

public atvseis(String frase){
    this.frase = frase;



}

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
public void impri(){
    System.out.println("escreva uma frase para inverter");
    frase = sc.next();
    String fraseInvertida = new StringBuilder(frase).reverse().toString();
    System.out.println(fraseInvertida);

    
    
}

    
}
