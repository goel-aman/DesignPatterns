package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        WeightManager weightManager = new WeightManager(10);

        // weightInKgAdpater...
        WeightsInKgAdapter kgAdapter = new WeightsInKgAdapter(weightManager);

        System.out.println("Weight in Pounds: " + weightManager.getWeightsInPounds());
        System.out.println("Weight in Kg is: " + kgAdapter.getWeightInKg());
    }
}
