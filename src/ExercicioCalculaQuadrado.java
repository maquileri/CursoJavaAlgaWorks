/*Leia um n�mero no console e depois fa�a o c�lculo do quadrado desse 
n�mero e exiba o resultado no console. Lembrando que o quadrado de um 
n�mero � calculado multiplicando-se o n�mero por ele mesmo. Por exemplo,
para encontrar o quadrado de 2 � preciso multiplicar o 2 por 2, tendo 
como resultado o n�mero 4.*/


import java.util.Scanner;

public class ExercicioCalculaQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um n�mero do quadrado: ");
		int numeroQuarado = scanner.nextInt ();
		
		int calcula = numeroQuarado * numeroQuarado;
		
		System.out.println("O quadrado de um n�mero " + numeroQuarado  + " �:" + calcula);
		
	}

}
