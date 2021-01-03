## FlowTalents Desafio 1: Locação de Automóveis

`Leia tudo antes de fazer qualquer coisa`

Um dono de um pequeno negócio de locação de automóveis, em conjunto com a ViaFlow, quer **realizar uma POC** para validar o quanto um sistema simples de gestão operacional pode auxiliá-lo com o ¹**cadastro de veículos** e ²**locações** dos mesmos. Hoje a operação é manual, o que gera certa dor de cabeça e problemas eventuais.

O cliente possui uma frota de veículos de [categorias A a D](https://autopapo.uol.com.br/noticia/categorias-da-cnh-tipos-carteira-motorista/) e quer experimentar um sistema simples, sem necessidade de persistência de dados após execução, onde ele possa:

1. Cadastrar veículos dos tipos `Carro`, `Moto`, `Caminhao` e `Onibus` informando *placa*, *marca*, *ano* e *cor* (*), além dos atributos específicos de cada classe, sendo:
   1. para `Carro`: *portas*, *ar-condicionado (sim ou não)*, *câmbio (manual ou automático)*, *direção* (mecânica, hidráulica ou elétrica);
   2. para `Moto`: *quantidade de cilindradas*;
   3. para `Caminhao`: *capacidade* ([em toneladas](https://blog.cargobr.com/wp-content/uploads/2019/04/20190402_cargobr_infografico_eixos.png));
   4. para `Onibus`: *quantidade de assentos*.
2. Realizar `Locacao` dos veículos cadastrados, verificando:
   1. se o veículo em questão está disponível para locação;
   2. se o motorista é apto a dirigir determinado veículo, através da categoria da sua CNH:
      1. A: apenas motos;
      2. B: apenas carros;
      3. C: caminhões e carros;
      4. D: ônibus, caminhões e carros;

Após as verificações, salve em uma estrutura de dados a locação, contendo a *placa* do automóvel. Não há necessidade de realizar cadastramento dos motoristas - o cliente apenas pediu que possa registrar também na locação o número de WhatsApp do locatário. 

#### Desafios extras

1. `"Não fez mais que a obrigação" award`: crie uma função para encerrar determinada locação informando a placa e liberando o veículo.
2. `"Business intelligence" award `: utilize a biblioteca `Date` para criar uma locação com data limite, e indique em tela quando essa locação tiver vencido.
3. `"Dominação mundial" award`: faça com que a locação se encerre automaticamente após a data limite.

### Dicas

1. Crie funcionalidades para imprimir informações da frota e das locações - isso te ajuda a enxergar o desenvolvimento ao mesmo tempo que entrega muito valor de consulta para o cliente.
2. Tenha a placa de cada automóvel como parâmetro identificador para realizar acessos e modificações nas estruturas de dados, e não permita que seja cadastrado um novo veículo com uma placa já existente.
3. Implemente herança - use a classe `Veiculo` para construir os atributos genéricos (*), e as subclasses para os atributos específicos. O cliente tem planos de alugar outros tipos de veículos, como barcos e aviões monomotores, então dessa forma você garante menor manutenção no futuro do projeto.

### Orientações

1. Você pode programar em Java ou Javascript. (no entanto, incentivo Java, considerando a própria familiaridade com o projeto que estamos desenvolvendo nos sábados)
2. **O projeto deve compilar**, ou seja, atingir o momento zero da aplicação. Por isso, **tenha cuidado com modificações de última hora**, e prefira realizar vários commits pequenos a poucos gigantescos.
3. A data limite para o desenvolvimento da aplicação é **23:59 do dia 7 de janeiro**.
4. O repositório com o seu código deve estar **marcado como privado** - inclua `jmfantin2` como colaborador no Github para que eu possa ter acesso ao projeto.
5. **Agora é a hora de pedir ajuda**. Nossas dailies até o dia 7 terão foco nessa tarefa, então una-se aos outros e não tenha medo de debater sobre o desafio.

Estou à disposição. Vamos com tudo!
