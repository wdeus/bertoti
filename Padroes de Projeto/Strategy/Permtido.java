package strategy.emprestimo;

public class Permtido implements Emprestimo {

	@Override
	public void emprestar() {
		System.out.println("Emprestimo permitido");
	}

}
