/*O seu programa deve receber a nota do aluno pelo console e depois 
 * voc� vai fazer uma opera��o l�gica para saber se a nota do aluno � 
 * maior que 70. O resultado dessa opera��o l�gica deve ser atribuido a 
 * uma vari�vel do tipo Boolean.Por �ltimo, voc� deve utilizar a 
 * vari�vel do tipo Boolean com a estrutura de decis�o if para imprimir, 
 * no console, uma mensagem que vai dizer se o aluno passou ou n�o passou.*/


import java.util.Scanner;

public class ExercicioPassouDeAno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
				Boolean verificaNota = nota >= 7; 
		
		if (verificaNota) {
			System.out.println("Parab�ns, voc� passou de ano!");
		} else {
			System.out.println("Voc� n�o passou de ano, estude mais!");
		}
		
		scanner.close();
	}

}
