package projetofinal1;
public class ProjetoFinal1 {
   
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de Java");
        v[2] = new Video ("Aula de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Franciele", 28, "F", "fran");
        
        
        Visualizacao vis[] =  new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
  
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
        /*System.out.println("VIDEOS\n--------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("GAFANHOTOS\n--------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
       
       
    }
    
}
