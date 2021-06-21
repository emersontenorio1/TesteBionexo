package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		
		DriverManagerType config = null;
		
		switch(Propriedades.browsers) {
		
			case FIREFOX: config = DriverManagerType.FIREFOX;break;
			case CHROME: config = DriverManagerType.CHROME;break;
		
			
		}
		
		
		WebDriverManager.getInstance(config).setup();
		
		if(driver ==null) {
			
		switch(Propriedades.browsers) {		
			case FIREFOX: driver = new FirefoxDriver();break;
			case CHROME: driver = new ChromeDriver();break;
					
		}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		}
		return driver;
		}
	
	public static void killdriver() {
		if(driver != null) {
			driver.quit();
			driver=null;
		}
		
	}
	
}

