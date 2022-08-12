import java.util.Scanner;

public class ExercicioCanculoIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso /(altura * altura);
		
		System.out.println("Seu IMC é de: " + imc);
		
		
	}

}
