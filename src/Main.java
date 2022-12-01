import com.ada.example.dados.pessoais.Endereco;
import com.ada.example.pessoa.Pessoa;
import com.ada.example.time.Jogador;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programação orientada a objetos");

        Endereco endereco = new Endereco();
        endereco.rua = "Rua zero";

        Pessoa pessoa = new Pessoa("João", "joao@gmail.com", endereco);

        System.out.println(pessoa);

        Jogador jogador = new Jogador();
        jogador.setNome("Neymar");
        jogador.setNumeroCamisa("10");
        jogador.setPosicao("deitado");

        System.out.println(jogador);


    }

}
