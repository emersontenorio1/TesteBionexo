package steps;

import static core.DriverFactory.getDriver;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import page.RadioCheckBoxPage;

public class RadioCheckBoxSteps extends BaseTest{
	
	private RadioCheckBoxPage page;
	
	
	@Dado("que estou na pagina de radio e checkBox {string}")
	public void que_estou_na_pagina_de_radio_e_check_box(String string) {
		getDriver().get(string);
		page = new RadioCheckBoxPage();
	}
	
	@Dado("seleciono o radio red")
	public void seleciono_o_radio_red() {
		page.selecaoRadio();
		
	}
	
	@Dado("seleciono o checkBox purple")
	public void seleciono_o_check_box_purple() {
	   page.selecionarCheckBox();
	}

	

	

}
