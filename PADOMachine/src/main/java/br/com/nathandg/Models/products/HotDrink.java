package br.com.nathandg.Models.products;

public abstract class HotDrink {

    protected Integer quantity;
    protected Integer temperature;
    protected Integer sugar;

    public HotDrink() {}

    public HotDrink(HotDrink.DefaultDrink defaultDrink) {
        this.quantity = defaultDrink.quantity;
        this.temperature = defaultDrink.temperature;
        this.sugar = defaultDrink.sugar;
    }

    public static class DefaultDrink extends HotDrink {

        public DefaultDrink(int quantity, int temperature, int sugar) {
            this.setQuantity(quantity);
            this.setTemperature(temperature);
            this.setSugar(sugar);
        }
    }

    protected void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    protected void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
    protected void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "{\"quantity\":"+quantity+", \"temperature\":"+temperature+", \"sugar\":"+sugar+"}";
    }
}
