package minhasprimeirasclasses;
/*Criando a classe com as caracteristicas do instrumento*/
public class Violao {
    String modelo;
    String cor;
    boolean afinado;
    String tipodecorda;
    
    void status(){
        System.out.println("Est� afinado: " + this.afinado);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);                
    }
    void tocar(){
        if(this.afinado == true){
            System.out.println("Afinadiss�mo! que lindo som");
        }else{
            System.out.println("Desafinado, n�o tem como aguentar esse som");
        }
    }
    void afinado(){
        this.afinado = true;
    }
    void desafinado(){
        this.afinado = false;
    }
}
