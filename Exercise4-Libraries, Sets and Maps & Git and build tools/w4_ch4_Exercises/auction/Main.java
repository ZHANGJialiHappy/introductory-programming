public class Main {
    public static void main(String[] args) {
        // write you code here
        Auction pic = new Auction();
        pic.enterLot("good pic");
        System.out.println(".........");

        pic.showLots();
        System.out.println(".........");
        pic.makeABid(1, new Person("jiali"), 100003989);
        pic.makeABid(1, new Person("jiali2"), 1000040000);
        System.out.println(".........");

        pic.enterLot("good pic2");
        System.out.println(".........");

        pic.showLots();
        System.out.println(".........");

        pic.close();
    }
}