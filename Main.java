import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date.getMonth());
        Planner p = new Planner();
        Assignment[] assignments = {
            new Assignment("Math", "Algebra Worksheet", "2023-10-01", false),
            new Assignment("CSA", "Codingbat", "2023-10-01", false),
            new Assignment("Economics", "Project", "2023-10-01", true),
            new Assignment("English", "Reading Homework", "2023-10-01", false),
            new Assignment("Math", "Calculus Final", "2023-10-01", true),
            new Assignment("English", "Final Essay", "2023-10-01", true),
            new Assignment("Physics", "Final Exam", "2023-10-01", true),
            new Assignment("History", "Historical Essay", "2023-10-01", false),
            new Assignment("CS", "Final Project", "2025-6-01", true),
            new Assignment("Chemistry", "Worksheet", "2023-10-01", false),
            new Assignment("Biology", "Lab Report", "2023-10-01", false),
            new Assignment("Art", "Painting Project", "2023-10-01", true),
            new Assignment("Music", "Composition", "2023-10-01", false),
            new Assignment("PE", "Fitness Log", "2023-10-01", false),
            new Assignment("Philosophy", "Essay", "2023-10-01", true),
            new Assignment("Psychology", "Research Paper", "2023-10-01", true),
            new Assignment("Sociology", "Group Project", "2023-10-01", true),
            new Assignment("Geography", "Map Project", "2023-10-01", false),
            new Assignment("Statistics", "Data Analysis", "2023-10-01", true),
            new Assignment("Economics", "Case Study", "2023-10-01", false),
            new Assignment("Political Science", "Debate Preparation", "2023-10-01", true)
        };
        for (Assignment assignment : assignments) {
            p.addAssignment(assignment);
        }
        p.viewAssignments();

        System.out.println("You have " + p.assignments.size() + " assignments in your planner.");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. View assignments by subject");
        System.out.println("2. View assignments by date");
        System.out.println("3. View major assignments");
        System.out.println("4. View minor assignments");
        System.out.println("5. Mark an assignment as completed");
        System.out.println("6. Remove an assignment");
        System.out.println("7. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline 
        if (choice == 1) {
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            p.viewAssignmentsBySubject(subject);
        } else if (choice == 2) {
            System.out.println("Enter date (YYYY-MM-DD):");
            String dateInput = scanner.nextLine();
            p.viewAssignmentsByDate(dateInput);
        } else if (choice == 3) {
            p.viewMajorAssignments();
        } else if (choice == 4) {
            p.viewMinorAssignments();
        } else if (choice == 5) {
            System.out.println("Enter assignment name to mark as completed:");
            String name = scanner.nextLine();
            p.removeAssignment(name);
        } else if (choice == 6) {
            System.out.println("Enter assignment name to remove:");
            String name = scanner.nextLine();
            p.removeAssignment(name);
        } else if (choice == 7) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
        System.out.println("Thank you for using the planner!");

    }
}