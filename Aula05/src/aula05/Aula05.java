package aula05;
public class Aula05 {
    public static void main(String[] args) {
       ContaBanco pessoa01 = new ContaBanco();
       pessoa01.setNumConta(1111);
       pessoa01.setDono("Michaell");
       pessoa01.abrirConta("CC");
       
       ContaBanco pessoa02 = new ContaBanco();
       pessoa02.setNumConta(2222);
       pessoa02.setDono("Solange");
       pessoa02.abrirConta("CP");
       
       pessoa01.depositar(100);
       pessoa02.depositar(500);
       pessoa02.sacar(100);
       
       pessoa01.sacar(150); //sacando 150 pra fechar a conta do Michaell
       pessoa01.fecharConta();
           
       
       pessoa01.estadoAtual();
       pessoa02.estadoAtual();
       
       
    }
    
}
