package minhasprimeirasclasses;
public class MinhasPrimeirasClasses {
    public static void main(String[] args) {
       Violao violao1 = new Violao();
       Violao violao2 = new Violao();
       Violao violao3 = new Violao();
       
       violao1.cor = "preto";
       violao1.modelo = "gianini";
       violao1.desafinado();
       violao1.tipodecorda = "nylon";
       violao1.status();
       violao1.tocar();
       
        System.out.println("-=-=-=-=-=-");
        
        violao2.cor = "branco";
        violao2.modelo = "michaell";
        violao2.tipodecorda = "aço";
        violao2.afinado();
        violao2.status();
        violao2.tocar();
       
       
       
    }
    
}
