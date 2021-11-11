package com.mycompany.hpdsCoffeeMachine;

public class CoffeeMachine {

    private Tank waterTank = new Tank("waterTank", 200);
    private Tank coffeeTank = new Tank("coffeeTank", 200);
    private Tank sugarTank = new Tank("sugarTank", 500);
    private Tank milkTank = new Tank("milkTank", 10);

    private Coil coil = new Coil();

    private MixingTank mixingTank1 = new MixingTank("coolTank",0);
    private MixingTank mixingTank2 = new MixingTank("heatTank",0);

    private ArrayValve arrayValve= new ArrayValve();

    public void prepareProduct(Product product){
        if(product == Product.COFFEE_EXPRESS) prepareProductCoffeeExpress();
    }

    private void prepareProductCoffeeExpress(){

    }
}
