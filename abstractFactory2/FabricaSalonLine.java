package abstractFactory2;

public class FabricaSalonLine implements FabricaDeProdutos{

	@Override
	public Cacheado criarCacheado() {
		return new MaioneseCapilar();
	}

	@Override
	public Liso criarLiso() {
		return new AmidoCapilar();
	}

}
