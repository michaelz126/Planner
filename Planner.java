import java.util.Scanner;
import java.util.ArrayList;
public class Planner {
    private ArrayList<Assignment> assignments;
    private Scanner scanner;

    public Planner() {
        assignments = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addAssignment() {
        System.out.print("Enter assignment name: ");
        String name = scanner.nextLine();
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        System.out.print("Is this a major assignment? (true/false): ");
        boolean isMajor = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline
        assignments.add(new Assignment(className, name, dueDate, isMajor));
    }

    public void addAssignment(String className, String name, String dueDate, boolean isMajor) {
        assignments.add(new Assignment(className, name, dueDate, isMajor));
    }
    
    public void viewAssignments() {
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
        }
    }
}