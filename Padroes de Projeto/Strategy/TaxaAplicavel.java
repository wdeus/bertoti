package strategy.transferencia;

public class TaxaAplicavel implements Transferencia {

	@Override
	public void transferir() {
		System.out.println("Transferencia com taxa");
		
	}

	
}
