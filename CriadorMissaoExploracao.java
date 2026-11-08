public class CriadorMissaoExploracao extends CriadorMissao {

    @Override
    protected Missao criarMissao() {
        return new MissaoExploracao();
    }
}
