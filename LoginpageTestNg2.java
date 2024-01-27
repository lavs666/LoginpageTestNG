import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class LoginpageTestNg2 {
    @Test
    public void logintest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iamtr\\Downloads\\chromedriver-win32-v2\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulnxttrendz.ccbp.tech/login");
        WebElement usernameel=driver.findElement(By.id("username"));
        usernameel.sendKeys("rahul");
        WebElement passwordel= driver.findElement(By.id("password"));
        passwordel.sendKeys("rahul@2021");
        WebElement submitb=driver.findElement(By.className("login-button"));
        submitb.submit();
        String expectedUrl="https://rahulnxttrendz.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl=driver.getCurrentUrl();

    }


}
