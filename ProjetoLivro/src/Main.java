//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Pessoa [] p  = new Pessoa[3];
       Livro [] l = new Livro[3];

       p[0] = new Pessoa("karlos",25,"M");
       p[1] = new Pessoa("dafni",19,"F");

       l[0] = new Livro("aprendendo java","José da Silva",300,p[0]);
       l[1] = new Livro("Java Avançado", "Maria Candido", 800,p[1]);


       l[1].abrir();
       l[1].folhear(800);
       l[1].detalhe();
    }
}