//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("karlos");
        p2.setNome("dafni");
        p3.setNome("brenda");
        p4.setNome("lane");

        p2.setCurso("Informatica");
        p3.setMudarSalario(2500.75);
        p4.setSetor("Estoque");

        p2.setIdade(19);
        p3.setIdade(18);
        p4.setIdade(23);

        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}