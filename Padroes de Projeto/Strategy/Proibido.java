package strategy.emprestimo;

public class Proibido implements Emprestimo {

	@Override
	public void emprestar() {
		System.out.println("Emprestimo proibido");
		
	}

}
