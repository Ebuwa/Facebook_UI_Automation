package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;
    //import chromedriver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver ();
    //input project URL = facebook Login URL
        driver.get ("https://www.facebook.com/");
        //waiting globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage().window ().maximize ();
    //get page title
        System.out.println(driver.getTitle());
        //Locate email address field
        driver.findElement (By.id("email")).sendKeys("osarenrenebuwa@gmail.com");
        // Locate password field
        driver.findElement(By.id("pass")).sendKeys("Ebuwa_01");
        //Click on the Log In button
        driver.findElement (By.linkText ("Log In")).click();
        //wait
        Thread.sleep(10000);
        //close window
        driver.quit();

    }
    //initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();
    }

}
