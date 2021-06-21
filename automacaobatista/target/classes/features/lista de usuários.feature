#language: pt
Funcionalidade: Cadastro de Usuário
 	Sendo um usuário do site automacaocombatista
 	na pagina de Lista de Usuários
 	quero excluir um usuário da lista
	
 	 	  
    
Cenario: Excluir usuário cadastrado da lista
	Dado que estou na pagina lista de usuários "https://automacaocombatista.herokuapp.com/users"
 	E procuro usuário de "caio@teste.com"
 	Então aciono o botão excluir
 	Quando aciono o botão ok e o usuário é excluido da lista
 	Então aparece a mensagem "Seu Usuário foi removido com sucesso!"
 	