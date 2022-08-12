import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nicole Barros
 *
 */
public class Exercicio5Constantes {
	
	static final Integer media = 7;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
		
		Boolean passoudeAno = nota >= media; 
		
		if (passoudeAno) {
			System.out.println("Parabéns, você passou de ano!");
		} else {
			System.out.println("Você não passou de ano, estude mais!");
		}
		
		scanner.close();
	}

}
