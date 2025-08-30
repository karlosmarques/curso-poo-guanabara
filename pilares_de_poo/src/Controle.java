import java.awt.*;

public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getVolume());
        for (int i = 0; i <= getVolume(); i+=10) {
            System.out.println("|");
        }
        System.out.println(getTocando());
    }


    @Override
    public void fecharMenu() {
        System.out.println("desligando menu");
    }

    @Override
    public void maisVolume() {
        if (ligado) {
            setVolume(getVolume() + 1);
        } else if (!ligado) {
            System.out.println("A tv está desligada por isso não pode fazer essa ação");
        }else
            System.out.println("algo deu muito errado.");
    }

    @Override
    public void menosVloume() {
        if (ligado) {
            setVolume(getVolume() - 1);
        } else if (!ligado) {
            System.out.println("A tv está desligada por isso não pode fazer essa ação");
        }else
            System.out.println("algo deu muito errado.");
    }

    @Override
    public void ligarMudo() {
        if (ligado && this.volume > 0){
            setVolume(0);
            System.out.println("A tv está no mudo!");
        } else if (!ligado || this.volume < 0 ) {
            System.out.println("Você não pode fazer pois a tv está desligada ou já está mudo!");
        }else
            System.out.println("algo deu muito errado.");
    }

    @Override
    public void desligarMudo() {
        if (ligado && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (ligado && !getTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pouse() {
        if (ligado && getTocando()){
            setTocando(false);
        }
    }
}
