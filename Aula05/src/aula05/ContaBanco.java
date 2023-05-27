package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    public void abrirConta(String t) { //onde "t" é o tipo que vai receber cc ou cp
        this.setTipo(t);           // se é cc ou cp
        this.setStatus(true);    // se conta esta ativa
        if ("CC".equals(t)) {        // t == "CC"
            this.setSaldo(50);
        } else if ("CP".equals(t)) { // t == "CP"
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta() {
        
    }
    public void depositar(){
        
    }
    public void sacar() {
        
    }
    public void pagarMensal() {
        
    }
    //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
        
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}