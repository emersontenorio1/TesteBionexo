package page;

import static core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import core.BasePage;

public class ListaDeUsuariosPage  extends BasePage{
		
	private String email;
	
	
	public void usuarioEmail(String email) {
		
		this.email = email;
		
		
	}
	
	
	public void excluirCadastroPorEmail() throws InterruptedException {
		
		
		dsl.clicarBotaoTabela("Email", this.email, "Ações", "/html/body/div[3]/div/table");
		
	}
	
	
	public void aceitarMensagem() {
		getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		dsl.alertaObterTextoEAceita();
		
	}
	
	public String confirmaExclusao() {
		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		return dsl.obterTexto(By.id("notice"));
	}
}
