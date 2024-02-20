package strategy.transferencia;

public class TaxaNaoAplicavel implements Transferencia {

	@Override
	public void transferir() {
		System.out.println("Transferencia sem taxa");
		
	}

}
