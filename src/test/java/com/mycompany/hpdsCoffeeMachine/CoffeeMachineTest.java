package com.mycompany.hpdsCoffeeMachine;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CoffeeMachineTest {
    @Test
    public void testPrepareCoffeeExpressStub(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        int levelWaterBefore = coffeeMachine.getWaterTank().getLevelTankStub();
        int levelCoffeeBefore = coffeeMachine.getCoffeeTank().getLevelTankStub();
        int levelSugarBefore = coffeeMachine.getSugarTank().getLevelTankStub();
        int levelSugarSelected = coffeeMachine.getSugarSelector().getLevelSugarSelected();

        coffeeMachine.prepareProduct(Product.COFFEE_EXPRESS);

        int levelWaterAfter = coffeeMachine.getWaterTank().getLevelTankStub();
        int levelCoffeeAfter = coffeeMachine.getCoffeeTank().getLevelTankStub();
        int levelSugarAfter = coffeeMachine.getSugarTank().getLevelTankStub();

        assert(levelWaterBefore - levelWaterAfter == 1);
        assert(levelCoffeeBefore - levelCoffeeAfter == 1);
        assert(levelSugarBefore - levelSugarAfter == levelSugarSelected);
    }

    @Test
    public void testPrepareCoffeeExpressMock(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Sensor sensorLevelWaterMock = mock(SensorLevelTank.class);
        doReturn(100).when(sensorLevelWaterMock).getValue();
        Sensor sensorLevelCoffeeMock = mock(SensorLevelTank.class);
        doReturn(100).when(sensorLevelCoffeeMock).getValue();
        Sensor sensorLevelSugarMock = mock(SensorLevelTank.class);
        doReturn(100).when(sensorLevelSugarMock).getValue();
        Sensor sensorLevelSugarSelectedMock = mock(SensorLevelTank.class);
        doReturn(3).when(sensorLevelSugarSelectedMock).getValue();


        int levelWaterBefore = sensorLevelWaterMock.getValue();
        int levelCoffeeBefore = sensorLevelCoffeeMock.getValue();
        int levelSugarBefore = sensorLevelSugarMock.getValue();
        int levelSugarSelected = sensorLevelSugarSelectedMock.getValue();

        coffeeMachine.prepareProduct(Product.COFFEE_EXPRESS);

        doReturn(99).when(sensorLevelWaterMock).getValue();
        doReturn(99).when(sensorLevelCoffeeMock).getValue();
        doReturn(97).when(sensorLevelSugarMock).getValue();

        int levelWaterAfter = sensorLevelWaterMock.getValue();
        int levelCoffeeAfter = sensorLevelCoffeeMock.getValue();
        int levelSugarAfter = sensorLevelSugarMock.getValue();

        assert(levelWaterBefore - levelWaterAfter == 1);
        assert(levelCoffeeBefore - levelCoffeeAfter == 1);
        assert(levelSugarBefore - levelSugarAfter == levelSugarSelected);

        verify(sensorLevelWaterMock,times(2)).getValue();
        verify(sensorLevelCoffeeMock,times(2)).getValue();
        verify(sensorLevelSugarMock,times(2)).getValue();
    }
}
