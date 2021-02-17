package Eventhandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpennewTabWind {
	WebDriver driver ;
	@Test
	public void openNewWindow() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
	}
}
