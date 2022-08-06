package hw13_runUrl_by_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ecmc.edu/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void urlTest() throws InterruptedException {
		driver.get("https://www.ecmc.edu/");
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
