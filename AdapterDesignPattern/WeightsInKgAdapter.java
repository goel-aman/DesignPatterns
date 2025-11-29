package AdapterDesignPattern;

public class WeightsInKgAdapter implements KgAdapter {
    private WeightManager weightManager;

    WeightsInKgAdapter(WeightManager weightManager) {
        this.weightManager = weightManager;
    }

    @Override
    public double getWeightInKg() {
        return this.weightManager.getWeightsInPounds() * 0.453592;
    }
    
    
}
