import java.util.HashMap;
import java.util.Map;

/**
 * O gerenciador conhece apenas CriadorMissao (abstração).
 * Não há if/else sobre o tipo: cada tipo é registrado com seu criador,
 * e novas modalidades entram sem modificar esta classe.
 */
public class GerenciadorMissoes {

    private final Map<String, CriadorMissao> criadores = new HashMap<>();

    public void registrarTipo(String tipo, CriadorMissao criador) {
        criadores.put(tipo, criador);
    }

    // Forma 1: por tipo registrado (mantém a interface original baseada em String)
    public void iniciarMissao(String tipo) {
        CriadorMissao criador = criadores.get(tipo);
        if (criador == null) {
            System.out.println("Tipo de missão inválido!");
            return;
        }
        criador.iniciarMissao();
    }

    // Forma 2: recebendo diretamente um criador
    public void iniciarMissao(CriadorMissao criador) {
        criador.iniciarMissao();
    }

    public static void main(String[] args) {
        GerenciadorMissoes gerenciador = new GerenciadorMissoes();
        gerenciador.registrarTipo("combate", new CriadorMissaoCombate());
        gerenciador.registrarTipo("exploracao", new CriadorMissaoExploracao());
        gerenciador.registrarTipo("resgate", new CriadorMissaoResgate()); // 2ª Parte

        gerenciador.iniciarMissao("combate");
        gerenciador.iniciarMissao("exploracao");
        gerenciador.iniciarMissao("resgate");
    }
}
