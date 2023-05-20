package aula04;
public class Caneta {   
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //METODO CONSTRUTOR (MESMO NOME DA CLASSE)
    public Caneta(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.tampar();//caneta tampada
      //this.cor = "Azul";  //caneta de cor azul
    }            
    public String getModelo() {
        return this .modelo;
    }
    public void setModelo(String m) { //void = vazio
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }    
    public void status() {//mostrar modelo e ponta
        System.out.println("=-=-=-=-=-=-=");
        System.out.println("SOBRE A CANETA");
      //System.out.println("Modelo " + this.modelo);
      //System.out.println("Ponta " + this.ponta);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}


