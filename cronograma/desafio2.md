## FlowTalents Desafio 2: Distribuidora de Estoque

`Leia tudo antes de fazer qualquer coisa`

Os esforços com o Mercadin são antigos, porém não esquecidos. No mês de janeiro, uma parceira da ViaFlow com experiência no meio do Varejo recebeu um briefing do projeto com nossas decisões iniciais e teve uma ideia que pode impactar positivamente vários dos seus negócios.

Essa parceira opera com **distribuições de estoques**, ou seja, para donos de outros negócios, como mercados, e não necessariamente para o consumidor final, de prateleira. Durante a pandemia, fomos informados que os hábitos de consumo nos mercados sofreram influência de maiores variações, o que reduziu significativamente a sazonalidade e a previsibilidade da saída de produtos.

Isso quer dizer que os mercados têm precisado de algo mais para se apoiarem, além das projeções simples que usam há tempos. Por isso, foi pensado em um MVP onde os donos desses negócios possam

1. na página `Home (index)`, receber uma lista `(GET)` de produtos com *id*, *título*, *descrição*, [*categoria*](https://www.doutorecommerce.com.br/wp-content/uploads/2019/03/Captura-de-Tela-2019-02-19-a%CC%80s-10.53.00-1024x576.png) e pontuação. 
2. para cada um deles, poder clicar em um botão para declarar interesse e incrementar `(PUT)` a pontuação de determinado item. (faça uso do *id* na API)
3. na página `Contato`, ter um formulário com os inputs de `nome`, `nome do mercado` e `campo de texto` para que a distribuidora receba a sugestão de um produto que não ainda não consta na lista.

#### Desafio extra

`"Uma imagem vale mais que mil palavras" award`:  tenha uma imagem para cada produto, para melhorar a usabilidade do sistema. (é mais fácil do que parece)

`"Segurança nunca é demais" award`: esconda as funcionalidades da home por trás de **autenticação do usuário**, fazendo com que só seja possível interagir com o estoque se houver resposta positiva do backend após login.

### Orientações

1. Utilize o canal `#desafio` para trocarem informações, sejam elas técnicas ou conceituais. (dúvidas podem e devem surgir) 
2. **O projeto deve compilar**, ou seja, atingir o momento zero da aplicação. Por isso, **tenha cuidado com modificações de última hora**, e prefira realizar vários commits pequenos a poucos gigantescos.
3. A data limite para o desenvolvimento da aplicação é **23:59 do dia 10 de fevereiro**.
4. O repositório com o seu código deve estar **marcado como privado** - inclua `jmfantin2` como colaborador no Github para que eu possa ter acesso ao projeto.
5. **Se divirta!** Nada disso é fácil, mas não quer dizer que precise ser sofrido. Independente de stack e senioridade, tem horas que ser dev significa [isso aqui](https://www.onsip.com/hs-fs/hubfs/family-guy-blinds-gif.gif?width=380&name=family-guy-blinds-gif.gif).
6. Em um `README.md` na raíz do projeto, liste ferramentas e comandos necessários para executar a aplicação. [[exemplo 1](https://github.com/jmfantin2/omnistack19)] [[exemplo 2](https://github.com/jmfantin2/react-google-books)]

Sigo à disposição. Vamos com tudo!