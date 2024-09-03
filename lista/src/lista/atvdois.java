package lista;
import java.util.Scanner;



public class atvdois {
Scanner sc = new Scanner(System.in);
private String nome;

public atvdois(String nome){
    this.nome = nome;
}    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void impri(){
        System.out.println("escreva seu nome");
        nome = sc.next();
        System.out.println("ola "+nome+" bem vindo ao programa");
        
    }
        }
