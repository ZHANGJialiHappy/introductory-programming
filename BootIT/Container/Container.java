package Container;

public class Container {
    String id;
    int amount;
    int max;

    Container(String i, int a, int max) {
        id = i;
        amount = a;
        max = max;
    }

    void show() {
        System.out.println("Container: " + id + " (" + amount + "/" + max + ")");
    }
}
