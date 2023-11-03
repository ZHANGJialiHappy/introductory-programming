import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab {
    private String name;
    private int capacity;
    public Set<String> availableEquipment;
    public Map<Student, Set<String>> studentEquipment;

    public Lab(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        availableEquipment = new HashSet<>();
        studentEquipment = new HashMap<>();
    }

    public void addEquipment(String equipment) {
        availableEquipment.add(equipment);
    }

    public boolean bookEquipment(Student student, String equipmentName) {
        if (!availableEquipment.contains(equipmentName)) {
            return false;
        }
        if (studentEquipment.containsKey(student)) {
            studentEquipment.get(student).add(equipmentName);
        } else {
            Set<String> equipment = new HashSet<>();
            equipment.add(equipmentName);
            studentEquipment.put(student, equipment);
        }
        availableEquipment.remove(equipmentName);
        return true;
    }

    public void returnEquipment(Student student) {
        Set<String> equipments = studentEquipment.get(student);
        for (String equipment : equipments) {
            availableEquipment.add(equipment);
        }
        studentEquipment.remove(student);
    }

}