package br.com.bancobb;

public class Conta {
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	protected double totalDepositos;
	protected double totalSaques;

	public Conta() {
		super();
	}

	public Conta(int numero, Cliente cliente, double saldo) {

		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.totalDepositos = 0.0;
		this.totalSaques = 0.0;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTotalDepositos() {
		return totalDepositos;
	}

	public void setTotalDepositos(double totalDepositos) {
		this.totalDepositos = totalDepositos;
	}

	public double getTotalSaques() {
		return totalSaques;
	}

	public void setTotalSaques(double totalSaques) {
		this.totalSaques = totalSaques;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			totalDepositos += valor;
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			totalSaques += valor;
		}
	}
}
