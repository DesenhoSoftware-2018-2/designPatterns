package abstractFactory2;

public class Client {

	public static void main(String[] args) {
		FabricaDeProdutos fabrica = new FabricaLoreal();
		
		
		System.out.println("LOREAL:");
		
		Cacheado cacheado = fabrica.criarCacheado();
		cacheado.exibirInfoCacheado();
		System.out.println();
		
		Liso liso = fabrica.criarLiso();
		liso.exibirInfoLiso();
		System.out.println();
		
		System.out.println("\n \nSALONLINE: ");
		
		fabrica = new FabricaSalonLine();
		cacheado = fabrica.criarCacheado();
		cacheado.exibirInfoCacheado();
		System.out.println();
		
		liso = fabrica.criarLiso();
		liso.exibirInfoLiso();
	}

}
