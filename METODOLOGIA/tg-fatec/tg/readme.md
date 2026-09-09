## Sobre mim

<div align="center">
  <!-- Você pode substituir o link abaixo pela sua foto de perfil do GitHub (ex: https://github.com/SeuUsuario.png) -->
  <img src="https://avatars.githubusercontent.com/u/9919?s=280&v=4" width="150" style="border-radius: 50%; margin-bottom: 20px;" alt="Minha Foto">
</div>

Meu nome é João Vinícius Martins dos Santos. Sou estudante do curso de Tecnólogo em Banco de Dados da FATEC São José dos Campos – Prof. Jessen Vidal, atualmente no 4º semestre. Antes da graduação, concluí o Ensino Médio Técnico em Informática pelo Colégio Univap – Unidade Centro.

Durante minha formação, venho desenvolvendo conhecimentos relacionados a desenvolvimento de sistemas, bancos de dados e desenvolvimento web. Entre os cursos complementares realizados estão conteúdos de administração de bancos de dados, Python, Programação Orientada a Objetos, Power BI e Microsoft Excel.

Tenho maior interesse e experiência acadêmica na área de bancos de dados, especialmente na modelagem, criação, manutenção e organização de estruturas de dados utilizadas por aplicações.

## Contatos

* [Git](https://github.com/joaosantos13)
* [LinkedIn](https://www.linkedin.com/in/jo%C3%A3o-vinicius-santos/)

## Meus Principais Conhecimentos

**Aplicações e dados**

<p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" />
  <img src="https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D" alt="Vue.js" />
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" alt="Python" />
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Supabase-3ECF8E?style=for-the-badge&logo=supabase&logoColor=white" alt="Supabase" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" />
</p>

---

## Meus Projetos

### Em 2025 (3º Semestre)

**Empresa Parceira:** [IPEM — Instituto de Pesos e Medidas, Regional São José dos Campos](#)

**Projeto:** Gestão de Tráfego e Viaturas

**Problema:**

O IPEM Regional São José dos Campos apresentava dificuldades relacionadas à praticidade do processo de controle de abastecimento de suas viaturas. O processo utilizado anteriormente dependia de controles manuais, incluindo planilhas físicas e digitais, o que tornava o fluxo de informações mais lento e aumentava a necessidade de retrabalho. Além da dificuldade no registro das informações, havia a necessidade de organizar os dados relacionados aos abastecimentos, deslocamentos, viaturas e técnicos de maneira mais eficiente. Diante desse cenário, foi apresentada à equipe a necessidade de automatizar o processo de controle de abastecimento, tornando o registro e a consulta das informações mais rápidos e organizados.

**Solução Entregue pela Equipe:**

A equipe desenvolveu o Gestão de Tráfego e Viaturas, uma aplicação Web destinada à digitalização e ao gerenciamento das informações relacionadas ao abastecimento e deslocamento das viaturas do IPEM. A aplicação permite o registro das informações de abastecimento e deslocamento, o gerenciamento de viaturas e técnicos, a consulta de históricos e a visualização de indicadores por meio de um dashboard. A solução também foi planejada para facilitar o acompanhamento de informações como consumo médio e quilometragem, além de contribuir para a organização e posterior utilização dos dados pelo sistema oficial do IPEM.

[Repositório do Projeto](https://github.com/AtlazDB/Atlaz)

**Tecnologias Utilizadas**

* **Java & Spring Boot:** Essenciais para o desenvolvimento do backend, construção da API REST e endpoints para comunicação entre as partes do sistema.
* **Vue.js & JavaScript:** Utilizados no contexto do frontend e integração visual das funcionalidades da aplicação.
* **Supabase & PostgreSQL:** Ferramentas utilizadas para modelagem, criação, manutenção do banco de dados hospedado e estruturação relacional.
* **Git e GitHub:** Essenciais para controle de versão, colaboração entre os membros da equipe e organização do código.
* **Docker:** Utilizado para criar ambientes conteinerizados durante o desenvolvimento da aplicação.

**Contribuições Pessoais**

► **Engenharia de Dados, Arquitetura Relacional e Modelagem Estrutural**
  * **Concepção de Esquemas Relacionais e DDL:** Atuação na concepção e execução do esquema do banco de dados relacional via comandos de DDL (*Data Definition Language*), aplicando rigorosamente os conceitos das Formas Normais (1FN, 2FN e 3FN) para eliminação de anomalias de inserção, alteração e deleção.
  * **Definição de Entidades, Cardinalidade e Mapeamento:** Mapeamento conceitual e lógico das entidades centrais (`usuario`, `cidade`, `modelo`, `viatura`, `ordem_servico` e `abastecimento`), estabelecendo associações de cardinalidade (1:N, N:M) através da atribuição criteriosa de chaves primárias (*primary keys*) e chaves estrangeiras (*foreign keys*).
  * **Garantia de Integridade Referencial e Otimização:** Definição e aplicação de restrições de integridade (*NOT NULL*, *UNIQUE*, *CHECK*), além do planejamento e criação de índices B-Tree estrategicamente posicionados em colunas com alto índice de busca e junção (como identificadores de viaturas e carimbos de data/hora), reduzindo o custo computacional do plano de execução de consultas (*query execution plans*).

► **Sustentação, Migração Evolutiva e Administração no Supabase**
  * **Gerenciamento de Schema na Nuvem:** Administração da instância do banco de dados hospedada no Supabase (PostgreSQL), garantindo a estabilidade, segurança em nível de acesso e disponibilidade do ambiente de persistência.
  * **Refatoração e Manutenção Evolutiva:** Execução de scripts de migração (*DDL updates*) e adequações de esquema de forma sincronizada com as *sprints* de desenvolvimento do time, garantindo a compatibilidade contínua entre a camada de persistência e os contratos das entidades do ecossistema.

► **Desenvolvimento de Serviços Backend, Regras de Negócio e APIs RESTful**
  * **Construção de Endpoints e DTOs no Spring Boot:** Implementação de rotas e controladores para operações transacionais de CRUD, além da utilização do padrão DTO (*Data Transfer Object*) para garantir o desacoplamento entre os modelos de banco de dados e as respostas trafegadas na API RESTful.
  * **Persistência e Comunicação de Camadas:** Construção da camada de acesso a dados (*Data Access Layer*) e serviços no backend em Java, viabilizando a validação de regras de negócio complexas, o tratamento adequado de exceções e a integridade das transações antes de efetivar modificações no banco de dados.

► **Construção de Mecanismos de Filtragem e Consultas Parametrizadas**
  * **Querying e Filtros Dinâmicos:** Desenvolvimento de lógicas de consulta e filtros parametrizados no backend para resgate de dados históricos, permitindo a combinação flexível de múltiplos critérios de pesquisa (como intervalo temporal, frota/veículo, condutor e centro de custo).
  * **Otimização de Desempenho em Pesquisas:** Estruturação de consultas otimizadas no banco de dados para evitar gargalos de *I/O* e minimizar o tempo de resposta (*latency*) ao recuperar grandes volumes de registros históricos de abastecimento e deslocamento.

► **Engenharia de Dados Analíticos e Agregação para Dashboards**
  * **Processamento Analítico Relacional:** Elaboração de consultas com funções de agregação (*SUM*, *AVG*, *COUNT*) e agrupamentos avançados (*GROUP BY*, *HAVING*) para transformar dados brutos em métricas de inteligência operacional.
  * **Disponibilização de Indicadores Gerenciais (KPIs):** Estruturação e exposição de dados consolidados via endpoints específicos para a alimentação gráfica do dashboard frontend, viabilizando a extração de métricas sobre consumo médio de combustível (km/l), volumetria de abastecimentos, rodagem acumulada de frota e custos operacionais por técnico ou viatura.

**Hard Skills**

* **Banco de Dados / PostgreSQL:** Conhecimento aplicado na modelagem, criação, manutenção e relacionamento das tabelas da aplicação.
* **Supabase:** Conhecimento adquirido e aplicado na administração da estrutura de dados em nuvem.
* **Java / Spring Boot:** Conhecimento aplicado no desenvolvimento do backend da aplicação.
* **Vue.js / JavaScript:** Conhecimento aplicado no desenvolvimento frontend.
* **Git, GitHub & Docker:** Conhecimento aplicado no controle de versão e infraestrutura conteinerizada.

**Soft Skills**

**Trabalho em equipe:** O projeto foi desenvolvido por uma equipe de 9 integrantes. Minha atuação como Dev. Team exigiu constante alinhamento do desenvolvimento do banco de dados com as funcionalidades construídas pelos demais.

**Autodidatismo:** Demonstrei proatividade ao buscar e aprender conhecimentos novos, como o uso de Docker, Supabase e GitHub, adequando-me às necessidades reais do projeto.

**Organização:** A atuação na arquitetura de banco de dados exigiu forte organização das entidades e relacionamentos para o bom funcionamento do ecossistema.

**Resolução de problemas:** Analisei as demandas das funcionalidades e adaptei a estrutura de dados constantemente para entregar soluções compatíveis com os problemas enfrentados pelo IPEM.

---

### Aprendizados e Considerações Finais

O desenvolvimento do projeto proporcionou principalmente uma evolução na minha capacidade de trabalhar em um projeto de software em equipe. Minha principal contribuição esteve concentrada na camada de dados, sendo fundamental para que o sistema registrasse e relacionasse corretamente as informações. A participação no backend e a construção de filtros e dashboards também permitiu compreender melhor a relação de ponta a ponta de uma aplicação Web real.
