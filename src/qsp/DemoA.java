package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
@Test
public void testA() {
		String path = "./Drivers/chromedriver.exe";
		String value = "webdriver.chrome.driver";
		System.setProperty(value, path);
		WebDriver driver = new ChromeDriver();
		driver.close();

}
}