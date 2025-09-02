abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float expericencia;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.expericencia = 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExpericencia() {
        return expericencia;
    }

    public void setExpericencia(float expericencia) {
        this.expericencia = expericencia;
    }

    protected void ganharExp(){

    }
}
