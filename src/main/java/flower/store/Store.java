package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets;

    public Store() {
        this.flowerBuckets = new ArrayList<>();
    }
    public void addBucket(FlowerBucket bucket) {
        this.flowerBuckets.add(bucket);
    }

    public List<Flower> search(FlowerColor color, FlowerType type, double min, double max) {
        List<Flower> res = new ArrayList<>();

        for (int i = 0; i < flowerBuckets.size(); i++) {
            FlowerBucket bucket = flowerBuckets.get(i);

            for (int j = 0; j < bucket.getFlowerPacks().size(); j++) {
                FlowerPack pack = bucket.getFlowerPacks().get(j);
                Flower flower = pack.getFlower();

                if ((color == null || flower.getColor().equals(color.getCode())) &&
                    (type == null || flower.getFlowerType() == type) &&
                    flower.getPrice() >= min && flower.getPrice() <= max) {
                    res.add(flower);
                }
            }
        }
        return res;
    }
}
