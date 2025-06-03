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
        String type = "";
        if (isMajor) type = Colors.RED + "MAJOR";
        else type = Colors.BLUE + "MINOR";
        return Colors.GREEN + "Assignment{" + Colors.RESET + subject + ", " + name + ", " + dueDate + ", " + type + Colors.GREEN + "}" + Colors.RESET;
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

