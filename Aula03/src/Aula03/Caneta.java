package Aula03; /*5 atributos e 3 m�todos*/
public class Caneta { /*AQUI SE CRIA A CLASSE*/
    public String modelo; //ATRIBUTOS
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){ /*para mostrar o estado da caneta no programa*/
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Est� tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! N�o posso rabiscar");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
