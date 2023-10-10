import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<Student> myList;

    public ClassRoom() {
        myList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        myList.add(student);
    }

    public void printOut() {
        for (Object st : myList) {
            System.out.println(st.toString());
        }
    }

}
