package jenkins.newproject_jk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	@Test
	private void browserLaunch() {
		{
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			
			driver.get("https://www.oyorooms.com/");
		}

	}

	
}
