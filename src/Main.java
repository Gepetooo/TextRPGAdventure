import LogicaDoJogo.Coisas;
import LogicaDoJogo.Historia;

public class Main
{
    public static void main(String[] args)
    {
        Coisas coisas = new Coisas();
        while(true)
        {
            Coisas.titulo("TEXT RPG");
            System.out.println("(1) Comecar o jogo");
            System.out.println("(2) Historia do jogo");
            System.out.println("(3) Sair");
            int input = Coisas.LerNumero("-> ", 3);
            if(input == 1)
            {
                coisas.comecarJogo();
            }
            else if(input == 2)
            {
                Historia.historia();
            }
            else
            {
                break;
            }
        }
    }
}