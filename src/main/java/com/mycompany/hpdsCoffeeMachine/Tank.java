package com.mycompany.hpdsCoffeeMachine;

public class Tank {
    private final String name;
    private int numberUnitsBaseProduct;

    public Tank(String name, int numberUnitsBaseProduct) {
        this.name = name;
        this.numberUnitsBaseProduct = numberUnitsBaseProduct;
    }

    public void removeBaseProduct(int numberUnits){
        this.numberUnitsBaseProduct -= numberUnits;
    }

    public void addBaseProduct(int numberUnits){
        //Falta controlar maximos
        this.numberUnitsBaseProduct += numberUnits;
    }

    // Stub del Sensor del Tank
    public int getLevelTank(){
        return this.numberUnitsBaseProduct;
    }
}
