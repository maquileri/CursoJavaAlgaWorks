//Constantes � igual a uma variavel, uma constante n�o varia o seu valor.
//Uma constante n�o pode ter seu valor alterado


import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//final Integer idadeMinimaParaTirarCarteira = 18; //ao acrescentar final deixa de ser uma variav�l e passa ser uma constante
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("N�o! Ele(a) n�o pode tirar carteira");
		}
		scanner.close();
	}
}
