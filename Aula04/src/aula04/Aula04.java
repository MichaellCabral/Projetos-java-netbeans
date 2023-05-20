package aula04;
public class Aula04 {
    public static void main(String[] args) {
       // Caneta c1 = new Caneta();
        Caneta c1 = new Caneta("NIC","Amarelo",0.4f);
        //c1.setModelo("BIC");//método acessor
       //c1.modelo = "BIC";//acesso direto pelo atributo
        
       // c1.setPonta(0.5f);
       // c1.ponta = 0.5f;//acesso direto pelo atributo
        c1.status();//aceeso pelo metodo set, pois, oo atributo esta em modo privado
        //System.out.println("Tenho uma caneta "+c1.getModelo() + " de ponta: " + c1.getPonta());
       //acesso pelo metodo get, pois o atributo esta em modo privado
       Caneta c2 = new Caneta ("Compacta","Vermelha",0.7f);
       c2.status();
    }
    
}
