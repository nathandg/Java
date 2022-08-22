package br.com.nathandg.Models.machines;

import br.com.nathandg.Models.products.Chocolate;
import br.com.nathandg.Models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }

}
