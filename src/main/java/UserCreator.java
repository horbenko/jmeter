import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class UserCreator {

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
        Integer rand = RandomUtils.nextInt(10000, 99999);
        String emailPattern = "testmail+" + rand.toString() + "@gmail.com";
        return emailPattern;
    }

}
