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


}