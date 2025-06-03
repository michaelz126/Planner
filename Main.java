import java.time.LocalDate; //import for date handling
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        

        Assignment[] schoolYear = {
            new Assignment("Math", "Algebra Worksheet", "2025-04-06", false),
            new Assignment("CSA", "Codingbat 150 Exercises", "2025-03-05", false),
            new Assignment("CSA", "Codingbat 160 Exercises", "2025-03-13", false),
            new Assignment("CSA", "Codingbat 170 Exercises", "2025-03-20", false),
            new Assignment("CSA", "Codingbat 180 Exercises", "2025-03-28", false),
            new Assignment("Economics", "Project", "2025-04-21", true),
            new Assignment("English", "Reading Homework", "2025-05-23", false),
            new Assignment("Math", "Calculus Final", "2025-06-05", true),
            new Assignment("English", "Final Essay", "2025-06-02", true),
            new Assignment("Physics", "Physics Final Exam", "2025-06-03", true),
            new Assignment("History", "Historical Essay", "2025-05-15", false),
            new Assignment("CSA", "Final Project", "2025-06-01", true),
            new Assignment("Chemistry", "Worksheet", "2025-04-16", false),
            new Assignment("Biology", "Lab Report", "2025-03-27", false),
            new Assignment("Art", "Painting Project", "2025-06-10", true),
            new Assignment("Music", "Composition", "2025-06-05", false),
            new Assignment("PE", "Fitness Log", "2025-06-03", false),
            new Assignment("Philosophy", "Essay", "2025-05-27", true),
            new Assignment("Psychology", "Research Paper", "2025-05-23", true),
            new Assignment("Sociology", "Group Project", "2025-06-10", true),
            new Assignment("Geography", "Map Project", "2025-05-07", false),
            new Assignment("Statistics", "Data Analysis", "2025-05-13", true),
            new Assignment("Economics", "Case Study", "2025-02-01", false),
            new Assignment("Political Science", "Debate Preparation", "2025-10-01", true),
            new Assignment("English", "Poetry Analysis", "2025-04-05", false),
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

        Planner newSchoolYear = new Planner(schoolYear);

        Assignment[] completedAssignments = {
            new Assignment("CSA", "Codingbat 130 Exercises", "2025-02-25", false),
            new Assignment("CSA", "Codingbat 140 Exercises", "2025-02-10", false),
            new Assignment("Math", "Precalculus Quiz", "2025-01-15", false),
            new Assignment("English", "Short Story Analysis", "2025-02-10", false),
            new Assignment("History", "Ancient Civilizations Essay", "2025-03-05", true),
            new Assignment("Chemistry", "Stoichiometry Lab", "2025-03-18", false),
            new Assignment("Physics", "Projectile Motion Worksheet", "2025-04-01", false),
            new Assignment("Biology", "Genetics Project", "2025-04-15", true),
            new Assignment("Economics", "Supply and Demand Quiz", "2025-02-22", false),
            new Assignment("Math", "Statistics Homework", "2025-03-12", false),
            new Assignment("English", "Poetry Assignment", "2025-04-04", false),
            new Assignment("CSA", "Array Practice", "2025-03-25", false)
        };
        newSchoolYear.addToCompletedList(completedAssignments);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        newSchoolYear.viewAssignments();
        while (running) {
        
        LocalDate date = LocalDate.now();
        System.out.println("\nToday's date is " + date.getMonth() + "-" + date.getDayOfMonth() + "-" + date.getYear());
        System.out.println();
        System.out.println("You have " + Colors.BOLD + Colors.GREEN + newSchoolYear.getLength() + Colors.RESET + " assignments due in your planner.");
        try{
            System.out.println("What would you like to do?");
            Thread.sleep(100);
            System.out.println("1. View assignments by subject");
            Thread.sleep(100);
            System.out.println("2. View assignments due in X days");
            Thread.sleep(100);
            System.out.println("3. View major assignments");
            Thread.sleep(100);
            System.out.println("4. View minor assignments");
            Thread.sleep(100);
            System.out.println("5. View completed assignments");
            Thread.sleep(100);
            System.out.println("6. Mark an assignment as completed");
            Thread.sleep(100);
            System.out.println("7. View late assignments");
            Thread.sleep(100);
            System.out.println("8. View all assignments");
            Thread.sleep(100);
            System.out.println("9. Exit");
        }catch(InterruptedException e){
            System.out.println("An error occurred while waiting: " + e.getMessage());
        }
        
        int choice;
        
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            scanner.nextLine(); 
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
            continue; // Restart the loop
        }

        if (choice == 1) {
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            newSchoolYear.viewAssignmentsBySubject(subject);
            
        } else if (choice == 2) {
            System.out.println("Enter number of days from today:");
            int days = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Assignments due in the next " + days + " days:");
            System.out.println("============================");
            newSchoolYear.viewAssignmentsDueInDays(days);

        } else if (choice == 3) {
            System.out.println("Showing major assignments...");
            System.out.println("============================");
            newSchoolYear.viewMajorAssignments();
        } else if (choice == 4) {
            System.out.println("Showing minor assignments...");
            System.out.println("============================");
            newSchoolYear.viewMinorAssignments();
        } else if (choice == 5) {
            System.out.println("Completed assignments list: ");
            System.out.println("============================");
            newSchoolYear.viewCompletedAssignments();
        } else if (choice == 6) {
            System.out.println("Enter the name of the assignment to mark as completed:");
            String assignmentName = scanner.nextLine();
            newSchoolYear.markAssignmentAsCompleted(assignmentName);
        } else if (choice == 7) {
            System.out.println("Showing late assignments...");
            System.out.println("============================");
            newSchoolYear.viewLateAssignments();
        } else if (choice == 8) {
            System.out.println("Showing all assignments...");
            System.out.println("============================");
            newSchoolYear.viewAssignments();
        } else if (choice == 9) {
            running = false;
            System.out.println("Exiting...");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("An error occurred while waiting: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
        scanner.close();
        System.out.println("Thank you for using the planner!");

    }
}