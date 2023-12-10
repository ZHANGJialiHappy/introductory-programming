public class Process {
    private static int processNum;
    private static String ab = "a";

    public Process() {
        processNum = processNum + 2;
        setAb();
    }

    public int getNum() {
        return processNum;
    }

    public static void resetNum() {
        processNum = 0;
    }

    public String getAb() {
        return ab;
    }

    public void setAb() {
        ab = ab + "a";
    }

}