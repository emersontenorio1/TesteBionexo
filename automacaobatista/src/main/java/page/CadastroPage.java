package page;
import org.openqa.selenium.By;

import core.BasePage;
public class CadastroPage extends BasePage{
	
	public void setNome(String nome) {
		dsl.escrever("user_name", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("user_lastname", sobrenome);
	}
	
	public void setSexo(String sexo){
		dsl.escrever("user_gender", sexo);
		
	}
	public void setEmail(String email){
		dsl.escrever("user_email", email);
		
	}            
	 
	 public void setEndereco(String setEndereco){
			dsl.escrever("user_address", setEndereco);
			
		}
	
	 public void setUniversidade(String universidade){
			dsl.escrever("user_university", universidade);
			
		}
	
	 public void setProfissao(String profissao){
			dsl.escrever("user_profile", profissao);
			
		}
	 
	 public void setIdade(String idade){
			dsl.escrever("user_age", idade);
			
		}
	 
		public void cadastrar(){
			dsl.clicar(By.name("commit"));
		}
		
		public String obterResultadoCadastro(){
			
			
			return dsl.obterTexto(By.id("notice"));
		}
		
		public String obterResultadoNegativo(){
			
			
			return dsl.obterTexto(By.xpath("//*[@id='error_explanation']/h2"));
		}
		
		public String obterResultadoemNegativoSegundaMensagem(){
			
			
			return dsl.obterTexto(By.xpath("//*[@id='error_explanation']/ul/li"));
		}
	
		public String obterResultadoemNegativoEmail(){
			
			return dsl.obterTexto(By.xpath("//*[@id='error_explanation']/ul/li"));
	 }
		
		
}
