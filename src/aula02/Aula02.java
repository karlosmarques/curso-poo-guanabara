package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
         caneta.modelo = "Bic Cristal";
         caneta.cor = "Azul";
         //caneta.ponta = 0.5f;
        caneta.carga = 80;
        caneta.tampa = false ;
        caneta.status();

        caneta.rabiscar();

    }
}
