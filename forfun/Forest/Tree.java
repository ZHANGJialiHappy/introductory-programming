public class Tree {
    private int age;
    private double height;
    private double growthRate;

    public Tree(double growthRate) {
        height = 0.12;
        age = 1;
        this.growthRate = growthRate;
    }

    public String toString() {
        return "Tree(age = " + this.age + ", height = " + this.height + ")";
    }

    public int getAge() {
        return age;
    }

    public void growOneYear() {
        age += 1;
        if (height * (1 + growthRate / 100) <= 14) {
            height += height * (1 + growthRate / 100);
        } else {
            height = 14;
        }
    }
}
