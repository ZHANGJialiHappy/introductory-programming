public class Main {
    public static void main(String[] args) {
        Pizza a = new Pizza();
        a.addTopping("Pepperoni");
        a.addTopping("Pineapple");
        a.addTopping("Onion");
        // a.setName("haha");
        a.display();

        System.out.println("...........");

        Order b = new Order();
        b.addFood(new Food("Burger", 65));
        b.addFood(new Food("Coke", 25));
        b.addFood(a);
        b.display();
    }

}
