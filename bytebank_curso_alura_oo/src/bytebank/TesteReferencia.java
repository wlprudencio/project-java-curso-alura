package bytebank;

public class TesteReferencia {
	
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		System.out.println("Primeira conta referencia: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("E a mesma conta!");

		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);


	}

}
