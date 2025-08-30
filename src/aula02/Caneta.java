package aula02;

public class Caneta {
    public  String modelo;
    public  String cor;
    private float ponta;
    protected int carga;
    protected boolean tampa;


   public void status(){
       System.out.println("modelo: " + this.modelo);
       System.out.println("uma caneta: " + this.cor);
       System.out.println("ponta: " + this.ponta);
       System.out.println("carga: " + this.carga);
       System.out.println("está tampada: " + this.tampa);
   }

   public void rabiscar(){
       if (this.tampa == true){
           System.out.println("não pode rabiscar pois a caneta está com a tampa");
       }else {
           System.out.println("estou rabiscando!");
       }
   }
    private void tampar(){
       this.tampa = true;
    }
    private void destampar(){
       this.tampa = false;
    }
}
