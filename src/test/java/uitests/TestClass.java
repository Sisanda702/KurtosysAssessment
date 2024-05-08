package uitests;

import kurtoswebapplication.application.KurtosysWebApplication;
import kurtoswebapplication.models.HomepageModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClass extends BaseClass
{
    @BeforeEach
    public void setUp()
    {
        setup();
        KurtosysWebApplication app = new KurtosysWebApplication(driver);
        app.homePage.navigate();
    }

    @Test
    public void ResourcesTest()
    {
        KurtosysWebApplication app = new KurtosysWebApplication(driver);
        HomepageModel homepageModel = new HomepageModel("White Papers","Jane", "Doe", "IDZ", "Information Technology",
                "This field is required.");
        app.homePage.scrollToResources();
        app.homePage.clickWhitePapersAndEBooks();
        //Assertions.assertEquals(app.homePage.validateTitle(homepageModel), "White Papers");

        app.homePage.clickUCITSWhitePaper();
        app.homePage.fillInDetails(homepageModel);
        app.homePage.takeScreenshot(driver, "screenshot.png");
        //Assertions.assertEquals(app.homePage.validateErrorMsg(homepageModel), "This field is required.");
    }

    @AfterEach
    public void tearDown()
    {
        teardown();
    }
}

