#language: pt
Funcionalidade: Links
 	Sendo um usuário do site automacaocombatista
 	na pagina de links
 	quero clicar no links
	
 	 	  
    
Cenario: Clicar no link Ok 200 - Sucess
	Dado que estou na pagina de links "https://automacaocombatista.herokuapp.com/buscaelementos/links"
 	E aciono o link "Ok 200 - Sucess"
 	Então o link retorna "Success!!"
 	
Cenario: Clicar no link Erro 400 - Bad Request
	Dado que estou na pagina de links "https://automacaocombatista.herokuapp.com/buscaelementos/links"
 	E aciono o link "Erro 400 - Bad Request"
 	Então o link bad retorna "Bad Request!!"