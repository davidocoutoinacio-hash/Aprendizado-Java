
import java.util.Scanner;

public class Treinamento03 {


   private final static String WELCOME_MESSAGE = "----------\\SISTEMA DE VERIFICAÇÕES//----------";


     //idade para dirigir

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var isWrong = age > 17;
        var isLeft = age < 18;
        
        
        if(isLeft){
            System.out.printf(" Você não pode dirigir! (%s) ", isLeft);
        } else
        System.out.printf(" Você pode dirigir! (%s) \n", isWrong);
        System.out.println(" ");

        //soma 2 + 2

        var scar = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2 ?");
        var result = scar.nextInt();
        var isRight = result == 4;
        var isUp = result != 4;
        
        if(isLeft){
            System.out.printf(" resultado é 4, você errou! (%s) ", isUp);
        } else
        System.out.printf(" resultado é 4, você acertou (%s) \n4", isRight);

        Treinamento04.main(args);

    }
    
}
