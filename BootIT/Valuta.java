class Valuta {
    static void dkk2eur(double dkk) {
        double eur = dkk / 7.45;
        System.out.println(dkk + " kr is " + String.format("%.2f", eur) + " euro.");
        System.out.print("I have ");
        System.out.format("%.2f", eur);
        System.out.println(" euro");
    }

    public static void main(String[] args) {
        String text = "hi";
        int eur = 100;
        double dkk = eur * 7.45;
        System.out.println(eur + " euro corresponds to " + dkk
                + "kr, and tomorrow it can be "
                + (eur * 8) + " dkk.");
        System.out.print("a");
        System.out.print("b");
        System.out.println("c");
        System.out.println(text);
        dkk2eur(100);

    }
}