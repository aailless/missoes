public class CriadorMissaoResgate extends CriadorMissao {

    @Override
    protected Missao criarMissao() {
        return new MissaoResgate();
    }
}
