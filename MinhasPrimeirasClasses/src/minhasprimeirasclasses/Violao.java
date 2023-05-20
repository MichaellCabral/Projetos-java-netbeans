package minhasprimeirasclasses;
/*Criando a classe com as caracteristicas do instrumento*/
public class Violao {
    String modelo;
    String cor;
    boolean afinado;
    String tipodecorda;
    
    void status(){
        System.out.println("Está afinado: " + this.afinado);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);                
    }
    void tocar(){
        if(this.afinado == true){
            System.out.println("Afinadissímo! que lindo som");
        }else{
            System.out.println("Desafinado, não tem como aguentar esse som");
        }
    }
    void afinado(){
        this.afinado = true;
    }
    void desafinado(){
        this.afinado = false;
    }
}
