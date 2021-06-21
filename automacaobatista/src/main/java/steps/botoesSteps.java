package steps;

import static core.DriverFactory.getDriver;

import org.junit.Assert;

import core.BasePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import page.botoesPage;

public class botoesSteps extends BasePage {

	private botoesPage page;

	@Dado("que estou na pagina de botões {string}")
	public void que_estou_na_pagina_de_botões(String string) {
		getDriver().get(string);
		page = new botoesPage();
	}

	@Dado("aciono o botão BUTTON")
	public void aciono_o_botão_BUTTON() {
		page.clicarNoBotao("teste");

	}

	@Então("confirmo o botão clicado {string}")
	public void confirmo_o_botão_clicado(String string) {

		Assert.assertEquals(string, page.obterMensagemOK());

	}

}