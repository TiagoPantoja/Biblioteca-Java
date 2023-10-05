# Biblioteca Universitária

Este é um projeto de uma Biblioteca Universitária desenvolvido em Java. O sistema permite o cadastro de livros, busca de livros por código ou título, remoção de livros, cadastro de empréstimos, visualização de registros de empréstimos, devolução de livros, verificação de atrasos, cadastro de usuários, busca de usuários por nome ou matrícula, lista de livros emprestados e lista de livros disponíveis.

## Classes Principais

### `Usuario`

A classe `Usuario` representa os usuários da biblioteca. Cada usuário tem uma matrícula, nome, email, telefone e uma lista de registros de empréstimos. A classe possui métodos para acessar e definir esses atributos.

### `RegistroEmprestimo`

A classe `RegistroEmprestimo` representa um registro de empréstimo de um livro para um usuário. Ela contém informações como o código do livro, a matrícula do usuário, as datas de empréstimo, devolução e devolução efetiva. Também possui métodos para acessar e definir esses atributos.

### `Main`

A classe `Main` contém o programa principal da biblioteca. Ela oferece um menu interativo para o usuário realizar várias operações, como cadastrar livros, buscar livros, cadastrar empréstimos, registrar devoluções, entre outras.

### `Livro`

A classe `Livro` representa os livros disponíveis na biblioteca. Cada livro possui um código, título, autor, editora, ano de publicação e número de páginas. A classe possui métodos para acessar e definir esses atributos.

### `Biblioteca`

A classe `Biblioteca` é responsável por gerenciar a lista de livros, usuários e registros de empréstimo. Ela oferece métodos para cadastrar, buscar e remover livros, bem como para registrar empréstimos, devoluções e verificar atrasos.

## Como Usar o Sistema

1. Execute o programa a partir da classe `Main`.
2. Você será apresentado a um menu interativo com várias opções.
3. Escolha a opção desejada digitando o número correspondente e pressione Enter.
4. Siga as instruções fornecidas pelo programa para realizar a operação desejada.
5. Repita os passos conforme necessário para usar as diferentes funcionalidades do sistema.
6. Para sair do programa, selecione a opção "Sair do Sistema da Biblioteca Universitária".

## Observações

- Certifique-se de que todas as classes estejam no mesmo pacote ou diretório para que o programa funcione corretamente.
- O sistema não possui persistência de dados, ou seja, os dados são armazenados apenas durante a execução do programa e são perdidos quando o programa é encerrado.

Este é um projeto simples de uma biblioteca universitária em Java. Você pode expandir e aprimorar o sistema adicionando recursos de persistência de dados, autenticação de usuários e outras funcionalidades de acordo com suas necessidades.

Lembre-se de verificar os requisitos do seu ambiente de desenvolvimento para executar o programa corretamente.
