import java.util.ArrayList;
import java.util.List;

public class Order {
    protected List<Food> ordered;

    public Order() {
        ordered = new ArrayList<>();
    }

    public void addFood(Food food) {
        ordered.add(food);
    }

    public int total() {
        int sum = 0;
        for (Food food : ordered) {
            sum += food.price;
        }
        return sum;
    }

    public boolean payWith(CreditCard card) {
        int total = total();
        if (!card.withdraw(total)) {
            System.out.println("ERROR: Payment failed");
        }
        return card.withdraw(total);
    }

    public void display() {
        for (Food f : ordered) {
            f.display();
        }
        System.out.println(total() + " kr " + "TOTAL");
    }

}
