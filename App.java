package builder;

/**
*
* @author lucianaribeiro
*/

public class App {

	public static void main(String[] args) {
		ConcessionariaDirector concessionariaFiat = new ConcessionariaDirector(new FiatBuilder());
                ConcessionariaDirector concessionariaFord = new ConcessionariaDirector(new FordBuilder());
		CarroProduct palio = new CarroProduct();
                CarroProduct ka = new CarroProduct();
		
		concessionariaFiat.construirCarro();
                palio = concessionariaFiat.getCarro();
                
                concessionariaFord.construirCarro();
                ka = concessionariaFord.getCarro();
		
		concessionariaFiat.showCarro(palio);
                concessionariaFord.showCarro(ka);
                

	}

}
