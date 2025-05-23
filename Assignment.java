import java.time.LocalDate;


class Assignment {
    private String name;
    private String subject;
    private String dueDate;
    private boolean isMajor;


    public Assignment(String s, String n, String d, boolean m) {
        name = n;
        subject = s;
        dueDate = d;
        isMajor = m;
    }

    public String toString() {
        String type = isMajor ? "MAJOR" : "MINOR";
        return "Assignment{" + name + 
                ", " + subject + 
                ", " + dueDate +
                ", " + type +
                '}';
    }
}
