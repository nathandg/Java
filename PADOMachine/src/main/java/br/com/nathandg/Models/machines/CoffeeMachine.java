package br.com.nathandg.Models.machines;

import br.com.nathandg.Models.products.Coffee;
import br.com.nathandg.Models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
