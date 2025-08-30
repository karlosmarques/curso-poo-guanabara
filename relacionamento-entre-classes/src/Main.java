import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int n1 = aleatorio.nextInt(6);
        int n2;
        do {
            n2 = aleatorio.nextInt(6);
        } while (n1 == n2);


        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Pretty Boy","França",31,1.75,68.9,11,3,1);

        l[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);

        l[2] = new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);

        l[3] = new Lutador("Dead Code","Auatralia",28,193,81.6,13,0,2);

        l[4] = new Lutador("UFOCobol","Brasil",37,1.70,119.3,5,4,3);

        l[5] = new Lutador("Nerdaaf","EUA",30,1.81,105.1,12,2,4);


       Luta luta = new Luta();

        luta.marcarLuta(l[n1],l[n2]);

        luta.lutar();
    }
}