// Exercise 3.40 3.41
public class Tree {
    private Triangle leaves;
    private Square trunk;

    public Tree() {
        leaves = new Triangle();
        trunk = new Square();
        setup();
    }

    private void setup() {
        trunk.changeColor("black");
        // for (int i = 0; i < 4; i++) {
        // trunk.moveDown();
        // }
        // for (int i = 0; i < 6; i++) {
        // trunk.moveLeft();
        // }
        trunk.moveVertical(80);
        trunk.moveHorizontal(-120);
        trunk.changeSize(40);

        // What's the different of 1 and 2? And why 1 can't be showed?

        // 1. if I directly invoke makeVisible() of leaves and trunk, then new, the tree
        // can't be seen.

        leaves.makeVisible();
        trunk.makeVisible();

        // 2. if I invoke makeVisible(), then new instance, the tree can be showed. 
        // makeVisible();
    }

    // private void makeVisible() {
    // leaves.makeVisible();
    // trunk.makeVisible();

    // }

}
