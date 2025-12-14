

import java.util.Scanner;

	

	public class Aula {

	
	public static void main(String[] args) {

	var scanner = new Scanner(System.in);

	System.out.println("Informe o primeiro numero:");

	var volue1 = scanner.nextInt();

	System.out.println("Informe o segundo número:");

	var volue2 = scanner.nextInt();

	System.out.println(volue1 + " + " + volue2 + " = " + (volue1 + volue2));
	
	//System.out.printf("%s + %s = %s\n", volue1, volue2, volue1 + volue2);

	}

	}