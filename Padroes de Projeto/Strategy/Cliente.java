package strategy;

import strategy.emprestimo.Emprestimo;
import strategy.emprestimo.Proibido;
import strategy.transferencia.TaxaNaoAplicavel;
import strategy.transferencia.Transferencia;

public class Cliente {

	private Emprestimo emprestimo;
	
	private Transferencia transferencia;
	
	public void setEmprestimo(Emprestimo emp) {
		this.emprestimo = emp;
	}
	
	public void fazerEmprestimo() {
		emprestimo.emprestar();
	}
	
	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	
	public void fazerTransferencia() {
		transferencia.transferir();
	}
	
	public static void main(String[] args) {
		Cliente estudante = new Cliente();
		estudante.setEmprestimo(new Proibido());
		estudante.fazerEmprestimo();
		estudante.setTransferencia(new TaxaNaoAplicavel());
		estudante.fazerTransferencia();
	}
}
