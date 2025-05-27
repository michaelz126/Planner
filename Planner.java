import java.util.Scanner;
import java.util.ArrayList;
public class Planner {
    private ArrayList<Assignment> assignments;
    private Scanner scanner;

    public Planner() {
        assignments = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addAssignment(Assignment a) {
        assignments.add(a);
    }
    
    public void viewAssignments() {
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
        }
    }

    public void viewAssignmentsBySubject(String subject) {
        for (Assignment assignment : assignments) {
            if (assignment.getSubject().equalsIgnoreCase(subject)) {
                System.out.println(assignment);
            }
        }
    }
    public void viewAssignmentsByDate(String date) {
        for (Assignment assignment : assignments) {
            if (assignment.getDueDate().equals(date)) {
                System.out.println(assignment);
            }
        }
    }
    public void viewMajorAssignments() {
        for (Assignment assignment : assignments) {
            if (assignment.isMajor()) {
                System.out.println(assignment);
            }
        }
    }
    public void viewMinorAssignments() {
        for (Assignment assignment : assignments) {
            if (!assignment.isMajor()) {
                System.out.println(assignment);
            }
        }
    }
    public void removeAssignment(String name) {
        assignments.removeIf(assignment -> assignment.getName().equalsIgnoreCase(name));
    }

    
}