/**
 * Template Method: define a sequência fixa de execução de qualquer missão.
 * As etapas comuns ficam aqui; as específicas são delegadas às subclasses.
 */
public abstract class Missao {

    // Método template: final para que nenhuma subclasse altere a sequência
    public final void executar() {
        preparar();
        verificarEquipamentos();
        realizarAcao();
        exibirRecompensa();
        finalizar();
    }

    // Etapas comuns (antes duplicadas em cada classe)
    private void preparar() {
        System.out.println("Preparando missão...");
    }

    private void verificarEquipamentos() {
        System.out.println("Verificando equipamentos...");
    }

    private void exibirRecompensa() {
        System.out.println("Recompensa: " + getRecompensa());
    }

    private void finalizar() {
        System.out.println("Missão finalizada!");
    }

    // Etapas variáveis (implementadas por cada modalidade)
    protected abstract void realizarAcao();

    protected abstract int getRecompensa();
}
