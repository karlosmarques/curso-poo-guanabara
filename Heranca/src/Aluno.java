public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        if (getMatricula() !=0){
            setMatricula(0);
            System.out.println("Matricula cancelada com sucesso!");
        }else{
            System.out.println("você não tem matricula por isso é impossivel cancelar!");
        }
    }
}
