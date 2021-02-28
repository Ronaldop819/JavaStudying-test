package polimorfismo.TV;

public class ModeloTV001 extends TV implements ControleRemoto {
	
	public final String MODELO = "TV001";

	public ModeloTV001(int tamanho, int canal, int volume, boolean ligada) {
		super(tamanho, canal, volume, ligada);
	}

	

	@Override
	public void mudarCanal(int canal) {
		
	}

	@Override
	public void aumentarVolume(int taxa) {
		
	}

	@Override
	public void diminuirVolume(int taxa) {
		
	}

	@Override
	public boolean ligar() {
		super.setLigada(true);
		return false;
	}

	@Override
	public boolean desligar() {
		System.out.println("Até mais :)");
		super.setLigada(false);
		return false;
	}
	
}
