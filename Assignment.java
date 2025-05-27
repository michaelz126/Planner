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
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public String getDueDate() {
        return dueDate;
    }
    public boolean isMajor() {
        return isMajor;
    }
}
