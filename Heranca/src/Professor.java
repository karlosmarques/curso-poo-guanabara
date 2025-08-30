public class Professor extends Pessoa{
    private String especialidade;
    private double mudarSalario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double MudarSalario() {
        return mudarSalario;
    }

    public void setMudarSalario(double mudarSalario) {
        this.mudarSalario = mudarSalario;
    }

    public void receberAumento(double novoSalario){
        if (getEspecialidade().isEmpty()){
            System.out.println("você não tem especialidade para aumentar o seu salario!");
        }else {
            setMudarSalario(novoSalario);
            System.out.println("Seu salario foi alterado!!");

        }
    }
}
