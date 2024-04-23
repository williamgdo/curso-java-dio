import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        System.out.println("Digite o número da conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Digite o número da Agência: ");
        agencia = scan.next();

        System.out.println("Digite seu nome completo: ");
        nomeCliente = scan.next();

        System.out.println("Digite seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso " +
                "banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu " +
                "saldo " + saldo + " já está disponível para saque.");
    }
}
