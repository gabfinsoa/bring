# bring
Bring test

O código foi desenvolvido em Java, utilizando a IDE IntelliJ e o navegador Chrome. O teste está dividido daseguinte forma:

Objetos, do tipo Button, Label, TextBox, etc... Estão no caminho: SRC->MAIN->JAVA->OBJECTS. Eles são mapeados conforme a necessidade, utilizando-se dos locators ID, XPATH, CSS...
A utilização dos objetos acima citados, estão no caminho: SRC->MAIN->JAVA->ACTIONS. 
Então, utilizam-se das ações do tipo: Clicar, Esperar, Escrever... Estas ações já criadas na pasta UTILS, em SRC->MAIN->JAVA->UTILS
As CAPABILITIES estão localizadas em: SRC->MAIN->TEST->JAVA->CAPABILITIES

Execução dos Testes

Teste de User Interface, realizado em Java + Selenium WebDriver + Cucumber + Junit. 
Nome do teste: "CreateAccountAndAddCart" 
Execução: Primeiro selecionar o teste a ser executado no menu: RUN -> EDIT CONFIGURATIONS -> CreateAccountAndAddCart (teste) -> APPLY -> OK. 
Com o teste já selecionado executar o mesmo em: RUN -> Run 'CreateAccountAndAddCart'. (Se já tiver conhecimento, apenas dê o play). 
Então serão executados os passos descritos no arquivo: SRC -> TEST -> JAVA -> FEATURES -> "CreateAccountAndAddCart.feature"
