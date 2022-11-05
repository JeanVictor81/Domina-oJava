package me.dio.desafio.java;

public class Main {
	public static void main(String[] args) {
		Cliente jean = new Cliente();
		jean.setNome("Venilton");
		
		Conta cc = new ContaCorrente(jean);
		Conta poupanca = new ContaPoupanca(jean);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirEstrato();
		poupanca.imprimirEstrato();
	}
}
