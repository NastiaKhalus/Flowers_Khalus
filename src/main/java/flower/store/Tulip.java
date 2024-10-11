package flower.store;

class Tulip extends Flower {

    public Tulip() {
        super(FlowerColor.YELLOW, FlowerType.TULIP, 0.0, 0.0);
    }

    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(color, FlowerType.TULIP, price, sepalLength);
    }
}
