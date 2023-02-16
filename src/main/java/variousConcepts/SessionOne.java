package variousConcepts;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionOne {
	WebDriver driver;
	By bank_and_cash_field = By.xpath("//span[text()='Bank & Cash']");
	By new_account_field = By.xpath("//a[text()='New Account']");

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com//billing//?ng=login//");
		driver.manage().window().maximize();
	}
    @Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(bank_and_cash_field).click();
		driver.findElement(new_account_field).click();
	}


	public void tearDown() {
		driver.close();
	}
}
