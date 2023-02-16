package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com//billing//?ng=login//");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Bank & Cash")).click();
		driver.findElement(By.cssSelector("a[href$='https://techfios.com/billing/?ng=accounts/add/']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Fred");
		driver.findElement(By.id("description")).sendKeys("Saving");
		driver.findElement(By.cssSelector("input#balance")).sendKeys("1250");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("01234");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Dolores");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("501-545-4865");
		driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("bankofamerica.com");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}

//	@After
//	public void tearDown() {
//		driver.close();
//	}
}
