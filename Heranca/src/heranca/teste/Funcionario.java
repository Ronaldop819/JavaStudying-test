package heranca.teste;

public class Funcionario extends Pessoa {

	
	private String departamento;
	private String tipo;
	
	
	
	
	public Funcionario(String nome, int matricula, String departamento, double salario, String tipo) {
		super(nome, matricula, salario);
		this.departamento = departamento;
		this.tipo = tipo;
			
	}
	

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public String getTipo() {
		return tipo;
	}


		
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
}
