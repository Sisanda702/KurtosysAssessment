package kurtoswebapplication.utility;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public  abstract class BaseClass
{
    protected WebDriver driver;

    public BaseClass(WebDriver driver)
    {
        this.driver = driver;
    }

    public void logError(String message)
    {
        System.err.println("ERROR" + message);
    }

    public void navigateTo(String url)
    {
        try
        {
            this.driver.navigate().to(url);
        } catch (Exception e)
        {
            logError("Failed to navigate to: " + url);
        }
    }

    public void click(By by)
    {
        try
        {
            WebElement button = this.driver.findElement(by);
            button.click();
        } catch (Exception e)
        {
            logError("Failed to click button" + by);
        }
    }

    public void enterText(By by, String text)
    {
        try
        {
            WebElement inputField = this.driver.findElement(by);
            inputField.sendKeys(text);
        } catch (Exception e)
        {
            logError("Failed to enter text in: " + by);
        }
    }

    public void takeScreenshot(WebDriver driver, String fileName)
    {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileName);

        try {
            org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }

    public void scrollToElement(By by)
    {
        try
        {
            WebElement element = this.driver.findElement(by);
            ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e)
        {
            logError("Failed to scroll to element: " + by);
        }
    }

    public void waitForPageToLoad(int timeoutInSeconds)
    {
        try
        {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;

            for (int i = 0; i < timeoutInSeconds; i++)
            {
                if (jsExecutor.executeScript("return document.readyState").equals("complete")) ;
                break;
            }
            Thread.sleep((1000));  // Wait for 1 second
        } catch (Exception e)
        {
            logError("Failed to wait for the page to load");
        }
    }

    public String getText(By by)
    {
        try
        {
            WebElement element = this.driver.findElement(by);
            return element.getText();
        } catch (Exception e)
        {
            logError("Failed to get text of element: " + by);
            return "";
        }
    }
}
