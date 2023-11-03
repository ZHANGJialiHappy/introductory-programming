public class Main {
    public static void main(String[] args) {
        Lab a = new Lab("music", 20);
        a.addEquipment("piano");
        a.addEquipment("piano1");

        Student jiali = new Student("jiali");
        System.out.println(a.bookEquipment(jiali, "piano"));
        System.out.println(a.bookEquipment(jiali, "piano1"));

        System.out.println(a.availableEquipment);
        System.out.println(a.studentEquipment);

        a.returnEquipment(jiali);
        System.out.println(a.availableEquipment);
        System.out.println(a.studentEquipment);

    }

}
