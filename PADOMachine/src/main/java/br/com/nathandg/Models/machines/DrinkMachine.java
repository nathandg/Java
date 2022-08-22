package br.com.nathandg.Models.machines;

import br.com.nathandg.Models.products.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {

    private List<HotDrinkMachine> machines = new ArrayList<>();

    public DrinkMachine() {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        TeaMachine teaMachine = new TeaMachine();

        machines.add(coffeeMachine);
        machines.add(teaMachine);
        machines.add(new ChocolateMachine());

    }

    public void prepare() throws IOException {

        while(true) {

            System.out.println("\nwhich drink would you like to prepare?");

            for (int i = 0; i < machines.size(); i++) {
                System.out.println(i + " => " + machines.get(i).getClass().getSimpleName().replace("Machine", ""));
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int value = Integer.parseInt(reader.readLine());
            HotDrink hotDrink;

            switch (value) {
                case 0:
                    System.out.println("making coffee ...");
                    hotDrink = machines.get(0).makeDrink();
                    System.out.println("here is your coffee: " + hotDrink);
                    break;
                case 1:
                    System.out.println("making tea ...");
                    hotDrink = machines.get(1).makeDrink();
                    System.out.println("here is your tea: " + hotDrink);

                    break;
                case 2:
                    System.out.println("making chocolate ...");
                    hotDrink = machines.get(2).makeDrink();
                    System.out.println("here is your chocolate: " + hotDrink);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }

//            HotDrink hotDrink = this.machines.get(value).makeDrink();
//            System.out.println("preparing your " + hotDrink);

        }
    }

}
