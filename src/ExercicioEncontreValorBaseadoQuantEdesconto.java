import java.util.Scanner;

/*Crie um programa que vai receber do usu?rio o valor do produto e a quantidade do produto que se deseja. Com essas informa??es encontre o subtotal que ser? o valor do produto multiplicado pela quantidade.

Depois voc? vai precisar usar uma estrutura de decis?o. Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, voc? N?O aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) voc? multiplica o subtotal pelo pr?prio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, voc? vai retirar esse valor do subtotal. O que sobrar ser? o valor total final e dever? ser apresentado no console.*/


//Exerc?cio 04: Encontre o valor total baseado na quantidade e no desconto


public class ExercicioEncontreValorBaseadoQuantEdesconto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;
		System.out.println("Subtotal ?: " + subtotal);
		
		Boolean recebeDesconto = quantidadeProduto > 10;
		
		Double calculaDesconto = subtotal * 0.10 - subtotal;
		
		if (recebeDesconto) {
			System.out.print("Total a pagar com desconto: " + calculaDesconto );	
		}
		
		
		scanner.close();
	}
}
