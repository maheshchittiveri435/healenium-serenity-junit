package starter.actions.drivers;

import com.epam.healenium.SelfHealingDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class CustomDriver extends PageObject {
    SelfHealingDriver driver ;
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    String browser = variables.getProperty("browser");
    boolean remoteExecution = Boolean.parseBoolean(variables.getProperty("remote"));
    public WebDriver setCustomWebdriver() throws MalformedURLException {
        if(remoteExecution){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
//            capabilities.setCapability("enableVNC", true);
            RemoteWebDriver delegate = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                    capabilities
            );
            this.driver = SelfHealingDriver.create(delegate);
        } else{
            this.driver = SelfHealingDriver.create(convertBrowserToDriver(browser));
        }
        Serenity.getWebdriverManager().setCurrentDriver(driver);
        return Serenity.getWebdriverManager().getWebdriver();
    }

    public WebDriver convertBrowserToDriver(String browser){
        if(browser.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if(browser.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else return new ChromeDriver();
    }

}
