// 2ª Parte: nova modalidade, sem alterar nenhuma classe existente além do registro no main
public class MissaoResgate extends Missao {

    @Override
    protected void realizarAcao() {
        System.out.println("Resgatando personagem!");
    }

    @Override
    protected int getRecompensa() {
        return 150;
    }
}
