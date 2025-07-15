package application;
import Entities.Conta;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Insira o numero da conta ==>");
		int numero = scanner.nextInt();
		System.out.println();
		System.out.print("Insira o nome do titular da conta ==>");
		scanner.nextLine();
		String titular = scanner.nextLine();
		System.out.println();
		System.out.println("Deseja realizar um deposito inicial ? (s/n)");
		char resposta = scanner.next().charAt(0);
		
		if(resposta == 's' ) {
		
			System.out.print("Informe qual sera o valor do deposito inicial ==>");	
			double depositoInicial = scanner.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			
			conta = new Conta(numero, titular);
		}
		System.out.println("Dados Da Conta:");
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Digite o valor de deposito ==> ");
		double deposito = scanner.nextDouble();
		conta.deposito(deposito);
		System.out.println("Atualização do saldo: ");
		System.out.println(conta);
		
		System.out.println("Digite o valor de Saque ==> ");
		double saque = scanner.nextDouble();
		conta.saque(saque);
		System.out.println("Atualização do saldo: ");
		System.out.println(conta);
		
		scanner.close();
		
		
		
	}
}
