import java.util.ArrayList;
import java.time.LocalDate;
public class Planner {
    private ArrayList<Assignment> toDoList = new ArrayList<>();
    private ArrayList<Assignment> completedAssignments = new ArrayList<>();

    public Planner(Assignment[] a) {
        for (Assignment assignment : a) {
            toDoList.add(assignment);
        }
    }

    public void addToCompletedList(Assignment[] a) { // Adds multiple assignments to the completed list for the setup
        for (Assignment assignment : a) {
            completedAssignments.add(assignment);
        }
    }
    
    public void viewAssignments() {

        for (Assignment assignment : toDoList) {
                try{
                    Thread.sleep(50);
                }catch(InterruptedException e){
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            System.out.println(assignment);
        }
    }

    public int getLength() { // Returns the length of the to-do list
        return toDoList.size();
    }

    public void viewAssignmentsBySubject(String subject) { //Option 1
        boolean found = false;
        for (Assignment assignment : toDoList) {
            if (assignment.getSubject().equalsIgnoreCase(subject)) {
            found = true;
            }
        }
        if (!found) {
            System.out.println("Subject not found");
        } else {
        System.out.println("\nAssignments for subject: " + subject);
        System.out.println("============================");
        for (Assignment assignment : toDoList) {
            if (assignment.getSubject().equalsIgnoreCase(subject)) 
                System.out.println(assignment);
            }
        }
    }

    public void viewAssignmentsDueInDays(int days) { //Option 2
        LocalDate today = LocalDate.now();
        for (Assignment a : toDoList) {
            LocalDate dueDate = LocalDate.parse(a.getDueDate());
            long daysBetween = today.toEpochDay() - dueDate.toEpochDay();
            if (daysBetween <= days && daysBetween >= 0) {
                System.out.println(a);
            }
        }
    }

    public void viewMajorAssignments() { //Option 3
        for (Assignment assignment : toDoList) {
            if (assignment.isMajor()) {
                System.out.println(assignment);
            }
        }
    }

    public void viewMinorAssignments() { //Option 4
        for (Assignment assignment : toDoList) {
            if (!assignment.isMajor()) {
                System.out.println(assignment);
            }
        }
    }

    public void viewCompletedAssignments() { //Option 5
        for (Assignment assignment : completedAssignments) {
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            System.out.println(assignment);
        }
    }


    public void markAssignmentAsCompleted(String name) { //Option 6
        for (Assignment assignment : toDoList) {
            if (assignment.getName().equalsIgnoreCase(name)) {
                completedAssignments.add(assignment);
                toDoList.remove(assignment);
                System.out.println(Colors.GREEN + "\nMarked " + name + " as completed." + Colors.RESET);
                return;
            }
        }
        System.out.println(Colors.BOLDRED + "\nASSIGNMENT NOT FOUND." + Colors.RESET);
    }


    public void viewLateAssignments() { //Option 7
        int count = 0;
        LocalDate today = LocalDate.now();
        for (Assignment assignment : toDoList) {
            LocalDate dueDate = LocalDate.parse(assignment.getDueDate());
            if (dueDate.isBefore(today)) {
                count++;
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
                System.out.println(assignment);
            }
        }
        System.out.println(Colors.ORANGE + "\nYou have "  + count + " late assignments due." + Colors.RESET);
    } 




}
