import java.util.Scanner;


public class Aula4 {

	public static void main(String[] args) {
	var value = (5 + 9) * (10 - 5) / 2;
	System.out.println(value);

	Um.main(args);

	}
	
}

	class Um {

	public static void main(String[] args) {
	var value = 5;
	value += 12;
	System.out.println(value);

	Dois.main(args);

	}

}
 class Dois {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
	System.out.println("informe o primeiro número:");
		var value1 = scanner.nextInt();
	System.out.printf("a raiz quadrada de %s é %s\n", value1,
 Math.sqrt(value1));

		Tres.main(args);

	}

}

 	class Tres {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
	System.out.println("informe o primeiro número:");
		var value1 = scanner.nextInt();
	System.out.printf("a potência de %s é %s\n", value1,
 Math.pow(value1, 10));

		Quatro.main(args);

	}

}
	class Quatro {

	public static void main(String[] args) {
		var value = 50;
		System.out.println(++value);
		System.out.println(value);
	

			//Valores de incremento e decremento

	//ao colocar ++ a sua direita voce está dizendo 
	//use o valor e imprima o valor e + 1 na proxima linha
	//o mesmo vale pra --


	//Se declarar a esquerda eles resolvem na hora se colocar 
	//a direita ele resolve na proxima linha
	
	}

}