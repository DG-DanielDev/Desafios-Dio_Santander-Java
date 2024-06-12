import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in). useLocale(Locale.US);

    System.out.println("Insira seu numero de Agência:");
    int numero = scanner.nextInt();

    System.out.println("Insira sua agência:");
    String agencia = scanner.next();

    System.out.println("Insira seu nome:");
    String nomeCliente = scanner.next();
    
    System.out.println("Insira seu saldo:");
    double saldo = scanner.nextDouble();

    System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
