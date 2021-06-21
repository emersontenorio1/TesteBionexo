package steps;

import static core.DriverFactory.getDriver;

import org.junit.Assert;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import page.InputsTextFildsPage;

public class InputsTextFildsSteps extends BaseTest {
	
	private InputsTextFildsPage page;
	
	@Dado("que estou na pagina de Inputs, TextField e TextArea {string}")
	public void que_estou_na_pagina_de_inputs_text_field_e_text_area(String string) {
		getDriver().get(string);
		page = new InputsTextFildsPage();
	}

	@Dado("preencho as informações {string}, {string},{string}, {string}, {string}")
	public void preencho_as_informações(String string, String string2, String string3, String string4, String string5) {
	 
		page.setNome(string);
		page.setSobrenome(string2);
		page.setPassword(string3);
		page.setEmail(string4);
		page.setText(string5);
		
	   
	}

	@Então("confirmo todas as informações {string}, {string}, {string}, {string}, {string}")
	public void confirmo_todas_as_informações(String string, String string2, String string3, String string4, String string5) {
				
		Assert.assertEquals(string, page.obterTextNome());
		Assert.assertEquals(string2, page.obterTextLastname());
		Assert.assertEquals(string3, page.obterPassword());
		Assert.assertEquals(string4, page.obterEmail());
		Assert.assertEquals(string5, page.obterText());
	
		
	   
	}

}
