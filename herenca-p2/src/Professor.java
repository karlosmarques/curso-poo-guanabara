public class Professor extends Pessoa{
    private String especialidade;
    private double salaro;

    public double getSalaro() {
        return salaro;
    }

    public void setSalaro(double salaro) {
        this.salaro = salaro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberAumento(){

    }
}
