public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarbolha(){
        System.out.println("soltando bolha!");
    }

    @Override
    void locomover() {
        System.out.println("nadando");
    }

    @Override
    void alimentar() {
        System.out.println("peixe comendo");
    }

    @Override
    void emitirSom() {
        System.out.println("som de peixe");
    }
}
