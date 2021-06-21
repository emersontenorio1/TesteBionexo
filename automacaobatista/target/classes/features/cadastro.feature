#language: pt

Funcionalidade: Cadastro de Usuário
 	Sendo um usuário do site automacaocombatista
 	na pagina Novo Usuario
 	quero cadastrar usuários novos
 	para utilização do site
 
Contexto: 
    Dado que estou na pagina de cadastro "https://automacaocombatista.herokuapp.com/users/new"

Esquema do Cenario: Cadastrar usuário válido
    E que preencho as informações <nome>, <ultimo nome>, <email>, <endereço> ,<universidade>,<profissão>, <sexo>,  <idade> 
    Quando aciono o botão criar
    Então vejo a mensagem de sucesso "Usuário Criado com sucesso"

    Exemplos: 
      | nome     | ultimo nome | email                   | universidade | sexo        | profissão | idade | endereço          |
      | "Beto"   | "Junior"    | "paulojunior@gmail.com" | "UniAtual"   | "Masculino" | "Tester"  | "10"  | "Rua Dourados,10" |
 
 Esquema do Cenario: Cadastrar usuário nome em branco
   	E que preencho as informações <nome>, <ultimo nome>, <email>, <endereço> ,<universidade>,<profissão>, <sexo>,  <idade> 
    Quando aciono o botão criar
    Então vejo a mensagem "1 error proibiu que este usuário fosse salvo:"
    E campo de correção "Name translation missing: pt-BR.activerecord.errors.models.user.attributes.name.blank"

	 Exemplos: 
	      | nome     | ultimo nome | email                   | universidade | sexo        | profissão | idade | endereço          |
	      | " "      | "Junior"    | "paulojunior@gmail.com" | "UniAtual"   | "Masculino" | "Tester"  | "10"  | "Rua Dourados,10" |
 

 Esquema do Cenario: Cadastrar usuário email invalido
   	E que preencho as informações <nome>, <ultimo nome>, <email>, <endereço> ,<universidade>,<profissão>, <sexo>,  <idade> 
    Quando aciono o botão criar
    Então vejo a mensagem "1 error proibiu que este usuário fosse salvo:"
    E campo de correção "Email translation missing: pt-BR.activerecord.errors.models.user.attributes.email.invalid" 

	 Exemplos: 
	      | nome     | ultimo nome | email          | universidade | sexo        | profissão | idade | endereço          |
	      | "Paulo"  | "Junior"    | "testes@teste" | "UniAtual"   | "Masculino" | "Tester"  | "10"  | "Rua Dourados,10" |

