public class ContaBanco {
    public int numconta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numconta, String dono, String tipo) {
        this.numconta = numconta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getDono() {
      return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double  getSaldo() {
       return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        this.status = true;
        if (tipo.equalsIgnoreCase("cp")){
            this.tipo = "cp";
            this.saldo = 150;
        } else if (tipo.equalsIgnoreCase("cc")) {
            this.saldo = 50;
            this.tipo = "cc";
        }

    }
    public void fecharConta(){
        if (saldo > 0 ){
            System.out.println("Você nãp pode fechar essa conta pois possui dinheiro no banco. Retire o saldo para fechar a sua conta.");
        } else if (this.saldo <0) {
            System.out.println("Você não pode fechar essa conta pois está em débito.");
        } else {
            this.status = false;
            System.out.println("sua conta foi fechada com sucesso!");
        }
    }
    public void depositar(double valor){
        if (status == true) {
            this.saldo += valor;
            System.out.println("valor de R$" + valor+ " depositado com sucesso");
        }else {
            System.out.println("sua conta está fechada por esse motivi não pode depositar esse valor: R$" + valor);
        }
    }
    
    public void sacar(double valor){
        if (status == true && saldo >= valor){
            this.saldo -= valor;
            System.out.println("valor de R$"+ valor+ " foi sacado");
        } else if (saldo<valor) {
            System.out.println("saldo insuficiente!");
        }
        else {
            System.out.println("Impossível sacar. Conta está fechada.");
        }
        
    }


    public void pagarMensalidade(){
        if (this.tipo.equalsIgnoreCase("cc" ) && this.saldo > 50){
            this.saldo -= 50;
        } else if (this.tipo.equalsIgnoreCase("cp") && this.saldo > 20) {
            this.saldo -=20;
        }
        else {
            System.out.println("Saldo insuficiente para pagar a mensalidade.");
        }
    }
    public void status(){
        System.out.println("conta: " + getNumconta());
        System.out.println("tipo: " + getTipo());
        System.out.println("dono: " + getDono());
        System.out.println("saldo: " + getSaldo());
        System.out.println("status: " + isStatus());
    }
}
