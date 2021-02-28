package polimorfismo.TV;

public class ExemploInterfaceamento {

	public static void main(String[] args) {
		
		ModeloTV001 tv1 = new ModeloTV001(55, 0, 0, false);
		ModeloX tv2 = new ModeloX(55, 0, 0, false);
		
		tv1.ligar();
		tv2.ligar();
		
		System.out.println("TV1 - modelo " + tv1.MODELO + " está: ");
		System.out.println(tv1.isLigada() ? "ligada" : "deligada");
		
		System.out.println();
		
		System.out.println("TV2 - modelo " + tv2.MODELO + " está: ");
		System.out.println(tv2.isLigada() ? "ligada" : "desligada");
		
		System.out.println();
		
		System.out.println("Desligando televisão " + tv1.MODELO + "...");
		tv1.desligar();
		
		System.out.println();
		
		System.out.println("Desligando televisao " + tv2.MODELO + "...");
		tv2.desligar();
	}

}
