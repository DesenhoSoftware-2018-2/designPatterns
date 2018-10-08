package builder;

public class App {

	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		CarroProduct carro = new CarroProduct();
		
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		
		concessionaria.showCarro(carro);
	}

}
