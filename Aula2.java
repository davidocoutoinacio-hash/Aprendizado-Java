
import java.util.Scanner;


	
	public class Aula2 {

	
	public static void main(String[] args) {

	var scanner = new Scanner(System.in);

	System.out.println("Informe o primeiro numero:");

	var volue1 = scanner.nextFloat();

	System.out.println("Informe o segundo número:");
	var volue2 = scanner.nextFloat();

	System.out.printf(volue1 + " + " + volue2 + " = " + (volue1 + volue2));
	
	//System.out.printf("%s %% %s = %s\n", volue1,volue2, volue1 % volue2);

	}

	}