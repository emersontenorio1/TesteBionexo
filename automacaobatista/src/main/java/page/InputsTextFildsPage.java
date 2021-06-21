package page;

import org.openqa.selenium.By;

import core.BasePage;

public class InputsTextFildsPage extends BasePage {

	public void setNome(String nome) {
		
		dsl.escrever("first_name", nome);
	}

	public void setSobrenome(String sobrenome) {
		dsl.escrever("last_name", sobrenome);
	}

	public void setEmail(String email) {
		dsl.escrever("email", email);

	}

	public void setText(String text) {

		dsl.escrever("textarea1", text);

	}

	public void setPassword(String password) {
		dsl.escrever("password", password);

	}

	public String obterTextNome() {
		
		return dsl.obterValorCampo(By.id("first_name"));
	}

	public String obterTextLastname() {

		return dsl.obterValorCampo(By.id("last_name"));
	}

	public String obterPassword() {

		return dsl.obterValorCampo(By.id("password"));
	}

	
	public String obterEmail() {
		return dsl.obterValorCampo(By.id("email"));
	}
	
	public String obterText() {
		return dsl.obterValorCampo(By.id("textarea1"));
		
	}
}
