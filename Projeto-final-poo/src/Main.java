//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video v[]= new Video[3];
        v[0] = new Video("cs gameplay");
        v[1] = new Video("skins de cs");
        v[2] = new Video("faca nova no cs ");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("karlos",24,"M","karlitos");
        g[1] = new Gafanhoto("dafni",19,"F","encrenca");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[1],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());


        vis[1]= new Visualizacao(g[1],v[1]);
        vis[0].avaliar(87);
        System.out.println(vis[1].toString());



    }
}