package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;

public class LinksPage extends BasePage {

	public void clicarLink(String nomeLink) {
		dsl.clicarLink(nomeLink);

	}

	public String confirmarLink() {

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div/h5")));
		return dsl.obterTexto(By.xpath("/html/body/div[2]/div[2]/div[2]/div/h5"));
	}

	public String confirmarLinkBad() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/h5")));
		return dsl.obterTexto(By.xpath("/html/body/div[2]/div[2]/div[2]/h5"));
	}

}
