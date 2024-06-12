import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Cria um scanner que possibilita a inserção de dados de forma simples e usa a convenção numérica dos Estados Unidos 
        Scanner scanner = new Scanner(System.in). useLocale(Locale.US);

        // Pede o número da conta/agência do usuário e armazena na variável numero
        System.out.println("Insira seu numero de Agência:");
        int numero = scanner.nextInt();

        // Pede o código da Agência do usuário e armazena na variável agencia
        System.out.println("Insira sua agência:");
        String agencia = scanner.next();

        // Pede o nome do usuário e armazena na variável nomeCliente
        System.out.println("Insira seu nome:");
        String nomeCliente = scanner.next();
        
        // Pede o saldo inicial do usuário e armazena na variável saldo
        System.out.println("Insira seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibe uma mensagem de sucesso na criação da conta do banco
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
