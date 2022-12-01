package locadora;

public class Main {
    public static void main(String[] args) {
        Filme marvel = new Filme("Pantera Negra", "Ação", 7.0);
        Filme dc = new Filme("Mulher-Maravilha", "Heroina", "DC", "10", 7.0);

        Locadora locadora = new Locadora("AdaFlix", "05254874000180");
        locadora.cadastrarFilme(marvel);
        locadora.cadastrarFilme(dc);
        locadora.listarFilmes();

//        System.out.println(marvel);
//        System.out.println(dc);
    }
}
