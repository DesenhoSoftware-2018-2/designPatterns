package abstractFactory2;

public class FabricaLoreal implements FabricaDeProdutos{
	
	public Cacheado criarCacheado() {
		return new shampooCapilar();
	}
	
	public Liso criarLiso() {
		return new Condicionador();
	}

}
