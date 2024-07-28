package Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Banco.Banco.Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferirPix(double valor, String pix) {
		System.out.println("=== Enviando " + valor + " para o usuário com a seguinte chavePix: " + pix + "pela conta corrente ===");
	}

	@Override
	public void imprimirChavePix(Cliente cliente) {
		System.out.println("Transferindo por pix (corrente)...");
		System.out.println("Chave pix: " + cliente.GetPix());
	}
}
