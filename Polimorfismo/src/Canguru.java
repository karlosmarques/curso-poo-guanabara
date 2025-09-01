public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("usando bolsa!");
    }

    @Override
    void locomover(){
        System.out.println("pulando");
    }
    @Override
    void emitirSom() {
        System.out.println("som de canguru ksksksk!");
    }
}
