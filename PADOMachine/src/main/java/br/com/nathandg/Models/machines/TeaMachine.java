package br.com.nathandg.Models.machines;

import br.com.nathandg.Models.products.HotDrink;
import br.com.nathandg.Models.products.Tea;

public class TeaMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
