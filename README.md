Framework para prova da Bionexo

Para execução dos testes não é necessário utilizar nenhum driver , pois para utilização do exe é dada pela a lib https://github.com/bonigarcia/webdrivermanager, a mesma já efetua o download do driver necessário.

Para rodar os testes por favor utilizar a classe Cadastro.runner via junit ou se preferir rodar os testes via cada feature.

É possivel trocar de browser via a class Propriedades onde podemos trocar o parâmetro Browsers.
![image](https://user-images.githubusercontent.com/38475941/122737471-72815b80-d257-11eb-9b7f-228e502b56a8.png)


Nesse framework está contemplado os browsers Chrome e Firefox, mas podemos utilizar qualquer browser disponível na lib webdrivermanager.


![image](https://user-images.githubusercontent.com/38475941/122737574-8f1d9380-d257-11eb-8427-a73109405b3d.png)


Para melhor aproveitamento , instalar plugin do cucumber.

Os screenshots são salvos na pasta do projeto/target/screenshots, assim como reports de execução projeto/target/relatorios

![image](https://user-images.githubusercontent.com/38475941/122737882-db68d380-d257-11eb-967f-878a1731df1e.png)


