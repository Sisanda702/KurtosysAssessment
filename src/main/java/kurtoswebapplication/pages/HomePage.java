package kurtoswebapplication.pages;

import kurtoswebapplication.locators.HomepageLocators;
import kurtoswebapplication.models.HomepageModel;
import kurtoswebapplication.utility.BaseClass;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass
{
    HomepageLocators homepageLocators = new HomepageLocators();

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void navigate(){
        navigateTo("https://www.kurtosys.com/");
    }

    public void scrollToResources()
    {
        scrollToElement(homepageLocators.resourcesText());
    }

    public void clickWhitePapersAndEBooks()
    {
        click(homepageLocators.whitePapersAndEBooksLinkText());
    }

    public void clickUCITSWhitePaper()
    {
        click(homepageLocators.ucitsWhitePaperText());
    }

    public String validateTitle(HomepageModel homepageModel)
    {
        return getText(homepageLocators.title(homepageModel.getTitle()));
    }

    public void fillInDetails(HomepageModel homepageModel)
    {
        waitForPageToLoad(5);
        click(homepageLocators.acceptCookiesButton());
        waitForPageToLoad(10);
        click(homepageLocators.firstNameField());
        waitForPageToLoad(10);
        enterText(homepageLocators.firstNameField(),homepageModel.getFirstName() );
        enterText(homepageLocators.lastNameFiled(), homepageModel.getLastName());
        enterText(homepageLocators.companyField(), homepageModel.getCompany());
        enterText(homepageLocators.industryField(), homepageModel.getIndustry());
        click(homepageLocators.sendMeACopyButton());
    }

    public String validateErrorMsg(HomepageModel homepageModel)
    {
        return getText(homepageLocators.errorMsgField(homepageModel.getErrorMessage()));
    }
}
