####TASK 2#####################

package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginApp {
	@Test
public void newLogin() throws InterruptedException { 
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashank\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");

ChromeOptions opt = new ChromeOptions();
      opt.addArguments("−−lang=en");
      WebDriver driver = new ChromeDriver(opt);
driver.get("https://hotel.testplanisphere.dev/ja/login.html");
driver.findElement(By.id("email")).sendKeys("sakura@example.com");
driver.findElement(By.id("password")).sendKeys("pass1234");
driver.findElement(By.id("login-button")).click();


String actualUrl="https://hotel.testplanisphere.dev/ja/login.html";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(actualUrl, expectedUrl);
driver.quit();
}
}
