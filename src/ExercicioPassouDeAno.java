/*O seu programa deve receber a nota do aluno pelo console e depois 
 * você vai fazer uma operação lógica para saber se a nota do aluno é 
 * maior que 70. O resultado dessa operação lógica deve ser atribuido a 
 * uma variável do tipo Boolean.Por último, você deve utilizar a 
 * variável do tipo Boolean com a estrutura de decisão if para imprimir, 
 * no console, uma mensagem que vai dizer se o aluno passou ou não passou.*/


import java.util.Scanner;

public class ExercicioPassouDeAno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
				Boolean verificaNota = nota >= 7; 
		
		if (verificaNota) {
			System.out.println("Parabéns, você passou de ano!");
		} else {
			System.out.println("Você não passou de ano, estude mais!");
		}
		
		scanner.close();
	}

}
