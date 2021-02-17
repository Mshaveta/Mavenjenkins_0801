package Eventhandling;

 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleDemo {
	WebDriver driver;

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/directory/people/");

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			String wind = itr.next();
			driver.switchTo().window(wind);
			System.out.println("getTitle-" + driver.getTitle());
		}

	}

	@Test
	public void openNewtabUsingRobot() throws AWTException  {
		// Launch the first URL
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

		// Use robot class to press Ctrl+t keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

		String parentWind = driver.getWindowHandle();
		System.out.println("Parent Window-" + parentWind);

		// Switch focus to new tab
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			String wind = itr.next();

			driver.switchTo().window(wind);
			System.out.println("getTitle-" + driver.getTitle());
		}

		// Launch URL in the new tab
		// driver.get("http://google.com");
	}
}
