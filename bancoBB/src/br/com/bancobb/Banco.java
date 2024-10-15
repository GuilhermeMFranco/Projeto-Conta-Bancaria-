package br.com.bancobb;

import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta {

	public Banco(int numero, Cliente cliente, double saldo) {
		super(numero, cliente, saldo);

	}

	public Banco() {

	}

	private List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta adicionada com sucesso.");
	}

	public void listarContas() {
		System.out.println("Lista de contas: ");
		for (Conta conta : contas) {
			System.out.println("Conta: " + conta.getNumero() + " | Titular: " + conta.getCliente().getNome()
					+ " | Depósitos realizado: R$" + conta.getTotalDepositos() + " | Saques realizado: R$"
					+ conta.getTotalSaques() + " | Saldo R$: " + conta.getSaldo() + " reais");
		}
	}

	public void depositar(double valor, Conta conta) {
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor inválido.");
		}
	}

	public void sacar(double valor, Conta conta) {
		if (valor > 0) {
			if (conta.getSaldo() >= valor) {
				conta.sacar(valor);
				System.out.println("Saque de R$" + valor + " realizado com sucesso.");
			} else {
				System.out.println("Valor inválido.");
			}
		}
	}

}
