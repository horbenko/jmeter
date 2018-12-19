import java.util.Date;

public class User {
    private boolean isMale;
    private boolean isFemale;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public boolean isMale() {
        return isMale;
    }

    public void setIsMale(boolean male) {
        isMale = male;
        isFemale = !male;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setIsFemale(boolean female) {
        isFemale = female;
        isMale = !female;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "isMale=" + isMale +
                ", isFemale=" + isFemale +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
