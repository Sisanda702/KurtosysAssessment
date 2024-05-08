package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseClass
{
    protected WebDriver driver;

    public void setup()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
    }

    public void teardown()
    {
        if (driver != null){
            driver.quit();
        }
    }
}

