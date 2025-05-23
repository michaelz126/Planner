import java.time.LocalDate;
import java.util.ArrayList;
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
            new Assignment("Chemistry", "Worksheet", "2023-10-01", false)
        };
        for (Assignment assignment : assignments) {
            p.addAssignment(assignment);
        }
        p.viewAssignments();
        
    }
}