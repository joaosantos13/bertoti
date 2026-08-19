# TG FATEC — João Vinícius Martins dos Santos

## Sobre mim

Meu nome é **João Vinícius Martins dos Santos**. Sou estudante do curso de **Tecnólogo em Banco de Dados da FATEC São José dos Campos – Prof. Jessen Vidal**, atualmente no 4º semestre. Antes da graduação, concluí o Ensino Médio Técnico em Informática pelo Colégio Univap – Unidade Centro.

Durante minha formação, venho desenvolvendo conhecimentos relacionados a desenvolvimento de sistemas, bancos de dados e desenvolvimento web. Entre os cursos complementares realizados estão conteúdos de administração de bancos de dados, Python, Programação Orientada a Objetos, Power BI e Microsoft Excel.

Tenho maior interesse e experiência acadêmica na área de bancos de dados, especialmente na modelagem, criação, manutenção e organização de estruturas de dados utilizadas por aplicações.

---

## Projeto — Gestão de Tráfego e Viaturas

### Empresa Parceira

**IPEM — Instituto de Pesos e Medidas, Regional São José dos Campos**

### Período

**3º semestre da graduação**

O projeto desenvolvido no 3º semestre foi utilizado como base para a elaboração deste TG no 4º semestre.

> **Observação:** de acordo com a organização da FATEC, os projetos API são desenvolvidos ao longo dos semestres e posteriormente os alunos escolhem, em outro momento da graduação, qual projeto será utilizado como base para o TG final.

---

## Equipe

| Nome | Função |
|---|---|
| Leandro Henrique | Scrum Master |
| Gabriel Valente | Product Owner |
| Ryan Reis | Dev. Team |
| Leonardo Amon | Dev. Team |
| Samuel Rezende | Dev. Team |
| Gabriel Rocha | Dev. Team |
| Gabriel Nunes | Dev. Team |
| **João Santos** | **Dev. Team** |
| Maria Oliveira | Dev. Team |

---

## Problema

O IPEM Regional São José dos Campos apresentava dificuldades relacionadas à praticidade do processo de controle de abastecimento de suas viaturas. O processo utilizado anteriormente dependia de controles manuais, incluindo planilhas físicas e digitais, o que tornava o fluxo de informações mais lento e aumentava a necessidade de retrabalho.

Além da dificuldade no registro das informações, havia a necessidade de organizar os dados relacionados aos abastecimentos, deslocamentos, viaturas e técnicos de maneira mais eficiente.

Diante desse cenário, foi apresentada à equipe a necessidade de **automatizar o processo de controle de abastecimento**, tornando o registro e a consulta das informações mais rápidos e organizados.

---

## Solução entregue pela equipe

A equipe desenvolveu o **Gestão de Tráfego e Viaturas**, uma aplicação Web destinada à digitalização e ao gerenciamento das informações relacionadas ao abastecimento e deslocamento das viaturas do IPEM.

A aplicação permite o registro das informações de abastecimento e deslocamento, o gerenciamento de viaturas e técnicos, a consulta de históricos e a visualização de indicadores por meio de um dashboard.

A solução também foi planejada para facilitar o acompanhamento de informações como consumo médio e quilometragem, além de contribuir para a organização e posterior utilização dos dados pelo sistema oficial do IPEM.

O projeto foi organizado utilizando uma API REST no backend e uma interface Web no frontend. O repositório é dividido em `backend`, `frontend` e `Documentacao`, refletindo a separação das principais partes da aplicação.

---

## Funcionalidades

Entre as funcionalidades previstas e desenvolvidas no projeto estão:

- Registro de deslocamentos e abastecimentos;
- Cadastro de viaturas;
- Cadastro de técnicos;
- Validação de quilometragem;
- Dashboard de consumo;
- Histórico de registros;
- Visualização e edição de registros;
- Filtros de gastos por veículo e técnico;
- Exportação de dados;
- Controle de informações relacionadas à frota.

---

## Tecnologias utilizadas

### Backend

- **Java**
- **Spring Boot**
- API REST

### Frontend

- **Vue.js**
- **JavaScript**

### Banco de dados

- **Supabase**
- PostgreSQL

### Desenvolvimento e infraestrutura

- **Git**
- **GitHub**
- **Docker**

O repositório oficial do projeto contém as áreas de backend e frontend, além da documentação do desenvolvimento.

---

## Estrutura do banco de dados

