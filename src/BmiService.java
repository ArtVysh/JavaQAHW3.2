public class BmiService {
    public int calculate(int weightInKilograms, double heightInMeter) {
        return (int) (weightInKilograms / Math.pow(heightInMeter, 2));
    }
}
