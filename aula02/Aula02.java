package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();//cria o objeto caneta c1
        c1.modelo = "bic";
        c1.cor = "Preta";
        c1.tampar();/*se tampar aqui ela deixa de rabiscar*/
        c1.ponta = 0.5f;
        c1.carga = 200;
        c1.status();/*Chamada pra um método*/
        c1.rabiscar();
        
        System.out.println("=-=-=-=-=-=-=-=");
        
        Caneta c2 = new Caneta();//cria o obejto caneta c2
        c2.modelo = "compacta";
        c2.cor = "vermelha";
        c2.tampada = false;
        c2.ponta = 1;  
        c2.carga = 0;                    
        c2.status();
        c2.rabiscar();
    }
    
} 
