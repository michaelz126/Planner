import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Assignment {
    private String name;
    private String className;
    private LocalDate dueDate;
    private int priority; // 1 = High, 2 = Medium, 3 = Low
    private double grade; // -1 if not graded yet
    private boolean isMajor; // true if major assignment, false if minor assignment

    public Assignment(String name, LocalDate dueDate, int priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.grade = -1;
    }
}
