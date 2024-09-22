package LogicaDoJogo;

public class Jogador extends Personagem
{
    public Jogador(String nome){
        super(nome, 100, 0);
    }
    Armadura armadura = new Armadura();
    Arma arma = new Arma();
    Coisas coisas = new Coisas();

    public int attack(Jogador jogador)
    {
        if(Coisas.armaPesada)
        {
            if(coisas.ato == 1)
            {
                return arma.armaPesada(jogador, 1);
            }
            else if(coisas.ato == 2)
            {
                return arma.armaPesada(jogador, 3);
            }
            else if(coisas.ato == 3)
            {
                return arma.armaPesada(jogador, 5);
            }
            else
            {
                return arma.armaPesada(jogador, 7);
            }
        }
        else
        {
            if(coisas.ato == 1)
            {
                return arma.armaLeve(jogador, 3);
            }
            else if(coisas.ato == 2)
            {
                return arma.armaLeve(jogador, 5);
            }
            else if(coisas.ato == 3)
            {
                return arma.armaLeve(jogador, 7);
            }
            else
            {
                return arma.armaLeve(jogador, 9);
            }
        }
    }

    public int defend(Jogador jogador)
    {
        if(coisas.ato == 1)
        {
            return armadura.armadura(jogador, 1);
        }
        else if(coisas.ato == 2)
        {
            return armadura.armadura(jogador, 2);
        }
        else if(coisas.ato == 3)
        {
            return armadura.armadura(jogador, 3);
        }
        else
        {
            return armadura.armadura(jogador, 4);
        }
    }
}
