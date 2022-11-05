package me.dio.desafio.java;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirEstrato() {
		System.out.println("\n--- Conta Poupança ---");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
