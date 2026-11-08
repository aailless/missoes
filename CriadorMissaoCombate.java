public class CriadorMissaoCombate extends CriadorMissao {

    @Override
    protected Missao criarMissao() {
        return new MissaoCombate();
    }
}
