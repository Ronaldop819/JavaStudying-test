package heranca.teste;

public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario funcionario = new Funcionario ("Rafael", 2521, "informática", 5000.0, "padrão");
		
		System.out.println("Funcionário do mês é: " + funcionario.getNome());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Bonificação é: " + funcionario.getBonificacao());
		System.out.println("Tipo: " + funcionario.getTipo());
		
		System.out.println();
		
		Funcionario coordenador = new Funcionario ("Ronaldo Philippe", 2123, "Programador Sênior", 15000.0, "Especial");
		
		System.out.println("Coordenador da sede é: " + coordenador.getNome());
		System.out.println("Matrícula: " + coordenador.getMatricula());
		System.out.println("Departamento: " + coordenador.getDepartamento());
		System.out.println("Salário: " + coordenador.getSalario());
		System.out.println("Bonificação especial: " + coordenador.getBonificacao());
		System.out.println("Tipo: " + coordenador.getTipo());
		
		

	}

}
