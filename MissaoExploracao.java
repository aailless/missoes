public class MissaoExploracao extends Missao {

    @Override
    protected void realizarAcao() {
        System.out.println("Explorando região desconhecida!");
    }

    @Override
    protected int getRecompensa() {
        return 50;
    }
}
