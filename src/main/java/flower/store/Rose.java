package flower.store;

class Rose extends Flower {

    public Rose() {
        super(FlowerColor.RED, FlowerType.ROSE, 0.0, 0.0);
    }

    public Rose(double sepalLength, FlowerColor color, double price) {
        super(color, FlowerType.ROSE, price, sepalLength);
    }
}