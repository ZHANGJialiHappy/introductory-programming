public class Temperature {
    static void c2f(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Today, the temperature is " + fahrenheit + "°F");
    }

    static void f2c(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Today, the temperature is " + String.format("%.2f", celsius) + "°C," + "which means it's "
                + fahrenheit + "°C");
    }

    public static void main(String[] args) {
        c2f(30);
        f2c(70);
    }

}
