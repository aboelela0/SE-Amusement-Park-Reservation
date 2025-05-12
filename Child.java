package group_7_online_amusement_park_reservation_system;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Child {
    private String childName;
    private int childID;
    private int age;

    private static final Set<Integer> generatedIds = new HashSet<>();
    private static final Random random = new Random();

    public Child(String childName, int age) {
        this.childName = childName;
        this.childID = generateUniqueRandomId(1, 999_999_999);
        this.age = age;
        // register in the global list
        Group_7_Online_Amusement_Park_Reservation_System.children.add(this);
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChildID(int childID) {
        this.childID = childID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChildName() {
        return childName;
    }

    public int getChildID() {
        return childID;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Child{" +
               "childName='" + childName + '\'' +
               ", childID=" + childID +
               ", age=" + age +
               '}';
    }

    /**
     * Generate a unique random ID between minId and maxId (inclusive).
     */
    public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }
}
