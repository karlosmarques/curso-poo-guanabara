import java.awt.desktop.SystemEventListener;

public class Ave extends Animal{

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("fazendo ninho!!");
    }

    @Override
    void locomover() {
        System.out.println("voando!");
    }

    @Override
    void alimentar() {
        System.out.println("ave comendo");
    }

    @Override
    void emitirSom() {
        System.out.println("ave fazendo som");
    }
}
