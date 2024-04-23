
public class Main {

	public static void main(String[] args) {
		Cliente luis = new Cliente();
		luis.setNome("Luis Felipe");
		Conta cc = new ContaCorrente(luis);
		Conta poupanca = new ContaPoupanca(luis);
		cc.depositar(200);
		cc.transferir(150, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
