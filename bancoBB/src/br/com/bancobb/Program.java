package br.com.bancobb;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Banco banco = new Banco();
		String continuar = "s";

		while (continuar.equalsIgnoreCase("s")) {

			System.out.println("Digite o titular da conta: ");
			String nome = sc.nextLine();

			System.out.println("Digite o número da conta: ");
			int numero = sc.nextInt();
			sc.nextLine();

			Cliente cliente = new Cliente(nome);
			Conta conta = new Conta(numero, cliente, 0.0);

			System.out.println("Deseja realizar um depósito? (s/n): ");
			continuar = sc.nextLine();
			if (continuar.equalsIgnoreCase("s")) {
				System.out.println("Digite o valor do deposito: ");
				double valor = sc.nextDouble();
				sc.nextLine();
				banco.depositar(valor, conta);
			}

			System.out.println("Deseja realizar um saque? (s/n): ");
			continuar = sc.nextLine();
			if (continuar.equalsIgnoreCase("s")) {
				System.out.println("Digite o valor do saque: ");
				double valor = sc.nextDouble();
				sc.nextLine();
				banco.sacar(valor, conta);

			}

			banco.getSaldo();

			System.out.println("Deseja adicionar outra conta? (s/n): ");
			continuar = sc.nextLine();

			banco.adicionarConta(conta);
		}

		banco.listarContas();

	}
}