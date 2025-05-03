# Cadastro de Pacientes - Projeto FullStack

Este é um projeto FullStack simples que permite o cadastro de pacientes, desenvolvido utilizando **Java** com **Spring Boot** no backend e **HTML**, **CSS**, e **JavaScript** no frontend.

## Índice

- [Sobre](#sobre)
- [Tecnologias](#tecnologias)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Como Rodar o Projeto](#como-rodar-o-projeto)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Sobre

O sistema permite que os usuários cadastrem pacientes e visualizem os dados cadastrados. O backend foi desenvolvido com **Spring Boot**, enquanto o frontend é composto por **HTML**, **CSS** e **JavaScript**.

## Tecnologias

- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS, JavaScript
  
## Estrutura do Projeto

### Backend

- **Model**: 
  - Classe `Paciente`: Representa o paciente no sistema.
- **Repository**:
  - Interface `PacienteRepository`: Interface responsável pela comunicação com o banco de dados.
- **Service**:
  - Classe `PacienteService`: Contém a lógica de negócios relacionada aos pacientes.
- **Controller**:
  - Classe `PacienteController`: Responsável por controlar as requisições HTTP.
- **Exception**:
  - Classe `GlobalHandlerException`: Trata exceções como `RuntimeException`, `IllegalArgumentException`, `MethodArgumentNotValidException`, e `NoResourceFoundException`.

### Frontend

- **HTML**:
  - `bem-vindo.html`: Página inicial.
  - `cadastro.html`: Página para cadastrar um paciente.
  - `paciente.html`: Página que lista os pacientes cadastrados.
  
- **CSS**:
  - `bem_vindo_style.css`: Estilos para a página inicial.
  - `cadastro.css`: Estilos para a página de cadastro.
  - `pacientes.css`: Estilos para a página de lista de pacientes.

- **JavaScript**:
  - `script_cadastro.js`: Scripts para interações na página de cadastro.
  - `pacientes.js`: Scripts para exibição e manipulação de dados dos pacientes.

## Funcionalidades

- Cadastro de pacientes com nome, idade, e informações de contato.
- Exibição de uma lista de pacientes cadastrados.
- Tratamento de erros, como exceções específicas, com mensagens de erro amigáveis.
- Interface simples e responsiva.

## Desenvolvido por

![Minha Foto](https://avatars.githubusercontent.com/u/169309059?v=4)

[Vinícius - Dev Full Stack]([https://github.com/seu-usuario](https://github.com/ViniciusKCruz)).
