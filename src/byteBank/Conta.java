package byteBank;

public class Conta {
	private double saldo;
	 private int agencia;
	 private int numero;
	 private Cliente titular;
	 
	 public Conta(int agencia,int numero, double saldo) {
		 this.agencia = agencia; // 3 Characters
		 this.numero = numero; //4 Characters
		 this.saldo = saldo;
		 System.out.println("Criando nova conta!");
	 }
	 
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
	 
	 
	public double getSaldo() {
		return this.saldo;
	}
	 
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	 
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 
	 
}
