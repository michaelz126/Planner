import java.util.Scanner;
import java.util.ArrayList;
public class Planner {
    private ArrayList<Assignment> assignments;
    private ArrayList<Assignment> completedAssignments;

    public Planner(Assignment[] a) {
        for (Assignment assignment : a) {
            assignments.add(assignment);
        }
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
    public void viewAssignmentsDueInDays(int days) {
        for (Assignment a : assignments) {
            if ()
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

    public void viewMajorAssignmentsBySubject(String subject) {
    for (Assignment a : assignments) {
        if (a.isMajor() && a.getSubject().equalsIgnoreCase(subject)) {
            System.out.println(a);
        }
    }
}
    public void viewMajorAssignmentsByDate(String date) {
        for (Assignment a : assignments) {
            if (a.isMajor() && a.getDueDate().equals(date)) {
                System.out.println(a);
            }
        }
    }

    public void markAssignmentAsCompleted(String name) {
        for (Assignment assignment : assignments) {
            if (assignment.getName().equalsIgnoreCase(name)) {
                completedAssignments.add(assignment);
                assignments.remove(assignment);
                System.out.println("Marked " + name + " as completed.");
                return;
            }
        }
        System.out.println("Assignment not found.");
    }
    
}