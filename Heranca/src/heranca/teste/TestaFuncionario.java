package heranca.teste;

public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario funcionario = new Funcionario ("Rafael", 2521, "inform�tica", 5000.0, "padr�o");
		
		System.out.println("Funcion�rio do m�s �: " + funcionario.getNome());
		System.out.println("Matr�cula: " + funcionario.getMatricula());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Sal�rio: " + funcionario.getSalario());
		System.out.println("Bonifica��o �: " + funcionario.getBonificacao());
		System.out.println("Tipo: " + funcionario.getTipo());
		
		System.out.println();
		
		Funcionario coordenador = new Funcionario ("Ronaldo Philippe", 2123, "Programador S�nior", 15000.0, "Especial");
		
		System.out.println("Coordenador da sede �: " + coordenador.getNome());
		System.out.println("Matr�cula: " + coordenador.getMatricula());
		System.out.println("Departamento: " + coordenador.getDepartamento());
		System.out.println("Sal�rio: " + coordenador.getSalario());
		System.out.println("Bonifica��o especial: " + coordenador.getBonificacao());
		System.out.println("Tipo: " + coordenador.getTipo());
		
		

	}

}
