public class SpecProcess extends Process {
    public int parentId;

    public SpecProcess(int pid) {
        parentId = pid;
    }

    public static void main(String[] args) {
        Process.resetNum();

        // (1)
        Process proc1 = new Process();

        for (int i = 0; i < 3; i++)
            new SpecProcess(2);

        System.out.println(proc1.getNum());
        System.out.println(proc1.getAb());

    }

}