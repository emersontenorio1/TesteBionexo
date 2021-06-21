package page;

import org.openqa.selenium.By;

import core.BasePage;

public class botoesPage extends BasePage {

	public void clicarNoBotao(String botao) {

		dsl.clicarBotao(botao);
	}

	public String obterMensagemOK() {

		return dsl.obterTexto(By.xpath("//*[@id='div1']/h5"));
	}
}
