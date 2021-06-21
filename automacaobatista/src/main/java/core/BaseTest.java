package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
		
	public void finaliza(String test) throws IOException{
		
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target"+File.separator+"screenshot"+File.separator+ test
		+File.separator+ test +".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killdriver();
		}
		
	}

}
