package steps;

import static core.DriverFactory.getDriver;

import org.junit.Assert;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import page.DropDownPage;

public class DropDownSteps extends BaseTest {

	private DropDownPage page;
	

	@Dado("que estou na pagina de Dropdown e Select {string}")
	public void que_estou_na_pagina_de_dropdown_e_select(String string) {
		getDriver().get(string);
		page = new DropDownPage();
	}

	@Dado("seleciono a opção inbox")
	public void seleciono_a_opção_inbox() throws InterruptedException {
		page.selecionarDrop();
		
	}

	@Então("confirmo a opção selecionada {string}")
	public void confirmo_a_opção_selecionada(String string) {
		
		Assert.assertEquals(string, page.confirmarSelecao());
	
	}
	

}
