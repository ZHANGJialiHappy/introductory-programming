import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public void addTree(int growthRate) {
        Tree tree = new Tree(growthRate);
        trees.add(tree);
    }

    public String toString() {
        String result = "Forest(";
        for (Tree tree : trees) {
            result += tree.toString();
        }
        return result + ")";
    }

    public void growOneYear() {
        for (Tree tree : trees) {
            tree.growOneYear();
        }
    }

}
