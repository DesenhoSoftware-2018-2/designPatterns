package builder;

/**
*
* @author lucianaribeiro
*/

public class ConcessionariaDirector {
	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	public void construirCarro() {
		montadora.buildPreco();
		montadora.buildAnoFabricacao();
		montadora.buildDscMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public CarroProduct getCarro() {
		return montadora.getCarro();
	}
	
	public void showCarro(CarroProduct carro) {
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	            + "\nAno: " + carro.anoFabricacao + "\nMotor: "
	            + carro.dscMotor + "\nValor: " + carro.preco + "\n \n");
	}
}
