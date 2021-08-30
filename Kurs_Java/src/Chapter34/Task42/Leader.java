package Chapter34.Task42;

public class Leader extends Engineer {
    private String statusWork;

    public Leader(String name, String statusWork) {
        super(name);
        this.statusWork = statusWork;
    }

    @Override
    public String GetInfo() {
        return "Name: " + name + ";\n" +
                "Status work: " + statusWork + ";\n" +
                "He is a leader (main software engineer).";
    }
}
