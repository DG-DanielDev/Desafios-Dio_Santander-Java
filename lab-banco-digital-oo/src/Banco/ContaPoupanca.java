package Banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Banco.Banco.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferirPix(double valor, String Pix) {
		System.out.println("=== Enviando " + valor + " para o usuário com a seguinte chavePix: " + pix + "pela conta poupança ===");
	}

	@Override
	public void imprimirChavePix(Cliente cliente) {
		System.out.println("Transferindo por pix(poupança)...");
		System.out.println("Chave pix: " + cliente.GetPix());
	}
}
