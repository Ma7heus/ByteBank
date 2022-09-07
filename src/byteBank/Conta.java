package byteBank;

public class Conta {
	double saldo;
	 int agencia;
	 int numero;
	 String titular;
	 
	 
	 public void depositar(double valor) {
		 this.saldo += valor;
	 }
	 
	 public boolean sacar(double valor) {
		 if (this.saldo >= valor) {
			 this.saldo -= valor;
			 return true;	 
		 } else {
			 return false;
		 }
	}
	 
	 
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.depositar(valor);
			this.sacar(valor);
			return true;
		} else {
			return false;
		}
	}
	 
	 
	 
	 
	 
	 
}
