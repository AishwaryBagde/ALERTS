package demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.hc.core5.http.nio.entity.NoopEntityConsumer;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        
 

            //         1. Launch Browser (Chrome) :ChromeDriver()
            // 1.2 Maximize Window :driver.windows().manage().maximize();
            // 1.5 Handle Sync issue using implicitlyWait() :driver.windows().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
            // 2. Load URL :https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
            Thread.sleep(3000);

            //3. Locate & Switch to the iframe Using Locator "Name":"iframeResult" / driver.switchTo().frame(frame);
            WebElement frame = driver.findElementByName("iframeResult");
            driver.switchTo().frame(frame);
            // 3. Click on Try it button Using Locator "XPath":"//button[contains(text(),'Try it')]" / click();
            WebElement tryItButton = driver.findElementByXPath("//button[contains(text(),'Try it')]");
            tryItButton.click();
            Thread.sleep(3000);
            // 4. Switch to the alert :driver.switchTo().alert();
            driver.switchTo().alert();
            Thread.sleep(1000);
            // 5. Get the text of the alert :driver.switchTo().alert().getText();
            driver.switchTo().alert().getText();
            Thread.sleep(1000);
            // 6. Enter the text in the alert :driver.switchTo().alert().sendKeys("Harry Potter");
            driver.switchTo().alert().sendKeys("Harry Potter");
            Thread.sleep(1000);
            // 7. Clickon ok  in the alert :driver.switchTo().alert().accept();
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            // 8. Locate the Text appeared and print it Using Locator "ID":"demo" / getText();
           WebElement text = driver.findElementById("demo");
           System.out.println("The text is "+ text.getText());

                }


}
