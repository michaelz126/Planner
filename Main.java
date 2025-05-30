import java.time.LocalDate; //import for date handling
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date: " + date.getMonth());

        Assignment[] schoolYear = {
            new Assignment("Math", "Algebra Worksheet", "2025-04-06", false),
            new Assignment("CSA", "Codingbat", "2025-03-06", false),
            new Assignment("Economics", "Project", "2025-04-21", true),
            new Assignment("English", "Reading Homework", "2025-05-23", false),
            new Assignment("Math", "Calculus Final", "2025-06-05", true),
            new Assignment("English", "Final Essay", "2025-06-02", true),
            new Assignment("Physics", "Final Exam", "2025-06-03", true),
            new Assignment("History", "Historical Essay", "2025-05-15", false),
            new Assignment("CSA", "Final Project", "2025-06-01", true),
            new Assignment("Chemistry", "Worksheet", "2025-04-16", false),
            new Assignment("Biology", "Lab Report", "2025-03-27", false),
            new Assignment("Art", "Painting Project", "2025-10-01", true),
            new Assignment("Music", "Composition", "2025-10-01", false),
            new Assignment("PE", "Fitness Log", "2025-10-01", false),
            new Assignment("Philosophy", "Essay", "2025-10-01", true),
            new Assignment("Psychology", "Research Paper", "2025-10-01", true),
            new Assignment("Sociology", "Group Project", "2025-10-01", true),
            new Assignment("Geography", "Map Project", "2025-10-01", false),
            new Assignment("Statistics", "Data Analysis", "2025-10-01", true),
            new Assignment("Economics", "Case Study", "2025-10-01", false),
            new Assignment("Political Science", "Debate Preparation", "2025-10-01", true),
            new Assignment("English", "Poetry Analysis", "2025-11-05", false),
            new Assignment("English", "Book Report", "2025-12-01", true),
            new Assignment("History", "World War II Presentation", "2025-11-15", true),
            new Assignment("History", "Civil Rights Essay", "2025-12-10", false),
            new Assignment("CSA", "Unit 7 Progress Check", "2025-11-20", false),
            new Assignment("CSA", "Final Exam Review", "2025-12-05", true),
            new Assignment("Math", "Trigonometry Quiz", "2025-10-15", false),
            new Assignment("Math", "Statistics Project", "2025-11-10", true),
            new Assignment("Math", "Geometry Homework", "2025-12-03", false),
            new Assignment("Chemistry", "Acids and Bases Lab", "2025-10-20", true),
            new Assignment("Chemistry", "Periodic Table Quiz", "2025-11-02", false),
            new Assignment("Chemistry", "Organic Chemistry Project", "2025-12-12", true),
            new Assignment("Physics", "Kinematics Worksheet", "2025-10-18", false),
            new Assignment("Physics", "Electricity Lab", "2025-11-08", true),
            new Assignment("Physics", "Thermodynamics Test", "2025-12-07", true)
        };
        Planner  = new Planner(schoolYear);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        p.viewAssignments();
        while (running) {
        
        System.out.println();
        System.out.println("You have " + assignments.length + " assignments due in your planner.");
        
        System.out.println("What would you like to do?");
        System.out.println("1. View assignments by subject");
        System.out.println("2. View assignments due in X days");
        System.out.println("3. View major assignments");
        System.out.println("4. View minor assignments");
        System.out.println("5. Mark an assignment as completed");
        System.out.println("6. Remove an assignment");
        System.out.println("7. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline 
        if (choice == 1) {
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            p.viewAssignmentsBySubject(subject);
        } else if (choice == 2) {

            System.out.println("Enter number of days from today:");
            int days = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            p.viewAssignmentsDueInDays(days);
            String dateInput = scanner.nextLine();

        } else if (choice == 3) {
            p.viewMajorAssignments();

        /* 
            boolean inMajorMenu = true;
            while (inMajorMenu) {
            System.out.println("\n1. View  by subject");
            System.out.println("2. View by date");
            System.out.println("3. Back to main menu");
            int majorChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (majorChoice == 1) {
                System.out.println("Enter subject:");
                String subject = scanner.nextLine();
                p.viewMajorAssignmentsBySubject(subject);
            } else if (majorChoice == 2) {
                System.out.println("Enter date (YYYY-MM-DD):");
                String dateInput = scanner.nextLine();
                p.viewMajorAssignmentsByDate(dateInput);
            } else if (majorChoice == 3) {
                inMajorMenu = false;
            } else {
                System.out.println("Invalid choice.");
                }
            }
            */
        } else if (choice == 4) {
            p.viewMinorAssignments();
        } else if (choice == 5) {
            /* 
            System.out.println("Enter assignment name to mark as completed:");
            String name = scanner.nextLine();
            Assignment completedAssignment = p.markAssignmentAsCompleted(name);
            if (completedAssignment != null) {
                p.addToCompleted(completedAssignment);
                System.out.println("Assignment marked as completed and added to completed list.");
            } else {
                System.out.println("Assignment not found.");
            }
                */
        } else if (choice == 6) {
            System.out.println("Enter assignment name to remove:");
            String name = scanner.nextLine();
            p.removeAssignment(name);
        } else if (choice == 7) {
            running = false;
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice.");
        }
    }
        scanner.close();
        System.out.println("Thank you for using the planner!");

    }
}