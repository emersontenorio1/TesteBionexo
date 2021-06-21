#language: pt
Funcionalidade: Inputs, TextField e TextArea
 	Sendo um usuário do site automacaocombatista
 	na pagina de Inputs, TextField e TextArea
 	quero clicar inserir informações
	
 	 	  
    
Cenario: Inserir informações no campo
	Dado que estou na pagina de Inputs, TextField e TextArea "https://automacaocombatista.herokuapp.com/buscaelementos/inputsetextfield"
 	E preencho as informações "Emerson", "Barbosa Tenorio","Senha@123456", "teste@teste.com.br", "Isso foi um teste"
 	Então confirmo todas as informações "Emerson", "Barbosa Tenorio", "Senha@123456", "teste@teste.com.br", "Isso foi um teste"