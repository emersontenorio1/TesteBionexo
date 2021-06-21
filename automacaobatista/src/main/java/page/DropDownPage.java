package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;

public class DropDownPage extends BasePage {

	public void selecionarDrop() throws InterruptedException {
		dsl.clicar(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));

		dsl.clicar(By.id("dropdown1"));

	}
	
	public String confirmarSelecao() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("div1")));
		return dsl.obterTexto(By.id("div1"));
		
		
	}

	
}
