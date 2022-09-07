package byteBank;

public class newConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 200;
		
		Conta conta2 = new Conta();
		conta2.saldo = 50;
	
		
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
		
		conta2.depositar(1500);
		System.out.println(conta2.saldo);
		
		System.out.println(conta1.saldo);
		conta1.sacar(100);
		System.out.println(conta1.saldo);
	
	}
}
