/**
 * Factory Method: o criador declara o método de fábrica e usa a missão
 * apenas pela abstração Missao, sem conhecer a classe concreta.
 */
public abstract class CriadorMissao {

    // Método fábrica: cada criador concreto decide qual missão instanciar
    protected abstract Missao criarMissao();

    // Operação que usa o produto sem depender do tipo concreto
    public void iniciarMissao() {
        Missao missao = criarMissao();
        missao.executar();
    }
}
