public class Bolsista extends Aluno{
    private boolean bolsa;

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){

    }
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome()+ " é bolsista! Pagamento facilitado");
    }
}
