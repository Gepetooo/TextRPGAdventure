package LogicaDoJogo;

public class Arma
{
    Coisas coisa = new Coisas();

    public int armaPesada(Jogador jogador, int K)
    {
        return (int) (K + 1.5*jogador.getForca() + coisa.d12());
    }

    public int armaLeve(Jogador jogador, int K)
    {
        return K + coisa.d6() + coisa.d6() + coisa.d4() + jogador.getDestreza();
    }
}
