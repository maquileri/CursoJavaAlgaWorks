import java.io.InputStream;
import java.util.Scanner;

public class LeNomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
				
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
			
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
		
		scanner.close();
		
	}


}
