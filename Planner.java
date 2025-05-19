import java.util.Scanner;
import java.util.ArrayList;
public class Planner {
    private ArrayList<Assignment> assignments;
    private Scanner scanner;

        public void run() {
        while (true) {
            System.out.println("\nPlanner Menu:");
            System.out.println("1. Add Assignment");
            System.out.println("2. Set Assignment Grade");
            System.out.println("3. List All Assignments");
            System.out.println("4. List Due Assignments");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addAssignment();
                case 2 -> setAssignmentGrade();
                case 3 -> listAssignments();
                case 4 -> listDueAssignments();
                case 5 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }
    private void addAssignment() {
        System.out.print("Enter assignment name: ");
        String name = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        System.out.print("Enter total points: ");
        int totalPoints = Integer.parseInt(scanner.nextLine());
        assignments.add(new Assignment(name, dueDate, totalPoints));
        System.out.println("Assignment added.");
    }

    
}