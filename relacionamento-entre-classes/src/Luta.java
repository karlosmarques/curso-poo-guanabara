import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;



    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1,Lutador l2){
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && !Objects.equals(l1.getNome(), l2.getNome())){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("os lutadores não são da mesma categoria!");
        }
    }

    public void lutar(){
        if (aprovada){
            Random aleatorio = new Random();
            int numaleatorio = aleatorio.nextInt(3);

            switch (numaleatorio) {
                case 0:
                    desafiado.setEmpates(desafiado.getEmpates() + 1);
                    desafiante.setEmpates(desafiante.getEmpates() + 1);
                    System.out.println("a luta terminou empatado! um ponto para cada lutador");
                    break;
                case 1:
                    this.desafiado.setVitorias(desafiado.getVitorias() + 1);
                    this.desafiante.setDerrotas(desafiante.getDerrotas() + 1);
                    System.out.println("o " + desafiado.getNome()+ " ganhou a luta!");
                    break;
                case 2:
                    this.desafiado.setDerrotas(desafiado.getDerrotas() + 1);
                    this.desafiante.setVitorias(desafiante.getVitorias() + 1);
                    System.out.println("o " + desafiante.getNome() + " ganhou a luta!");
                    break;

            }
        }else {
            System.out.println("a luta entre " + desafiante.getNome()+" e " + desafiado.getNome()+ " não vai acontecer!");
        }

    }
}


