package Module_3_3_3;

/**
 * Created by Andrew on 13.11.2016.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(Course[] coursesTaken, String lastName) {
        super(coursesTaken, lastName);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    private long getSecretKey() {
        return secretKey;
    }

    private void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
