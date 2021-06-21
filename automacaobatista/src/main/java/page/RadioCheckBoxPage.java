package page;

import org.openqa.selenium.By;

import core.BasePage;

public class RadioCheckBoxPage extends BasePage {

	public void selecaoRadio() {
		dsl.clicarRadio(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[1]/label"));

	}

	public void selecionarCheckBox() {

		dsl.clicarCheck(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[1]/label"));

	}

}
