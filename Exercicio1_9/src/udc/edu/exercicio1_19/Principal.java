package udc.edu.exercicio1_19;

public class Principal {
	
	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente("12345", 500, 260, false);
		ContaCorrente conta2 = new ContaCorrente("56789", 1000, 500, false);
		ContaCorrente conta3 = new ContaCorrente("101112", 1200, 650, true);
		ContaCorrente conta4 = new ContaCorrente("131415", 200, 100, false);
		
		Banco banco1 = new Banco();
		banco1.createAccount(conta1);
		banco1.createAccount(conta2);
		banco1.createAccount(conta3);
		banco1.createAccount(conta4);
		
		banco1.depositar(conta1, 250);
	
		
	}

}
