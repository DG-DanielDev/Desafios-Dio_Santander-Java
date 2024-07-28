package Banco;

public class Main {

	public static void main(String[] args) {
		Cliente Daniel = new Cliente();
		Daniel.setNome("Daniel");
		Daniel.setPix("CPX2468900154aR$#2");

		Conta cc = new ContaCorrente(Daniel);
		Conta poupanca = new ContaPoupanca(Daniel);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.transferirPix(150, "RTJ2468900154bR$#3");
		poupanca.transferirPix(150, "RIW2468900154cR$#4");

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc.imprimirChavePix(Daniel);
		poupanca.imprimirChavePix(Daniel);

	}

}
