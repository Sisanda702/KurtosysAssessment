package kurtoswebapplication.application;

import kurtoswebapplication.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class KurtosysWebApplication
{
    public HomePage homePage;

    public KurtosysWebApplication(WebDriver driver)
    {
        homePage = new HomePage(driver);
    }
}
