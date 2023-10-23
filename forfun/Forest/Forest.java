import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees;

    public Forest() {
        trees = new ArrayList<>();
    }

    public void addTree(int growthRate) {
        trees.add(new Tree(growthRate));
    }

    public String toString() {
        String result = "Forest(";
        for (Tree tree : trees) {
            result += tree.toString();
        }
        result += ")";
        return result;
    }

    public void growOneYear() {
        for (Tree tree : trees) {
            tree.growOneYear();
        }
    }
}
