package LogicaDoJogo;

public class Personagem {
    private String nome;
    private int vidamax, forca, constituicao, agilidade, destreza, xp, vida;

    public Personagem(String nome, int vidamax, int xp) {
        this.nome = nome;
        this.vidamax = vidamax;
        this.vida = vidamax;
        this.forca = 0;
        this.constituicao = 0;
        this.agilidade = 0;
        this.destreza = 0;
        this.xp = xp;
    }

    public int getVidamax()
    {
        return vidamax;
    }

    public void setVidamax(int vidamax)
    {
        this.vidamax = vidamax;
    }

    public int getForca()
    {
        return forca;
    }

    public void setForca(int forca)
    {
        this.forca = forca;
    }

    public int getConstituicao()
    {
        return constituicao;
    }

    public void setConstituicao(int constituicao)
    {
        this.constituicao = constituicao;
    }

    public int getAgilidade()
    {
        return agilidade;
    }

    public void setAgilidade(int agilidade)
    {
        this.agilidade = agilidade;
    }

    public int getDestreza()
    {
        return destreza;
    }

    public void setDestreza(int destreza)
    {
        this.destreza = destreza;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public int getVida()
    {
        return vida;
    }

    public String getNome()
    {
        return nome;
    }
}