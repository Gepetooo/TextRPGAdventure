package LogicaDoJogo;

public class Inimigo extends Personagem
{
    public Inimigo(String nome, int vidamax) {
        super(nome, vidamax, 10);
    }
    Arma arma = new Arma();
    Armadura armadura = new Armadura();
    Coisas coisas = new Coisas();

    public int attack()
    {
        if(coisas.ato == 1)
        {
            return 11;
        }
        else if(coisas.ato == 2)
        {
            return 13;
        }
        else if(coisas.ato == 3)
        {
            return 15;
        }
        else
        {
            return 25;
        }
    }

    public int defend()
    {
        if(coisas.ato == 1)
        {
            return 5;
        }
        else if(coisas.ato == 2)
        {
            return 7;
        }
        else if(coisas.ato == 3)
        {
            return 9;
        }
        else
        {
            return 12;
        }
    }
}
