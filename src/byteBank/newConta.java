package byteBank;

public class newConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.depositar(100);
		System.out.println(conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.depositar(50);
		System.out.println(conta2.getSaldo());
		
	

	
	}
}
