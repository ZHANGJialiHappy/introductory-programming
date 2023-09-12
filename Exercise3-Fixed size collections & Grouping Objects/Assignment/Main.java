public class Main {
    public static void main(String[] args) {
        Tree jiali = new Tree(100000000);
        System.out.println(jiali.toString());
        jiali.growOneYear();
        System.out.println(jiali.toString());
        jiali.growOneYear();
        System.out.println(jiali.toString());

        Forest jialis = new Forest();
        jialis.addTree(5);
        jialis.addTree(10);
        jialis.addTree(100000000);

        System.out.println(jialis.toString());
        jialis.growOneYear();
        System.out.println(jialis.toString());

    }

}
