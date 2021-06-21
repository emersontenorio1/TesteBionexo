package steps;

import static core.DriverFactory.getDriver;

import org.junit.Assert;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import page.ListaDeUsuariosPage;

public class ListaDeUsuarioSteps extends BaseTest {
	
	private ListaDeUsuariosPage page;
	
	
	@Dado("que estou na pagina lista de usuários {string}")
	public void que_estou_na_pagina_lista_usuários(String string) {
		getDriver().get(string);
		page = new ListaDeUsuariosPage();
		
	 }
	
	@Dado("procuro usuário de {string}")
	public void procuro_usuário_de(String string) {
		page.usuarioEmail(string);
	
	}

	@Então("aciono o botão excluir")
	public void aciono_o_botão_excluir() throws InterruptedException {
	   page.excluirCadastroPorEmail();
	   
	}
	
	@Então("aciono o botão ok e o usuário é excluido da lista")
	public void  aciono_o_botão_ok_e_o_usuário_é_excluido_da_lista() {
		page.aceitarMensagem();
	   
	}
	
	@Então("aparece a mensagem {string}")
	public void aparece_a_mensagem(String string) {
		Assert.assertEquals(string, page.confirmaExclusao());
	}


}
