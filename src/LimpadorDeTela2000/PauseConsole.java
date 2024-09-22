package LimpadorDeTela2000;

import java.util.Scanner;

public class PauseConsole {
    public static void pauseConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine(); // Espera até o usuário pressionar Enter
    }
}

