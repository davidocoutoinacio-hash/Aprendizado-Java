
import java.util.Scanner;

public class Treinamento04 {


     //idade para dirigir

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);



        System.out.printf("Você pode dirigir! (%s) \n", canDrive);


        Treinamento05.main(args);

        
    
    }
    
}
