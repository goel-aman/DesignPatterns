package AdapterDesignPattern;

public class WeightManager {
    private int weightInPounds;

    public WeightManager(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public int getWeightsInPounds() {
        return weightInPounds;
    }
}
