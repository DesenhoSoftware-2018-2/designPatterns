/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author caleberios
 */
public class FordBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 50000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "1.0";
    }

    @Override
    public void buildAnoFabricacao() {
        carro.anoFabricacao = 2015;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Ka Hatch";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Ford";
    }
    
}
