package abstractFactory;

public class FabricaFiat implements FabricadeCarro{
	
	public CarroSedan criarCarroSedan() {
		return new Siena();
	};
	
	public CarroHatch criarCarroHatch() {
		return new Palio();
	};
}
