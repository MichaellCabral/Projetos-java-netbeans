package aula02; /*5 atributos e 3 métodos*/
public class Caneta { /*AQUI SE CRIA A CLASSE*/
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){ /*para mostrar o estado da caneta no programa*/
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
