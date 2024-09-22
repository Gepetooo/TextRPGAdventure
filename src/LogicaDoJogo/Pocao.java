package LogicaDoJogo;

import java.util.Random;

public class Pocao
{
    public void pocaoInimigo(Inimigo inimigo)
    {
        inimigo.setVida(inimigo.getVida() + d6pocao() + d6pocao() + d6pocao());
    }

    public void pocao(Jogador jogador)
    {
        jogador.setVida(jogador.getVida() + d6pocao() + d6pocao() + d6pocao());
    }

    public int d6pocao()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
