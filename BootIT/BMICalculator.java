class BMICalculator {
    static void kg2BMI(double height, double weight) {
        double BMI = weight / Math.pow(height, 2);
        System.out.println(
                "I am " + height + "cm, and " + weight + " kg. " + "My BMI is " + String.format("%.2f", BMI) + ".");
    }

    public static void main(String[] args) {
        kg2BMI(1.8, 70);

    }
}