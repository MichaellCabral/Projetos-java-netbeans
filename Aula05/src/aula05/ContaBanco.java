package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    public void estadoAtual() { //Serve para mostrar os resultados na tela
        System.out.println("_______________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {           //(t=="CC")
            this.setSaldo(50);       //(t=="CP")                 
        } else if ("CP".equals(t)) { 
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {   // se nenhum dos loops (condições acima) então: fecha conta
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){ //variavel valor pra receber o depósito em Real
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo()+v); //define o saldo com o saldo atual + valor da variavel
            System.out.println("Deposito realizado na conta no valor de: " + this.getSaldo());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!"); // caso a conta não esteja aberta
        }
        
    }
    public void sacar(float v) {
        if (this.getStatus()){
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saldo realizado na conta no de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0; //é uma váriavel local e não um atributo
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        System.out.println("Impossivel pagar com a conta fechada");
    }
    //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0; //this.setsaldo(0);
        this.status = false;  //this.status(false);
        
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

    public boolean getStatus() {  //todo método que retorna booleano o java usa "is" e não get
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}