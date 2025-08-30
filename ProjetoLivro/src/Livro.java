public class Livro implements Publicacao{
    private String titulo;
    private  String autor;
    private int totPaginas;
    private  int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhe(){
        System.out.println("o leitor é " + leitor.getNome());
        System.out.println("nome do livro:" + this.titulo);
        System.out.println("nome do autor: " + getAutor());
        System.out.println("o total de paginas do livro " + getTitulo()+ " é " + getTotPaginas());
        System.out.println("a pagina atual do livro é " + getPagAtual());
        System.out.println("o livro está aberto: " + isAberto() );
    }

    @Override
    public void abrir() {
        if(aberto){
            System.out.println("o livro já está aberto!");
        }else {
            setAberto(true);
            System.out.println("abrindo o livro");
        }
    }

    @Override
    public void fechar() {
        if (!aberto){
            System.out.println("o livro já está fechado");
        }else {
            setAberto(false);
            System.out.println("fechando o livro!");
        }
    }

    @Override
    public void folhear(int novapagina) {
        if (novapagina > getTotPaginas()){
            System.out.println("o livro não tem isso tudo de pagina");
            setPagAtual(0);
        }else {
            setPagAtual(novapagina);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }
}
