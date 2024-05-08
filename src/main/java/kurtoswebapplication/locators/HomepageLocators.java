package kurtoswebapplication.locators;

import org.openqa.selenium.By;

public class HomepageLocators
{
    public By resourcesText()
    {
        return By.xpath("//span[text()='Resources']");
    }
    public By whitePapersAndEBooksLinkText()
    {
        return By.xpath("//span[text()='Resources']/ancestor::div[@class='elementor-widget-wrap']//span[text()='White Papers & eBooks']");
    }

    public By title(String title)
    {
        return By.xpath("//h2[text()='"+title+"']");
    }

    public By ucitsWhitePaperText()
    {
        return By.linkText("UCITS White Paper");
    }

    public By acceptCookiesButton()
    {
        return By.xpath("//button[text()='Accept All Cookies']");
    }
    public By firstNameField()
    {
        return By.xpath("//input[@type='text']//parent::div[@class='form-field  first_name pd-text required    ']");
    }

    public By lastNameFiled()
    {
        return By.xpath("//input[@type='text']//parent::div[@class='form-field  last_name pd-text required    ']");
    }

    public By companyField()
    {
        return By.xpath("//input[@type='text']//parent::div[@class='form-field  company pd-text     ']");
    }

    public By industryField()
    {
        return By.xpath("//input[@type='text']//parent::div[@class='form-field  industry pd-text     ']");
    }
    public By sendMeACopyButton()
    {
        return By.xpath("//input[@value='Send me a copy']");
    }

    public By errorMsgField(String error)
    {
        return By.xpath("//p[text()='"+error+"']");
    }
}
