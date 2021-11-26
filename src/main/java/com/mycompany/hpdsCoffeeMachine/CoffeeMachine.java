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
    private SugarSelector sugarSelector = new SugarSelector();

    public Tank getWaterTank() {
        return waterTank;
    }

    public Tank getCoffeeTank() {
        return coffeeTank;
    }

    public Tank getSugarTank() {
        return sugarTank;
    }

    public Tank getMilkTank() {
        return milkTank;
    }

    public SugarSelector getSugarSelector() {
        return sugarSelector;
    }

    public void prepareProduct(Product product){
        if(product == Product.COFFEE_EXPRESS) prepareProductCoffeeExpress();
    }

    private void prepareProductCoffeeExpress(){
        int levelWaterTank = waterTank.getLevelTankStub();
        int levelCoffeeTank = coffeeTank.getLevelTankStub();
        int levelSugarTank = sugarTank.getLevelTankStub();
        int levelSugarSelected = sugarSelector.getLevelSugarSelected();

        if (levelCoffeeTank >= 1 && levelWaterTank >= 1 && levelSugarTank >= levelSugarSelected){

        }

        mixingTank2.ejectContent();
    }
}