Uma das principais responsabilidades do meu trabalho no projeto foi a criação e manutenção do banco de dados.

A estrutura foi desenvolvida de forma relacional, utilizando tabelas conectadas por chaves estrangeiras. Entre as principais entidades utilizadas estão:

- `usuario`
- `cidade`
- `modelo`
- `viatura`
- `ordem_servico`
- `abastecimento`

### Principais relacionamentos

A tabela `viatura` possui relacionamento com `modelo`, permitindo identificar as características do veículo.

A tabela `ordem_servico` possui relacionamentos com `usuario` e `viatura`, permitindo associar uma ordem de serviço ao técnico responsável e ao veículo utilizado.

A tabela `abastecimento` possui relacionamentos com `usuario`, `viatura`, `cidade` e, opcionalmente, `ordem_servico`. Dessa forma, cada abastecimento pode ser associado ao usuário responsável pelo registro, à viatura utilizada, à cidade e, quando aplicável, à ordem de serviço correspondente.

Também foram utilizados índices em campos relacionados à viatura, data de abastecimento e viatura da ordem de serviço, buscando melhorar a organização e o acesso aos dados.

---

## Contribuições pessoais

### Modelagem e criação do banco de dados

Minha principal contribuição para o projeto foi relacionada à **modelagem, criação e manutenção do banco de dados**.

Participei da definição da estrutura necessária para armazenar as informações utilizadas pelo sistema, criando tabelas, relacionamentos, chaves primárias e estrangeiras e regras de integridade.

A estrutura do banco foi desenvolvida considerando as principais informações necessárias ao funcionamento do sistema, como usuários, cidades, modelos de veículos, viaturas, ordens de serviço e abastecimentos.

Essa atividade foi importante para garantir que as informações utilizadas pelas demais funcionalidades da aplicação fossem armazenadas de forma organizada e pudessem ser relacionadas corretamente.

### Desenvolvimento e manutenção

Além da criação inicial da estrutura, também participei da manutenção do banco durante o desenvolvimento do projeto.

Essa atividade envolveu adequações na estrutura de dados conforme as necessidades das funcionalidades desenvolvidas pela equipe, garantindo que o banco acompanhasse a evolução da aplicação.

### Backend e endpoints

Também atuei no backend da aplicação, participando da criação de endpoints necessários para disponibilizar e manipular os dados utilizados pelo sistema.

Essa atuação permitiu integrar a estrutura do banco de dados com as demais partes da aplicação, fazendo com que os dados pudessem ser registrados e consultados por meio da API.

### Histórico de registros

Participei do desenvolvimento da funcionalidade de **histórico de registros**, principalmente na implementação dos filtros utilizados para facilitar a consulta das informações.

Os filtros permitem que os registros sejam consultados de maneira mais direcionada, facilitando a localização das informações necessárias pelos usuários do sistema.

### Cadastro de viaturas e técnicos

Também participei do desenvolvimento das estruturas e endpoints relacionados ao cadastro de viaturas e técnicos.

No banco de dados, essas informações foram representadas por estruturas próprias e relacionadas aos demais dados necessários para o funcionamento do sistema.

### Dados do dashboard

Participei da preparação e disponibilização dos dados utilizados pelo dashboard.

O dashboard tem como objetivo apresentar indicadores relacionados à utilização das viaturas, permitindo visualizar informações como gastos, litros abastecidos, quilometragem, quantidade de abastecimentos e consumo médio.

Minha atuação nessa parte esteve concentrada principalmente nos **dados utilizados para alimentar os indicadores**, e não na construção visual dos componentes do dashboard.

---

## Git e GitHub

Durante o projeto, também desenvolvi conhecimentos relacionados ao uso do **Git e GitHub**.

O trabalho em equipe exigiu a utilização de controle de versão para organizar o desenvolvimento e permitir que diferentes integrantes trabalhassem simultaneamente no projeto.

Uma das principais aprendizagens obtidas durante o desenvolvimento foi justamente a utilização do GitHub como ferramenta de colaboração, incluindo a organização do código e o acompanhamento das alterações realizadas pela equipe.

---

## Hard Skills

### Banco de Dados / PostgreSQL

Conhecimento aplicado na modelagem, criação, manutenção e relacionamento das tabelas utilizadas pela aplicação.

### Supabase

Conhecimento adquirido e aplicado na utilização do banco de dados hospedado e na administração da estrutura de dados utilizada pelo projeto.

### Java

