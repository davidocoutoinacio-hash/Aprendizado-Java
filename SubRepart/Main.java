
package SubRepart;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;

public class Main {

    public static Random gerar = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static PrintStream show = (System.out); 

    public static void main(String[] args) {
       
        var scanner = new Scanner(System.in);
        show.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        show.println("você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);

        OutraClasse.metodo();
    }
}

class OutraClasse {
    public static void metodo() {
        Main.show.println("Método da OutraClasse");

        ClasseAdicional.outroMetodo();
    }
}

class ClasseAdicional {
    public static void outroMetodo() {
        Main.show.println("Outro método da ClasseAdicional");

        MaisUmaClasse.maisUmMetodo();
    }
}

class MaisUmaClasse {
    public static void maisUmMetodo() {
        Main.show.println("Mais um método da MaisUmaClasse");

        ClasseFinal.metodoFinal();
    }
}

class ClasseFinal {
    public static void metodoFinal() {
        Main.show.println("Método final da ClasseFinal");
    }
}
