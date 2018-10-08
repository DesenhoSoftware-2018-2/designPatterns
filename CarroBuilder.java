package builder;

/**
*
* @author lucianaribeiro
*/

public abstract class CarroBuilder {
	protected CarroProduct carro;
	
	public CarroBuilder() {
            carro = new CarroProduct();
	}
	
	public abstract void buildPreco();
	public abstract void buildDscMotor();
	public abstract void buildAnoFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	
	public CarroProduct getCarro() {
            return carro;
	}
}