Conhecimento aplicado no desenvolvimento do backend da aplicação.

### Spring Boot

Conhecimento aplicado na construção da API e dos endpoints utilizados para comunicação entre as diferentes partes do sistema.

### Vue.js

Conhecimento aplicado no contexto do frontend e integração das funcionalidades da aplicação.

### JavaScript

Conhecimento aplicado no desenvolvimento das funcionalidades do frontend.

### Git e GitHub

Conhecimento aplicado no controle de versão e no desenvolvimento colaborativo do projeto.

### Docker

Conhecimento adquirido e aplicado na utilização de ambientes conteinerizados durante o desenvolvimento.

---

## Soft Skills

### Trabalho em equipe

O projeto foi desenvolvido por uma equipe composta por nove integrantes, divididos entre Scrum Master, Product Owner e Dev. Team. A necessidade de desenvolver diferentes partes do mesmo sistema exigiu comunicação e colaboração constante entre os integrantes.

Minha atuação como Dev. Team envolveu a necessidade de alinhar o desenvolvimento do banco de dados e do backend com as funcionalidades desenvolvidas pelos demais integrantes.

### Autodidatismo

Durante o desenvolvimento, precisei aprender e aprimorar conhecimentos relacionados principalmente ao uso do GitHub, Supabase e Docker.

A necessidade de utilizar essas ferramentas em um projeto desenvolvido em equipe exigiu que eu buscasse conhecimento e aprendesse a utilizá-las de acordo com as necessidades encontradas durante o desenvolvimento.

### Organização

A atuação principalmente na área de banco de dados exigiu organização das entidades, relacionamentos e informações necessárias para o funcionamento do sistema.

Essa organização foi importante para que o banco pudesse atender às necessidades das funcionalidades desenvolvidas pela equipe.

### Resolução de problemas

Durante o desenvolvimento e manutenção do banco de dados, foi necessário analisar as necessidades das funcionalidades e adaptar a estrutura dos dados para que ela pudesse atender corretamente ao funcionamento da aplicação.

Essa experiência contribuiu para o desenvolvimento da capacidade de identificar problemas relacionados aos dados e buscar soluções compatíveis com a estrutura do sistema.

---

## Aprendizados

O desenvolvimento do projeto proporcionou principalmente uma evolução na minha capacidade de trabalhar em um projeto de software em equipe.

Entre os principais aprendizados estão:

- Utilização do Git e GitHub em um projeto colaborativo;
- Desenvolvimento e manutenção de bancos de dados;
- Utilização do Supabase;
- Utilização do Docker;
- Integração entre banco de dados e backend;
- Criação e utilização de endpoints;
- Desenvolvimento de filtros para consulta de dados;
- Organização de estruturas relacionais;
- Participação em um projeto de software desenvolvido para uma necessidade real de uma organização.

---

## Considerações sobre minha participação

Minha principal contribuição no projeto **Gestão de Tráfego e Viaturas** esteve concentrada na camada de dados. A criação e manutenção do banco de dados foi fundamental para que as funcionalidades desenvolvidas pela equipe pudessem registrar, consultar e relacionar corretamente as informações utilizadas pela aplicação.

A participação em outras partes do sistema, principalmente no backend, criação de endpoints, filtros e preparação dos dados do dashboard, também permitiu compreender melhor a relação entre o banco de dados e as demais camadas de uma aplicação Web.

Além dos conhecimentos técnicos, o projeto contribuiu para minha experiência em desenvolvimento colaborativo, principalmente pela utilização do GitHub, Supabase e Docker em conjunto com os demais integrantes da equipe.

---

## Referências e materiais do projeto

- Repositório do projeto: https://github.com/AtlazDB/Atlaz
- Modelo de TG utilizado como referência: https://github.com/laroyprado/Bertoti/tree/main/tg-fatec/tg

---

## Informações ainda pendentes

Os seguintes elementos podem ser adicionados posteriormente, caso sejam exigidos pelo modelo ou pela orientação da FATEC:

- Nome do orientador;
- Título definitivo do TG;
- RA;
- Turma;
- Período exato do projeto;
- Imagens/prints das telas;
- Diagrama Entidade-Relacionamento (DER);
- Diagrama lógico do banco;
- Evidências visuais das contribuições pessoais;
- Links específicos para commits ou arquivos desenvolvidos individualmente;
- Resultados quantitativos obtidos com a solução;
- Conclusão formal do TG.
