public class Main {
    public static void main(String[] args) {
        /*
         * Write your code below. If you are unsure as to what some of the questions
         * mean, please do not hesitate to as us.
         */
        MusicOrganizer jiali = new MusicOrganizer();
        jiali.addFile("a");
        jiali.addFile("b");
        jiali.addFile("c");
        jiali.addFile("d");
        jiali.addFile("e");
        jiali.addFile("f");
        jiali.addFile("g");
        jiali.addFile("h");
        jiali.addFile("i");
        jiali.addFile("ja");
        jiali.addFile("j");

        // jiali.listFile(0);
        // jiali.listFile(1);
        // System.out.println(jiali.getNumberOfFiles());
        // jiali.removeFile(0);
        // jiali.listFile(0);
        // System.out.println(jiali.items());
        // jiali.dates();
        // jiali.listFile(2);
        // System.out.println(jiali.getIndex("g"));
        // jiali.removeFile(0);
        // jiali.removeFile(9);
        // jiali.getIndex("g");
        // jiali.checkIndex(16);
        // System.out.println(jiali.validIndex(11));
        jiali.removeFile(10);
        jiali.listFile(9);
    }
}
