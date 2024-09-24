package LogicaDoJogo;

import LimpadorDeTela2000.*;
import LogicaDoJogo.*;

public class Historia {
    public static void historia()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("HISTORIA");
        System.out.println("Em uma cidade mergulhada na corrupcao, um heroi anonimo se prepara para enfrentar a " +
                "temida organizacao criminosa liderada por Alessandra Natasha. Sua jornada começa em Alcindo " +
                "Cacela, onde ele derrota o traiçoeiro Joao Pedro Wan-Meyl, ganhando confianca para prosseguir." +
                "No CESUPA: Unidade ARGO, ele enfrenta Ramon Souza em uma batalha intensa e, ao vence-lo, " +
                "descobre planos secretos da organizacao. Seguindo para o LAB Subsolo, o heroi confronta Pedro " +
                "Girotto e Jose Victor, desmantelando experimentos sombrios e coletando informacoes cruciais." +
                "A luta culmina no Auditorio, onde Ana Alice, uma guardia leal de Alessandra, tenta impedi-lo. " +
                "Apos uma batalha feroz, ele a derrota e avanca para o covil da chefe final." +
                "No confronto final, Alessandra Natasha mostra todo seu poder, mas o protagonista, utilizando " +
                "suas habilidades e determinacao, a derrota. Com a organizacao desmantelada, a cidade finalmente " +
                "respira aliviada, e o heroi se torna um simbolo de esperanca, pronto para enfrentar novos " +
                "desafios que surgirao no horizonte.");
        PauseConsole.pauseConsole();
    }

    public static void ato1()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO I - INTRO");
        System.out.println("Em uma cidade envolta em sombras, o heroi anonimo se preparava para enfrentar uma " +
                "perigosa organizacao criminosa que ameacava a paz local. O primeiro passo de sua jornada o levou a " +
                "Alcindo Cacela, onde o grupo, liderado pela astuta Alessandra Natasha, operava com impunidade. O " +
                "protagonista sabia que precisava enfrentar cada membro do bando, comecando pelo traicoeiro Joao " +
                "Pedro Wan-Meyl.");
        PauseConsole.pauseConsole();
    }

    public static void ato1fim()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO I - FIM");
        System.out.println("Com a vitoria sobre Joao, o protagonista se sentiu mais confiante. Ele se afastou das sombras, determinado a continuar sua missao e desmantelar a organizacao. Um novo desafio o aguardava na CESUPA: Unidade ARGO.");
        PauseConsole.pauseConsole();
    }

    public static void ato2()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO II - INTRO");
        System.out.println("Apos a batalha contra Joao, o heroi entrou na CESUPA: Unidade ARGO. O ambiente estava cheio de seguranca e tecnologia, e ele sabia que Ramon Souza estava esperando.");
    }

    public static void ato2fim()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO II - FIM");
        System.out.println("Com Ramon derrotado, o protagonista respirou fundo e avaliou os dados que Ramon havia deixado para tras. Eles revelavam planos que levariam a uma nova fase da organizacao. Com essa informacao, ele se preparou para descer ao LAB Subsolo.");
        PauseConsole.pauseConsole();
    }

    public static void ato3()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO III - INTRO");
        System.out.println("O LAB Subsolo era uma caverna de horrores. Pedro Girotto e Jose Victor estavam imersos em experimentos sombrios.");
    }

    public static void ato3fim()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO III - FIM");
        System.out.println("Com Pedro e Jose fora de combate, o heroi se deparou com documentos que revelavam planos ainda mais nefastos da organizacao. Ele percebeu que o tempo estava se esgotando e que a proxima parada seria o Auditorio, onde tudo poderia ser decidido.");
        PauseConsole.pauseConsole();
    }

    public static void ato4()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("ATO FINAL - INTRO");
        System.out.println("No covil de Alessandra Natasha, a atmosfera estava carregada de tensao. Alessandra, com sua presenca intimidadora, atacou com uma forca devastadora.");
        PauseConsole.pauseConsole();
    }

    public static void fim()
    {
        ClearConsole.clearConsole();
        Coisas.titulo("FIM");
        System.out.println("Com Alessandra Natasha finalmente derrotada, o protagonista respirou fundo, sentindo a liberdade retornar a cidade. A sombra da organizacao foi dissipada, e ele sabia que sua luta tinha inspirado muitos. O futuro parecia promissor, mas ele tambem sabia que novos desafios sempre surgiriam. E assim, sua historia continuaria, pronta para ser escrita.");
        PauseConsole.pauseConsole();
    }
}
