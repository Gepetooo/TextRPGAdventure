package LogicaDoJogo;

public class Armadura
{
    Coisas coisa = new Coisas();

    public int armadura(Jogador jogador, int K)
    {
        return (int) (K + 1.5*jogador.getConstituicao());
    }
}
