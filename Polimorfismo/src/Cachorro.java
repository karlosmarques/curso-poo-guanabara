
public class Cachorro extends Mamifero{

    public void enterraOsso(){
        System.out.println("enterrando osso!");
    }
    public void abanarRabo(){
        System.out.println("abanando o rabo!");
    }

    @Override
    void locomover() {
        System.out.println("correndo");
    }

}
