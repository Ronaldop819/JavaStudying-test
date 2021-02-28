package heranca.teste;

public class Coordenador extends Pessoa {

	private String cursoCoordenado;
	private String tipo;
	
	
	public Coordenador(String nome, int matricula, String cursoCoordenado, double salario, String tipo) {
		super(nome, matricula, salario);
		this.cursoCoordenado = cursoCoordenado;
		this.tipo = tipo;
		
	}


	public String getCursoCoordenado() {
		return cursoCoordenado;
	}


	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
