import java.io.PrintStream;
import java.util.Scanner;   


public class Menu {


    public static PrintStream show = (System.out); 
    public static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

    show.println("Menu Principal");
    show.println("1. Iniciar Jogo");
    show.println("2. Configurações");
    show.println("3. Sair");
    int escolha = scan.nextInt();
    switch (escolha) {
        case 1:
            IniciarJogo.iniciar();
            break;
        case 2:
            MenuPrincipal.configurar();
            break;
        case 3:
            Sair.sairDoJogo();
            break;
        case 4:
            Configuracoes.ajustar();
            break;
        default:
            show.println("Opção inválida. Tente novamente.");
            break;
    }
}

}

class IniciarJogo {

    public static void iniciar() {
        Menu.show.println("Iniciando o jogo...");
        
    }

}

class MenuPrincipal {

    public static void configurar() {
        Menu.show.println("----Menu de Configurações----");
        Menu.show.println("1. Iniciar Jogo");
        Menu.show.println("2. Voltar");
        
    }
}

class Configuracoes {

    public static void ajustar() {
        Menu.show.println("----Configurações----");
        Menu.show.println("1. Ajustar Volume");
        Menu.show.println("2. Alterar Dificuldade");
        Menu.show.println("3. Voltar");
        
    }
}

class Sair {

    public static void sairDoJogo() {
        Menu.show.println("Saindo do jogo. Até mais!");
        
    }
}