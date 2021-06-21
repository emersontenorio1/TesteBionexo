package steps;

import static core.DriverFactory.getDriver;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import page.LinksPage;

import org.junit.Assert;

public class LinksSteps extends BaseTest {
	
	private LinksPage page;
	
	@Dado("que estou na pagina de links {string}")
	public void que_estou_na_pagina_de_links(String string) {
		getDriver().get(string);
		page = new LinksPage();
	 
	}

	@Dado("aciono o link {string}")
	public void aciono_o_link(String string) {
	   
	    page.clicarLink(string);
	}

	@Então("o link retorna {string}")
	public void o_link_retorna(String string) {
		Assert.assertEquals(string, page.confirmarLink());
	    
	}
	
	@Então("o link bad retorna {string}")
	public void o_link_bad_retorna(String string) {
		Assert.assertEquals(string, page.confirmarLinkBad());
	    
	}


}
