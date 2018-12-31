import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

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

    public static class UserCreator {

        public User createUser() {
            User user = new User();
            user.setIsMale(RandomUtils.nextBoolean());
            user.setFirstName(RandomStringUtils.randomAlphabetic(4, 8));
            user.setLastName(RandomStringUtils.randomAlphabetic(6, 10));
            user.setPassword(RandomStringUtils.randomAlphanumeric(8));
            user.setEmail(getEmailPattern());
            return user;
        }

        private String getEmailPattern() {
            Integer rand = RandomUtils.nextInt(0, 99999);
            return "testmail+" + rand.toString() + "@gmail.com";
        }
    }

}
