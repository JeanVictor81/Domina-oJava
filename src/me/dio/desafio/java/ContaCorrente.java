package me.dio.desafio.java;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirEstrato() {
		System.out.println("\n--- Conta Corrente ---");
		super.imprimirInfosComuns();
	}

	public void transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		
	}

	

}
