package byteBank;

public class newConta {
	public static void main(String[] args) {
		
		
		Cliente matheus = new Cliente();
			matheus.setNome("Matheus");
			matheus.setCpf("130.752.349-82");
			matheus.setProfissao("Programador");
		
		System.out.println(matheus.getCpf());
			
		Conta conta1 = new Conta();
			conta1.setSaldo(100);
			conta1.setTitular(matheus);
			
		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta1.getSaldo());
			
		
			
			
		//Conta contaMatheus = matheus;
		//System.out.println(matheus.getNome());
		


		

	
	}
}
