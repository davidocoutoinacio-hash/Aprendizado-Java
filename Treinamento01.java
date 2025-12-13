import java.util.Scanner;

public class Treinamento01 {

    private final static String WELCOME_MESSAGE = "Seja bem vindo ao sistema";
    private final static String ASK_NAME = "Qual seu nome";
    private final static String ASK_AGE = "Qual sua idade";
    private final static String GREETING_MESSAGE = "Olá, %s sua idade é %s";
    private final static String NEXT_MESSAGE = "vamos continuar";
    private final static String CONTINUAR_MESSAGE = "Continuar? (s/n)";


    public static void main(String[] args){

            var scanner = new Scanner(System.in);
            System.out.println(WELCOME_MESSAGE);
            System.out.println(ASK_NAME);
            var name = scanner.next();
            System.out.println(ASK_AGE);
            var age = scanner.nextInt();
            System.out.printf(GREETING_MESSAGE, name, age);
            System.out.println(NEXT_MESSAGE);
            System.out.println(CONTINUAR_MESSAGE);
            var pass = scanner.next();
            if(pass.equalsIgnoreCase("s")){
                main(args);
            } else {
                System.out.println("Encerrando o sistema");
            }
        }
}




