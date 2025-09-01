public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    void locomover() {
        System.out.println("animal fazendo ação");
    }

    @Override
    void alimentar() {
        System.out.println("mamando!");
    }

    @Override
    void emitirSom() {
        System.out.println("som de mamifero");
    }
}
