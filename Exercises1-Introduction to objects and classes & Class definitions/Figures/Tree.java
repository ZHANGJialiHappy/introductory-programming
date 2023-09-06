// Exercise 3.40 3.41
public class Tree {
    private Triangle leaves;
    private Square trunk;

    public Tree() {
        leaves = new Triangle();
        trunk = new Square();
        setup();
    }

    public void setup() {
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
        leaves.makeVisible();
        trunk.makeVisible();
    }

}
