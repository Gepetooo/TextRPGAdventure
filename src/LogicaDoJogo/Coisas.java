package LogicaDoJogo;
import java.util.Scanner;
import java.util.Random;
import LimpadorDeTela2000.*;

public class Coisas
{
    Arma arma;
    Armadura armadura;
    Pocao pocao = new Pocao();
    public static boolean jogoRodando;
    static Scanner scanner = new Scanner(System.in);
    Personagem personagem;

    boolean K = false;

    public static boolean armaPesada = false;

    public static int lugar = 0;
    public int ato = 1;
    public static String[] lugares = {"Alcindo Cacela", "CESUPA: Unidade ARGO", "LAB Subsolo", "Auditorio"};

    public static String[] inimigos = {"Joao Pedro Wan-Meyl", "Ramon Souza", "Pedro Girotto", "Jose Victor", "Ana Alice", "Alessandra Natasha"};

    public static int LerNumero(String prompt, int EscolhaDoJogador)
    {
        int input;
        do
        {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            }
            catch(Exception e)
            {
                input = -1;
                System.out.println("Digite um numero!");
            }
        }while (input < 1 || input > EscolhaDoJogador);
        return input;
    }

    public static void separador(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void titulo(String titulo)
    {
        separador(30);
        System.out.println(titulo);
        separador(30);
    }

    public int d6()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int d4()
    {
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }

    public int d12()
    {
        Random rand = new Random();
        return rand.nextInt(12) + 1;
    }

    public String[] Atributos = {"Forca", "Constituicao", "Agilidade", "Destreza"};

    public void comecarJogo()
    {
        boolean escolha = false;
        String nome;
        ClearConsole.clearConsole();
        separador(40);
        titulo("TEXT RPG\nJogo por Joao Pedro Lopes e Tarcisio Ramses");
        separador(40);
        PauseConsole.pauseConsole();

        do
        {
            ClearConsole.clearConsole();
            titulo("Qual o seu nome?");
            nome = scanner.next();
            ClearConsole.clearConsole();
            titulo("Seu nome e " +nome+". \nEsta certo?");
            System.out.println("(1) Sim!");
            System.out.println("(2) Nao, eu quero mudar meu nome!");
            int input = LerNumero("-> ", 2);
            if (input == 1)
            {
                escolha = true;
            }
        }while(!escolha);

        Historia.historia();

        Jogador jogador = new Jogador(nome);

        Historia.ato1();
        for (int i = 15; i > 0; i--)
        {
            ClearConsole.clearConsole();
            titulo("Escolha um atributo("+i+" pontos de atributo sobrando):");
            for(int n = 0; n < 4; n++)
            {
                System.out.println((n+1)+" -> "+Atributos[n]);
            }
            int input = LerNumero("-> ", 4);
            if(input == 1)
            {
                jogador.setForca(jogador.getForca() + 1);
            }
            if(input == 2)
            {
                jogador.setConstituicao(jogador.getConstituicao() + 1);
            }
            if(input == 3)
            {
                jogador.setAgilidade(jogador.getAgilidade() + 1);
            }
            if(input == 4)
            {
                jogador.setDestreza(jogador.getDestreza() + 1);
            }
            ClearConsole.clearConsole();
        }
        titulo("Escolha seu tipo de arma:");
        System.out.println("(1) Arma Pesada");
        System.out.println("(2) Arma Leve");
        int input = LerNumero("-> ", 2);
        if(input == 1)
        {
            armaPesada = true;
        }
        ClearConsole.clearConsole();
        titulo("Escolha sua arma:");
        if(armaPesada)
        {
            System.out.println("(1) Espada Grande do Lorde");
            System.out.println("(2) Ancora Enferrujada");
            System.out.println("(3) Estrela da Manha");
            int input2 = LerNumero("-> ", 3);
            if(input2 == 1)
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Espada Grande do Lorde!");
            }
            else if(input2 == 2)
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Ancora Enferrujada!");
            }
            else
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Estrela da Manha!");
            }
        }
        else
        {
            System.out.println("(1) Chicote de Petalas Agucadas");
            System.out.println("(2) Rios de Sangue");
            System.out.println("(3) Lamina de Pedra do Rei Dragao");
            int input2 = LerNumero("-> ", 3);
            if(input2 == 1)
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Chicote de Petalas Agucadas!");
            }
            else if(input2 == 2)
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Rios de Sangue!");
            }
            else
            {
                ClearConsole.clearConsole();
                titulo("Voce escolheu Lamina de Pedra do Rei Dragao!");
            }
        }
        PauseConsole.pauseConsole();
        separador(30);
        System.out.println("Tome, escolha uma delas, é perigoso ir vestido assim.");
        separador(30);
        PauseConsole.pauseConsole();
        ClearConsole.clearConsole();
        separador(30);
        System.out.println("Escolha uma armadura:");
        separador(30);
        System.out.println("(1) Conjunto Cleanrot");
        System.out.println("(2) Conjunto Arvore Cadinho");
        System.out.println("(3) Conjunto Lobo Furioso");
        int input6 = LerNumero("-> ", 3);
        if(input6 == 1)
        {
            ClearConsole.clearConsole();
            titulo("Voce escolheu Conjunto Cleanrot!");
        }
        else if(input6 == 2)
        {
            ClearConsole.clearConsole();
            titulo("Voce escolheu Conjunto Arvore Cadinho!");
        }
        else
        {
            ClearConsole.clearConsole();
            titulo("Voce escolheu Conjunto Lobo Furioso!");
        }
        PauseConsole.pauseConsole();
        ClearConsole.clearConsole();

        jogador.setVidamax(d6());
        jogador.setVidamax(jogador.getVidamax() + d6());
        jogador.setVidamax(jogador.getVidamax() + d6());
        jogador.setVidamax(jogador.getVidamax() + jogador.getConstituicao());
        jogador.setVida(jogador.getVidamax());

        jogoRodando = true;

        while(jogoRodando)
        {
            if(jogador.getXp() >= 30 && ato == 1)
            {
                ato = 2;
                lugar = 1;
                Historia.ato1fim();
                ClearConsole.clearConsole();
                System.out.println("Escolha uma armadura:");
                separador(30);
                System.out.println("(1) Conjunto Sarca");
                System.out.println("(2) Conjunto Besta Campea");
                System.out.println("(3) Conjunto de Soldado Raya Lucarian");
                int input7 = LerNumero("-> ", 3);
                if(input7 == 1)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Sarca!");
                }
                else if(input7 == 2)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Besta Campea!");
                }
                else
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto de Soldado Raya Lucarian!");
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova armadura! (+2 de defesa)");
                PauseConsole.pauseConsole();
                titulo("Escolha sua arma:");
                if(armaPesada)
                {
                    System.out.println("(1) Sutura da Pele Divina");
                    System.out.println("(2) Alabarda de Dragao");
                    System.out.println("(3) Martelo de Incendio do Prelado");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Sutura da Pele Divina!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Alabarda de Dragao!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Martelo de Incendio do Prelado!");
                    }
                }
                else
                {
                    System.out.println("(1) Rapieira de Antspur");
                    System.out.println("(2) Asa de Astel");
                    System.out.println("(3) Cifra Pata");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Rapieira de Antspur!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Asa de Astel!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Cifra Pata!");
                    }
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova arma! (+2 de dano)");
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                jogador.setVidamax(jogador.getVidamax() - jogador.getConstituicao());
                for (int i = 5; i > 0; i--)
                {
                    titulo("Escolha um atributo(" + i + " pontos de atributo sobrando):");
                    for (int n = 0; n < 4; n++)
                    {
                        System.out.println((n + 1) + " -> " + Atributos[n]);
                    }
                    int input3 = LerNumero("-> ", 4);
                    if (input3 == 1)
                    {
                        jogador.setForca(jogador.getForca() + 1);
                    }
                    if (input3 == 2)
                    {
                        jogador.setConstituicao(jogador.getConstituicao() + 1);
                    }
                    if (input3 == 3)
                    {
                        jogador.setAgilidade(jogador.getAgilidade() + 1);
                    }
                    if (input3 == 4)
                    {
                        jogador.setDestreza(jogador.getDestreza() + 1);
                    }
                    ClearConsole.clearConsole();
                }
                Historia.ato2();
                jogador.setVidamax(jogador.getVidamax() + jogador.getConstituicao() + 10);
                jogador.setVida(jogador.getVidamax());
            }
            if(jogador.getXp() >= 50 && ato == 2)
            {
                ato = 3;
                lugar = 2;
                Historia.ato2fim();
                ClearConsole.clearConsole();
                System.out.println("Escolha uma armadura:");
                separador(30);
                System.out.println("(1) Conjunto de Lionel");
                System.out.println("(2) Conjunto Touro-Cabra");
                System.out.println("(3) Conjunto Dragao Mal-Formado");
                int input8 = LerNumero("-> ", 3);
                if(input8 == 1)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto de Lionel!");
                }
                else if(input8 == 2)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Touro-Cabra!");
                }
                else
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Dragao Mal-Formado!");
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova armadura! (+2 de defesa)");
                PauseConsole.pauseConsole();
                titulo("Escolha sua arma:");
                if(armaPesada)
                {
                    System.out.println("(1) Espada Grande");
                    System.out.println("(2) Espada Grande com Lamina Enxertada");
                    System.out.println("(3) Esmagador de Gigante");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Espada Grande!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Espada Grande com Lamina Enxertada!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Esmagador de Gigante!");
                    }
                }
                else
                {
                    System.out.println("(1) Grande Espada");
                    System.out.println("(2) Poleblade de Eleonora");
                    System.out.println("(3) Shamshir");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Grande Espada!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Poleblade de Eleonora!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Shamshir!");
                    }
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova arma! (+2 de dano)");
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                jogador.setVidamax(jogador.getVidamax() - jogador.getConstituicao());
                for (int i = 5; i > 0; i--)
                {
                    titulo("Escolha um atributo(" + i + " pontos de atributo sobrando):");
                    for (int n = 0; n < 4; n++)
                    {
                        System.out.println((n + 1) + " -> " + Atributos[n]);
                    }
                    int input3 = LerNumero("-> ", 4);
                    if (input3 == 1)
                    {
                        jogador.setForca(jogador.getForca() + 1);
                    }
                    if (input3 == 2)
                    {
                        jogador.setConstituicao(jogador.getConstituicao() + 1);
                    }
                    if (input3 == 3)
                    {
                        jogador.setAgilidade(jogador.getAgilidade() + 1);
                    }
                    if (input3 == 4)
                    {
                        jogador.setDestreza(jogador.getDestreza() + 1);
                    }
                    ClearConsole.clearConsole();
                }
                Historia.ato3();
                jogador.setVidamax(jogador.getVidamax() + jogador.getConstituicao() + 10);
                jogador.setVida(jogador.getVidamax());
            }
            if(jogador.getXp() >= 60 && ato == 3)
            {
                ato = 4;
                lugar = 3;
                Historia.ato3fim();
                ClearConsole.clearConsole();
                System.out.println("Escolha uma armadura:");
                separador(30);
                System.out.println("(1) Conjunto de Radahn");
                System.out.println("(2) Conjunto Sage");
                System.out.println("(3) Conjunto Royal Remains");
                int input9 = LerNumero("-> ", 3);
                if(input9 == 1)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto de Radahn!");
                }
                else if(input9 == 2)
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Sage!");
                }
                else
                {
                    ClearConsole.clearConsole();
                    titulo("Voce escolheu Conjunto Royal Remains!");
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova armadura! (+2 de defesa)");
                PauseConsole.pauseConsole();
                titulo("Escolha sua arma:");
                if(armaPesada)
                {
                    System.out.println("(1) Zweihander");
                    System.out.println("(2) Espada Grande Real");
                    System.out.println("(3) Espada Grande do Flagelo Estelar");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Zweihander!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Espada Grande Real!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Espada Grande do Flagelo Estelar!");
                    }
                }
                else
                {
                    System.out.println("(1) Lanca da Espada do Guardiao");
                    System.out.println("(2) Helice Sangrenta");
                    System.out.println("(3) Descascador de Pele Divina");
                    int input2 = LerNumero("-> ", 3);
                    if(input2 == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Lanca da Espada do Guardiao!");
                    }
                    else if(input2 == 2)
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Helice Sangrenta!");
                    }
                    else
                    {
                        ClearConsole.clearConsole();
                        titulo("Voce escolheu Descascador de Pele Divina!");
                    }
                }
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                titulo("Voce recebeu uma nova arma! (+2 de dano)");
                PauseConsole.pauseConsole();
                ClearConsole.clearConsole();
                jogador.setVidamax(jogador.getVidamax() - jogador.getConstituicao());
                for (int i = 5; i > 0; i--)
                {
                    titulo("Escolha um atributo(" + i + " pontos de atributo sobrando):");
                    for (int n = 0; n < 4; n++)
                    {
                        System.out.println((n + 1) + " -> " + Atributos[n]);
                    }
                    int input3 = LerNumero("-> ", 4);
                    if (input3 == 1)
                    {
                        jogador.setForca(jogador.getForca() + 1);
                    }
                    if (input3 == 2)
                    {
                        jogador.setConstituicao(jogador.getConstituicao() + 1);
                    }
                    if (input3 == 3)
                    {
                        jogador.setAgilidade(jogador.getAgilidade() + 1);
                    }
                    if (input3 == 4)
                    {
                        jogador.setDestreza(jogador.getDestreza() + 1);
                    }
                    ClearConsole.clearConsole();
                }
                Historia.ato4();
                jogador.setVidamax(jogador.getVidamax() + jogador.getConstituicao() + 10);
                jogador.setVida(jogador.getVidamax());
            }
            if(jogador.getXp() >= 70 && ato == 4)
            {
                Historia.fim();
                jogoRodando = false;
                break;
            }

            ClearConsole.clearConsole();
            titulo(lugares[lugar]);
            System.out.println("(1) Continuar sua jornada");
            System.out.println("(2) Informacao do Jogador");
            System.out.println("(3) Sair do jogo");
            int input2 = LerNumero("-> ", 3);
            if (input2 == 1)
            {
                luta(jogador);
            }
            else if (input2 == 2)
            {
                ClearConsole.clearConsole();
                titulo("STATUS DO JOGADOR");
                System.out.println(jogador.getNome() + "\tHP:" + jogador.getVida() + "/" + jogador.getVidamax());
                separador(20);
                System.out.println("XP: " + jogador.getXp());
                separador(20);
                System.out.println("ATRIBUTOS:\n");
                System.out.println("Forca: " + jogador.getForca());
                System.out.println("Constituicao: " + jogador.getConstituicao());
                System.out.println("Agilidade: " + jogador.getAgilidade());
                System.out.println("Destreza: " + jogador.getDestreza());
                PauseConsole.pauseConsole();
            }
            else if(input2 == 3)
            {
                jogoRodando = false;
            }
        }
    }

    public void luta(Jogador jogador)
    {
        if(ato != 4)
        {
            Random rand = new Random();
            Inimigo inimigo = new Inimigo(inimigos[rand.nextInt(5)], 30);
            int o = 0;
            boolean g = false;
            boolean h = false;
            ClearConsole.clearConsole();
            titulo("Voce acaba de entrar em batalha. Prepare-se!");
            PauseConsole.pauseConsole();
            inimigo.setVida(30);
            inimigo.setAgilidade(2);
            if (ato == 2)
            {
                inimigo.setAgilidade(4);
                inimigo.setVidamax(50);
                inimigo.setVida(50);
            }
            if (ato == 3)
            {
                inimigo.setAgilidade(5);
                inimigo.setVidamax(70);
                inimigo.setVida(70);
            }
            K = false;
            while (true)
            {
                if(inimigo.getVida() <= 0)
                {
                    inimigo.setVida(0);
                    ClearConsole.clearConsole();
                    titulo("Voce derrotou "+inimigo.getNome()+"!");
                    jogador.setXp(jogador.getXp() + inimigo.getXp());
                    System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                    PauseConsole.pauseConsole();
                    break;
                }
                ClearConsole.clearConsole();
                titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                if (inimigo.getAgilidade() > jogador.getAgilidade())
                {
                    if(!K)
                    {
                        titulo("O inimigo agiu primeiro!\nAVISO: Sua agilidade esta baixa!");
                        PauseConsole.pauseConsole();
                        K = true;
                    }
                    ClearConsole.clearConsole();
                    titulo("Vez do inimigo:");
                    PauseConsole.pauseConsole();
                    int random = rand.nextInt(3);
                    if (random == 0)
                    {
                        if (h)
                        {
                            int danoSofrido = 2 * jogador.defend(jogador) - inimigo.attack();
                            System.out.println("O inimigo atacou voce, mas sua defesa estava dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + (-1 * danoSofrido) + " de dano!");
                                jogador.setVida(jogador.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            if (jogador.defend(jogador) - inimigo.attack() >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + -1 * (jogador.defend(jogador) - inimigo.attack()) + " de dano!");
                                jogador.setVida(jogador.getVida() + jogador.defend(jogador) - inimigo.attack());
                                PauseConsole.pauseConsole();
                            }
                        }
                        if (jogador.getVida() < 0)
                        {
                            jogador.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce morreu...");
                            titulo("Voce ganhou "+jogador.getXp()+" na sua jornada. Tente ganhar mais na proxima vez!");
                            System.out.println("Obrigado por jogar. Espero que tenha gostado!");
                            PauseConsole.pauseConsole();
                            jogoRodando = false;
                            break;
                        }
                    }
                    else if (random == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("O inimigo dobrou sua defesa!");
                        g = true;
                        PauseConsole.pauseConsole();
                    }
                    else
                    {
                        if (inimigo.getVida() < inimigo.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("O inimigo usou uma pocao e subiu de "+inimigo.getVida());
                                pocao.pocaoInimigo(inimigo);
                                if (inimigo.getVida() > inimigo.getVidamax())
                                {
                                    inimigo.setVida(inimigo.getVidamax());
                                }
                                System.out.print(" para "+inimigo.getVida()+"!\n");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("O inimigo tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            ClearConsole.clearConsole();
                            titulo("O inimigo tentou usar uma pocao com vida cheia! Nao sei o porque ele tentou fazer isso...");
                            PauseConsole.pauseConsole();
                        }
                    }
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                    titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                    System.out.println("Sua vez, o que voce fara?");
                    separador(20);
                    System.out.println("(1) Lutar\n(2) Defender\n(3) Usar pocao");
                    int input4 = LerNumero("-> ", 3);
                    if (input4 == 1)
                    {
                        if (g)
                        {
                            int danoSofrido = 2 * inimigo.defend() - jogador.attack(jogador);
                            System.out.println("Voce atacou o inimigo, mas ele estava com a defesa dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + (-1 * danoSofrido) + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                            if(inimigo.getVida() <= 0)
                            {
                                inimigo.setVida(0);
                                ClearConsole.clearConsole();
                                titulo("Voce derrotou "+inimigo.getNome()+"!");
                                jogador.setXp(jogador.getXp() + inimigo.getXp());
                                System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                                PauseConsole.pauseConsole();
                                break;
                            }
                        }
                        else
                        {
                            int danoSofrido2 = inimigo.defend() - jogador.attack(jogador);
                            if (inimigo.defend() - jogador.attack(jogador) >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + -1 * danoSofrido2 + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido2);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                    else if (input4 == 2)
                    {
                        h = true;
                    }
                    else if (input4 == 3)
                    {
                        if (jogador.getVida() < jogador.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("Voce usou uma pocao e subiu de "+jogador.getVida());
                                pocao.pocao(jogador);
                                if (jogador.getVida() > jogador.getVidamax())
                                {
                                    jogador.setVida(jogador.getVidamax());
                                }
                                System.out.print(" para "+jogador.getVida()+"!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("Voce tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                }
                if(inimigo.getVida() <= 0)
                {
                    inimigo.setVida(0);
                    ClearConsole.clearConsole();
                    titulo("Voce derrotou "+inimigo.getNome()+"!");
                    jogador.setXp(jogador.getXp() + inimigo.getXp());
                    System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                    PauseConsole.pauseConsole();
                    break;
                }
                else
                {
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                    titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                    System.out.println("Sua vez, o que voce fara?");
                    separador(20);
                    System.out.println("(1) Lutar\n(2) Defender\n(3) Usar pocao");
                    int input4 = LerNumero("-> ", 3);
                    if (input4 == 1)
                    {
                        if (g)
                        {
                            int danoSofrido = 2 * inimigo.defend() - jogador.attack(jogador);
                            System.out.println("Voce atacou o inimigo, mas ele estava com a defesa dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + (-1 * danoSofrido) + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            int danoSofrido2 = inimigo.defend() - jogador.attack(jogador);
                            if (inimigo.defend() - jogador.attack(jogador) >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + -1 * danoSofrido2 + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido2);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                    else if (input4 == 2)
                    {
                        h = true;
                    }
                    else if (input4 == 3)
                    {
                        if (jogador.getVida() < jogador.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("Voce usou uma pocao e subiu de "+jogador.getVida());
                                pocao.pocao(jogador);
                                if (jogador.getVida() > jogador.getVidamax())
                                {
                                    jogador.setVida(jogador.getVidamax());
                                }
                                System.out.print(" para "+jogador.getVida()+"!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("Voce tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                    ClearConsole.clearConsole();
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo("Vez do inimigo:");
                    PauseConsole.pauseConsole();
                    int random = rand.nextInt(3);
                    if (random == 0)
                    {
                        if (h)
                        {
                            int danoSofrido = 2 * jogador.defend(jogador) - inimigo.attack();
                            System.out.println("O inimigo atacou voce, mas sua defesa estava dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + (-1 * danoSofrido) + " de dano!");
                                jogador.setVida(jogador.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            if (jogador.defend(jogador) - inimigo.attack() >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + -1 * (jogador.defend(jogador) - inimigo.attack()) + " de dano!");
                                jogador.setVida(jogador.getVida() + jogador.defend(jogador) - inimigo.attack());
                                PauseConsole.pauseConsole();
                            }
                        }
                        if (jogador.getVida() < 0)
                        {
                            jogador.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce morreu...");
                            titulo("Voce ganhou "+jogador.getXp()+" na sua jornada. Tente ganhar mais na proxima vez!");
                            System.out.println("Obrigado por jogar. Espero que tenha gostado!");
                            PauseConsole.pauseConsole();
                            jogoRodando = false;
                            break;
                        }
                    }
                    else if (random == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("O inimigo dobrou sua defesa!");
                        g = true;
                        PauseConsole.pauseConsole();
                    }
                    else
                    {
                        if (inimigo.getVida() < inimigo.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                separador(30);
                                System.out.println("O inimigo usou uma pocao e subiu de "+inimigo.getVida());
                                pocao.pocaoInimigo(inimigo);
                                if (inimigo.getVida() > inimigo.getVidamax())
                                {
                                    inimigo.setVida(inimigo.getVidamax());
                                }
                                System.out.print(" para "+inimigo.getVida()+"!\n");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("O inimigo tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            ClearConsole.clearConsole();
                            titulo("O inimigo tentou usar uma pocao com vida cheia! Nao sei o porque ele tentou fazer isso...");
                            PauseConsole.pauseConsole();
                        }
                    }
                }
            }
        }
        else
        {
            Random rand = new Random();
            Inimigo inimigo = new Inimigo(inimigos[5], 200);
            inimigo.setAgilidade(7);
            inimigo.setVida(200);
            int o = 0;
            boolean g = false;
            boolean h = false;
            ClearConsole.clearConsole();
            titulo("Voce acaba de entrar em batalha. Prepare-se!");
            PauseConsole.pauseConsole();
            while(true)
            {
                if(inimigo.getVida() <= 0)
                {
                    inimigo.setVida(0);
                    ClearConsole.clearConsole();
                    titulo("Voce derrotou "+inimigo.getNome()+"!");
                    jogador.setXp(jogador.getXp() + inimigo.getXp());
                    System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                    PauseConsole.pauseConsole();
                    ClearConsole.clearConsole();
                    titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                    PauseConsole.pauseConsole();
                    ClearConsole.clearConsole();
                    break;
                }
                ClearConsole.clearConsole();
                titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                if (inimigo.getAgilidade() > jogador.getAgilidade())
                {
                    if(!K)
                    {
                        titulo("O inimigo agiu primeiro!\nAVISO: Sua agilidade esta baixa!");
                        PauseConsole.pauseConsole();
                        K = true;
                    }
                    ClearConsole.clearConsole();
                    titulo("Vez do inimigo:");
                    PauseConsole.pauseConsole();
                    int random = rand.nextInt(3);
                    if (random == 0)
                    {
                        if (h)
                        {
                            int danoSofrido = 2 * jogador.defend(jogador) - inimigo.attack();
                            System.out.println("O inimigo atacou voce, mas sua defesa estava dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + (-1 * danoSofrido) + " de dano!");
                                jogador.setVida(jogador.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            if (jogador.defend(jogador) - inimigo.attack() >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + -1 * (jogador.defend(jogador) - inimigo.attack()) + " de dano!");
                                jogador.setVida(jogador.getVida() + jogador.defend(jogador) - inimigo.attack());
                                PauseConsole.pauseConsole();
                            }
                        }
                        if (jogador.getVida() < 0)
                        {
                            jogador.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce morreu...");
                            titulo("Voce ganhou "+jogador.getXp()+" na sua jornada. Tente ganhar mais na proxima vez!");
                            System.out.println("Obrigado por jogar. Espero que tenha gostado!");
                            PauseConsole.pauseConsole();
                            jogoRodando = false;
                            break;
                        }
                    }
                    else if (random == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("O inimigo dobrou sua defesa!");
                        g = true;
                        PauseConsole.pauseConsole();
                    }
                    else
                    {
                        if (inimigo.getVida() < inimigo.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("O inimigo usou uma pocao e subiu de "+inimigo.getVida());
                                pocao.pocaoInimigo(inimigo);
                                if (inimigo.getVida() > inimigo.getVidamax())
                                {
                                    inimigo.setVida(inimigo.getVidamax());
                                }
                                System.out.print(" para "+inimigo.getVida()+"!");
                                PauseConsole.pauseConsole();
                                ClearConsole.clearConsole();
                            }
                            else
                            {
                                System.out.println("O inimigo tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            ClearConsole.clearConsole();
                            titulo("O inimigo tentou usar uma pocao com vida cheia! Nao sei o porque ele tentou fazer isso...");
                            PauseConsole.pauseConsole();
                        }
                    }
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                    titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                    System.out.println("Sua vez, o que voce fara?");
                    separador(20);
                    System.out.println("(1) Lutar\n(2) Defender\n(3) Usar pocao");
                    int input4 = LerNumero("-> ", 3);
                    if (input4 == 1)
                    {
                        if (g)
                        {
                            int danoSofrido = 2 * inimigo.defend() - jogador.attack(jogador);
                            System.out.println("Voce atacou o inimigo, mas ele estava com a defesa dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + (-1 * danoSofrido) + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                            if(inimigo.getVida() <= 0)
                            {
                                inimigo.setVida(0);
                                ClearConsole.clearConsole();
                                titulo("Voce derrotou "+inimigo.getNome()+"!");
                                jogador.setXp(jogador.getXp() + inimigo.getXp());
                                System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                                PauseConsole.pauseConsole();
                                ClearConsole.clearConsole();
                                titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                                PauseConsole.pauseConsole();
                                ClearConsole.clearConsole();
                                break;
                            }
                        }
                        else
                        {
                            int danoSofrido2 = inimigo.defend() - jogador.attack(jogador);
                            if (inimigo.defend() - jogador.attack(jogador) >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + -1 * danoSofrido2 + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido2);
                                PauseConsole.pauseConsole();
                            }
                        }
                        if(inimigo.getVida() <= 0)
                        {
                            inimigo.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce derrotou "+inimigo.getNome()+"!");
                            jogador.setXp(jogador.getXp() + inimigo.getXp());
                            System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            break;
                        }
                    }
                    else if (input4 == 2)
                    {
                        h = true;
                    }
                    else if (input4 == 3)
                    {
                        if (jogador.getVida() < jogador.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("Voce usou uma pocao e subiu de "+jogador.getVida());
                                pocao.pocao(jogador);
                                if (jogador.getVida() > jogador.getVidamax())
                                {
                                    jogador.setVida(jogador.getVidamax());
                                }
                                System.out.print(" para "+jogador.getVida()+"!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("Voce tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                }
                if(inimigo.getVida() <= 0)
                {
                    inimigo.setVida(0);
                    ClearConsole.clearConsole();
                    titulo("Voce derrotou "+inimigo.getNome()+"!");
                    jogador.setXp(jogador.getXp() + inimigo.getXp());
                    System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                    PauseConsole.pauseConsole();
                    ClearConsole.clearConsole();
                    titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                    PauseConsole.pauseConsole();
                    ClearConsole.clearConsole();
                    break;
                }
                else
                {
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo(inimigo.getNome() + "\nHP: " + inimigo.getVida() + "/" + inimigo.getVidamax());
                    titulo(jogador.getNome() + "\nHP: " + jogador.getVida() + "/" + jogador.getVidamax());
                    System.out.println("Sua vez, o que voce fara?");
                    separador(20);
                    System.out.println("(1) Lutar\n(2) Defender\n(3) Usar pocao");
                    int input4 = LerNumero("-> ", 3);
                    if (input4 == 1)
                    {
                        if (g)
                        {
                            int danoSofrido = 2 * inimigo.defend() - jogador.attack(jogador);
                            System.out.println("Voce atacou o inimigo, mas ele estava com a defesa dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + (-1 * danoSofrido) + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                            if(inimigo.getVida() <= 0)
                            {
                                inimigo.setVida(0);
                                ClearConsole.clearConsole();
                                titulo("Voce derrotou "+inimigo.getNome()+"!");
                                jogador.setXp(jogador.getXp() + inimigo.getXp());
                                System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                                PauseConsole.pauseConsole();
                                ClearConsole.clearConsole();
                                titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                                PauseConsole.pauseConsole();
                                ClearConsole.clearConsole();
                                break;
                            }
                        }
                        else
                        {
                            int danoSofrido2 = inimigo.defend() - jogador.attack(jogador);
                            if (inimigo.defend() - jogador.attack(jogador) >= 0)
                            {
                                titulo("Voce causou 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                titulo("Voce causou " + -1 * danoSofrido2 + " de dano!");
                                inimigo.setVida(inimigo.getVida() + danoSofrido2);
                                PauseConsole.pauseConsole();
                            }
                        }
                        if(inimigo.getVida() <= 0)
                        {
                            inimigo.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce derrotou "+inimigo.getNome()+"!");
                            jogador.setXp(jogador.getXp() + inimigo.getXp());
                            System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            break;
                        }
                    }
                    else if (input4 == 2)
                    {
                        h = true;
                    }
                    else if (input4 == 3)
                    {
                        if (jogador.getVida() < jogador.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("Voce usou uma pocao e subiu de "+jogador.getVida());
                                pocao.pocao(jogador);
                                if (jogador.getVida() > jogador.getVidamax())
                                {
                                    jogador.setVida(jogador.getVidamax());
                                }
                                System.out.print(" para "+jogador.getVida()+"!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("Voce tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                    }
                    ClearConsole.clearConsole();
                    if(inimigo.getVida() <= 0)
                    {
                        inimigo.setVida(0);
                        ClearConsole.clearConsole();
                        titulo("Voce derrotou "+inimigo.getNome()+"!");
                        jogador.setXp(jogador.getXp() + inimigo.getXp());
                        System.out.println("Voce ganhou "+inimigo.getXp()+" de experiencia!");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        titulo("Voce ganhou o jogo! Espero que tenha gostado!\nJogo por Joao Pedro Lopes(Main Dev) e Tarcisio Ramses(Dev)");
                        PauseConsole.pauseConsole();
                        ClearConsole.clearConsole();
                        break;
                    }
                    ClearConsole.clearConsole();
                    titulo("Vez do inimigo:");
                    PauseConsole.pauseConsole();
                    int random = rand.nextInt(3);
                    if (random == 0)
                    {
                        if (h)
                        {
                            int danoSofrido = 2 * jogador.defend(jogador) - inimigo.attack();
                            System.out.println("O inimigo atacou voce, mas sua defesa estava dobrada!");
                            separador(30);
                            PauseConsole.pauseConsole();
                            ClearConsole.clearConsole();
                            if (danoSofrido >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + (-1 * danoSofrido) + " de dano!");
                                jogador.setVida(jogador.getVida() + danoSofrido);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            if (jogador.defend(jogador) - inimigo.attack() >= 0)
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu 0 de dano!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                ClearConsole.clearConsole();
                                titulo("Voce sofreu" + -1 * (jogador.defend(jogador) - inimigo.attack()) + " de dano!");
                                jogador.setVida(jogador.getVida() + jogador.defend(jogador) - inimigo.attack());
                                PauseConsole.pauseConsole();
                            }
                        }
                        if (jogador.getVida() < 0)
                        {
                            jogador.setVida(0);
                            ClearConsole.clearConsole();
                            titulo("Voce morreu...");
                            titulo("Voce ganhou "+jogador.getXp()+" na sua jornada. Tente ganhar mais na proxima vez!");
                            System.out.println("Obrigado por jogar. Espero que tenha gostado!");
                            PauseConsole.pauseConsole();
                            jogoRodando = false;
                            break;
                        }
                    }
                    else if (random == 1)
                    {
                        ClearConsole.clearConsole();
                        titulo("O inimigo dobrou sua defesa!");
                        g = true;
                        PauseConsole.pauseConsole();
                    }
                    else
                    {
                        if (inimigo.getVida() < inimigo.getVidamax())
                        {
                            o++;
                            if (o <= 3)
                            {
                                System.out.println("O inimigo usou uma pocao e subiu de "+inimigo.getVida());
                                pocao.pocaoInimigo(inimigo);
                                if (inimigo.getVida() > inimigo.getVidamax())
                                {
                                    inimigo.setVida(inimigo.getVidamax());
                                }
                                System.out.print(" para "+inimigo.getVida()+"!");
                                PauseConsole.pauseConsole();
                            }
                            else
                            {
                                System.out.println("O inimigo tentou usar uma pocao, mas ja gastou todas!");
                                separador(30);
                                PauseConsole.pauseConsole();
                            }
                        }
                        else
                        {
                            ClearConsole.clearConsole();
                            titulo("O inimigo tentou usar uma pocao com vida cheia! Nao sei o porque ele tentou fazer isso...");
                            PauseConsole.pauseConsole();
                        }
                    }
                }
            }
        }
    }
}