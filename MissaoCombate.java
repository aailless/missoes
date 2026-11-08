public class MissaoCombate extends Missao {

    @Override
    protected void realizarAcao() {
        System.out.println("Enfrentando inimigo!");
    }

    @Override
    protected int getRecompensa() {
        return 100;
    }
}
