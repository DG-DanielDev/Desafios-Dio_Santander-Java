package Banco;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

	void transferirPix(double valor, String pix);

	void imprimirChavePix(Cliente cliente);
}
