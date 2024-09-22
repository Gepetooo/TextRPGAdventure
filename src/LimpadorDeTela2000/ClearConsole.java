package LimpadorDeTela2000;
import java.io.IOException;

public class ClearConsole {
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("Limpeza do console não suportada para este sistema.");
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao tentar limpar o console: " + e.getMessage());
        }
    }
}

