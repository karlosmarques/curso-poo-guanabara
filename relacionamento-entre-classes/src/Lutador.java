public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        setCategoria();
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso<52.2){
           categoria = "Invalido";
        } else if (peso <=70.3) {
            categoria = "Leve";
        } else if (peso<=83.9) {
            categoria = "Médio";
        } else if (peso<=120.2) {
            categoria = "pesado";
        }else {
            categoria = "Invalido";
        }
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("o " + getNome() +"é um peso " + getCategoria());
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " Anos");
        System.out.println(getAltura() + " Altura");
        System.out.println("Pesando " + getPeso() +" kg");
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empates " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria() );
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() - 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
