public class Funcionario extends Pessoa{
    private String setor;
    private  boolean trabalhando;


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void mudarTrabalho(String novoTrabalho){
        if (isTrabalhando()){
            setSetor(novoTrabalho);
            System.out.println("Seu setor foi alterado com sucesso para " + novoTrabalho);
        }else {
            System.out.println("você não possui nenhum setor!");
        }
    }

}

