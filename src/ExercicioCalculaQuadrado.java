/*Leia um número no console e depois faça o cálculo do quadrado desse 
número e exiba o resultado no console. Lembrando que o quadrado de um 
número é calculado multiplicando-se o número por ele mesmo. Por exemplo,
para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo 
como resultado o número 4.*/


import java.util.Scanner;

public class ExercicioCalculaQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número do quadrado: ");
		int numeroQuarado = scanner.nextInt ();
		
		int calcula = numeroQuarado * numeroQuarado;
		
		System.out.println("O quadrado de um número " + numeroQuarado  + " é:" + calcula);
		
	}

}
