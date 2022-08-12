
public class TipoLogico {
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falso: " + variavelFalsa);
		
		System.out.println("--------------------------------------");
		
		//validar se uma pessoa tem idade suficiente para tirar a cnh
		
		Integer idade = 17;
		
		//estrutura de decisão
		
		
		Boolean podeTirarCarteira = idade >= 18;
		//System.out.println("Pode tirar CNH? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar CNH.");
		}else {
			System.out.println("Não! Ele(a) não pode tirar CNH.");
		}
		
		
	}

}
