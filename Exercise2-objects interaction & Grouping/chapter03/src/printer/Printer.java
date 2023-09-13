package printer;

public class Printer {
    private String filename;
    private boolean doubleSided;

    public Printer(String filename, boolean doubleSided) {
        this.filename = filename;
        this.doubleSided = doubleSided;

    }

    public void print() {
        System.out.println("Name: " + this.filename);
        System.out.println("Is it double sided? " + this.doubleSided);

    }

    public int getStatus(int delay) {
        return delay;
    }

}
