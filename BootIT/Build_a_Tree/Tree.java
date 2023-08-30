package Build_a_Tree;

public class Tree {
    double height;
    int age;
    double growth_rate;
    int max_age;
    boolean is_dead;

    Tree(double h, int a, double r, int m_a) {
        height = h;
        age = a;
        growth_rate = r;
        max_age = m_a;
        is_dead = false;
    }

    void display() {
        if (age <= max_age) {
            if (age % 5 != 0) {
                System.out.print("Your tree is currently " + age + " years old. ");
                System.out.println("It has reached the height of " + height + " cm.");
            } else if (age % 5 == 0 && age % 20 != 0 || age % 100 == 0)
                System.out.println("Your tree is currently " + age + " years old, and it gets flowers, and it's "
                        + height + " cm.");

        } else {
            System.out.println("The tree is dead, and reached the age " + 11 + " with a height of " + height + "cm");
        }

    }

    void grow() {
        if (is_dead) {
            System.out.println("Your tree is already dead");
            return;
        }
        if (age < max_age) {
            age++;
            height += growth_rate;
            System.out.println("And your tree just grew a year older! It's " + age + " years old.");
        } else {
            System.out.println("Your tree is dead");
            is_dead = true;
        }
    }

}