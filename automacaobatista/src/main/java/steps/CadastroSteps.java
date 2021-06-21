package steps;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killdriver;

import java.io.IOException;

import org.junit.Assert;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.CadastroPage;

public class CadastroSteps extends BaseTest {

	private CadastroPage page;

	@After
	public void finaliza(Scenario scenario) throws IOException {

		String secenario = scenario.getName();
		finaliza(secenario);
		killdriver();
	}

	@Dado("que estou na pagina de cadastro {string}")
	public void que_estou_na_pagina_de_cadastro(String string) {
		getDriver().get(string);
		page = new CadastroPage();

	}

	@Dado("que preencho as informações {string}, {string}, {string}, {string} ,{string},{string}, {string},  {string}")
	public void que_preencho_as_informações(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		page.setNome(string);
		page.setSobrenome(string2);
		page.setEmail(string3);
		page.setEndereco(string4);
		page.setUniversidade(string5);
		page.setProfissao(string6);
		page.setSexo(string7);
		page.setIdade(string8);
	}

	@Quando("aciono o botão criar")
	public void aciono_o_botão_criar() {
		page.cadastrar();

	}

	@Então("vejo a mensagem de sucesso {string}")
	public void vejo_a_mensagem_de_sucesso(String string) {
		Assert.assertEquals(string, page.obterResultadoCadastro());
	}

	@Então("vejo a mensagem {string}")
	public void vejo_a_mensagem(String string) {
		Assert.assertEquals(string, page.obterResultadoNegativo());
	}

	@Então("campo de correção {string}")
	public void campo_de_correção(String string) {
		Assert.assertEquals(string, page.obterResultadoemNegativoSegundaMensagem());
	}
}