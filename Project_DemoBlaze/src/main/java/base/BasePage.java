package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	private WebDriver driver;

	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}