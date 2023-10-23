public class Main {
    public static void main(String[] args) {
        Forest jiali = new Forest();
        jiali.addTree(4);
        jiali.addTree(60000);
        System.err.println(jiali);
        jiali.growOneYear();
        System.err.println(jiali);

    }
}
