import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class DriverCreator {

    public WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("prefs", "--disable-notifications");
        chromeOptions.addArguments("start-maximized");
        System.setProperty(
                "webdriver.chrome.driver",
                getResource("chromedriver.exe"));
        return new ChromeDriver(chromeOptions);
    }

    /**
     * @param resource The name of the resource
     * @return Path to resource
     */
    private String getResource(String resource) {
        try {
            return Paths.get(DriverCreator.class.getResource(resource).toURI()).toFile().getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return resource;
    }
}
