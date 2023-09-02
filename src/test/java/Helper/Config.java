package Helper;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	public static void confChrome() {
		System.setProperty("WebDriver.chrome.driver", "c:/chromedriver.exe");
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

}
