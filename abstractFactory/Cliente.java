package abstractFactory;

public class Cliente {

	public static void main(String[] args) {
		FabricaFiat fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroHatch hatch = fabrica.criarCarroHatch();
		sedan.exibirInfoSedan();
		System.out.println();
		hatch.exibirInfoHatch();
		System.out.println();
		
				
		
	}

}
