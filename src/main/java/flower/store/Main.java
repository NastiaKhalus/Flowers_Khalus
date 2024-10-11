package flower.store;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.setPrice(100);
        flower1.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(new Flower(flower1), 5);
        flowerBucket.add(flowerPack1);

        Flower flower2 = new Flower();
        flower2.setPrice(100);
        flower2.setFlowerType(FlowerType.ROSE);
        FlowerPack flowerPack2 = new FlowerPack(new Flower(flower2), 10);
        flowerBucket.add(flowerPack2);


        System.out.println(flowerBucket.getPrice());

        flower2.setPrice(10);
        System.out.println(flowerBucket.getPrice());
    }
}
