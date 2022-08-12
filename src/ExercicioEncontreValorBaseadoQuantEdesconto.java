import java.util.Scanner;

/*Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você multiplica o subtotal pelo próprio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total final e deverá ser apresentado no console.*/


//Exercício 04: Encontre o valor total baseado na quantidade e no desconto


public class ExercicioEncontreValorBaseadoQuantEdesconto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;
		System.out.println("Subtotal é: " + subtotal);
		
		Boolean recebeDesconto = quantidadeProduto > 10;
		
		Double calculaDesconto = subtotal * 0.10 - subtotal;
		
		if (recebeDesconto) {
			System.out.print("Total a pagar com desconto: " + calculaDesconto );	
		}
		
		
		scanner.close();
	}
}
