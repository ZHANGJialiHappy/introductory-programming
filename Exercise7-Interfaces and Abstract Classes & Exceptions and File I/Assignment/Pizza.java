import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    protected List<String> toppings;

    public Pizza() {
        super("Pizza", 45);
        toppings = new ArrayList<>();

    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
        price += 10;
    }

    public void setName(String n) {
        name = n;
    }

    public void display() {
        String result = "{";
        String separator = " ";
        for (String t : toppings) {
            result += (separator + t);
            separator = ", ";
        }
        result += " }";
        System.out.println(price + " kr " + name + " " + result);
    }
}
