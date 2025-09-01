import java.awt.desktop.SystemEventListener;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    void locomover() {
        System.out.println("rasteijando");
    }

    @Override
    void alimentar() {
        System.out.println("engolindo");
    }

    @Override
    void emitirSom() {
        System.out.println("som de reptíl");
    }
}
