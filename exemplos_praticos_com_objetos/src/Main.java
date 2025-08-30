//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco(001,"karlos","cp");
    p1.abrirConta();




    ContaBanco p2 = new ContaBanco(002,"dafni","cc");
    p2.abrirConta();


    p1.depositar(500);
    p2.depositar(100);
    p1.sacar(1000);

    p2.sacar(150);
    p2.fecharConta();

    p1.status();
    p2.status();
    }
}

