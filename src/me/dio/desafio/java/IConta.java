package me.dio.desafio.java;

public interface IConta {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(Conta contaDestino, double valor);
	
	void imprimirEstrato();
	
}
