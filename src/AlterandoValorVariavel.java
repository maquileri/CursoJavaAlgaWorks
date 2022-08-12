import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = á vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		
		Boolean pagamentoAvista = tipoPagamento.equals(1); //como se fosse uma pergunta (equals é =) 1?
		
		double juros = 0.0;
		
		if(!pagamentoAvista) { // ! nega 
			juros = 10.0; //tipo double só declaro uma vez, se for alterar o valor não declara o tipo se não o java indica q a variavel esta duplicada
		}
		
		double acrescimo = valorProduto * juros / 100;
		
		double valorTotal = acrescimo + valorProduto;
		
		System.out.println("valor total: " + valorTotal);
		
		scanner.close();
	}

}
