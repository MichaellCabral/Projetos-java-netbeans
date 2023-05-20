package Aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; //ESTA PRIVADO (VAI DAR ERRO)
        c1.carga = 80;
        //c1.tampada = false; //TAMPADA ESTA PRIVADO (VAI DAR ERRO)
        c1.status();/*Chamada pra um método*/
        c1.destampar();//metodos publicos dentro da classe (posso tampar e destampar)
        c1.rabiscar();
        
        
      
    }
    
}
