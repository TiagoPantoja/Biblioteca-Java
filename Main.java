import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema da Biblioteca Universitária");
            System.out.println("1 - Cadastro de Livro");
            System.out.println("2 - Busca de Livro por Código");
            System.out.println("3 - Busca de Livro por Título");
            System.out.println("4 - Remoção de Livro");
            System.out.println("5 - Cadastro de Empréstimo");
            System.out.println("6- Visualização de Registro de Empréstimos");
            System.out.println("7- Devolução de Livro");
            System.out.println("8- Verificação de Atraso");
            System.out.println("9- Cadastro de Usuário");
            System.out.println("10- Busca de Usuário por Nome");
            System.out.println("11- Busca de Usuário por Matrícula");
            System.out.println("12- Lista de Livros Emprestados");
            System.out.println("13- Lista de Livros Disponíveis");
            System.out.println("14- Sair do Sistema da Biblioteca Universitária");
            System.out.print("Digite opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o código do livro: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite a editora do livro: ");
                    String editora = scanner.nextLine();
                    System.out.print("Digite o ano do livro: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o número de páginas do livro: ");
                    int paginas = scanner.nextInt();
                    Livro livro = new Livro(codigo, titulo, autor, editora, ano, paginas);
                    biblioteca.cadastraLivro(livro);
                    break;

                case 2:
                    System.out.print("Digite o código do livro: ");
                    codigo = scanner.nextLine();
                    livro = biblioteca.buscaLivroCodigo(codigo);
                    if (livro != null) {
                        System.out.println(livro);
                    } else {
                        System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 3:
                    System.out.print("Digite o título do livro: ");
                    String tituloBusca = scanner.nextLine();
                    Livro[] livros = biblioteca.buscarLivroTitulo(tituloBusca);
                    if (livros.length > 0) {
                        for (Livro livroBusca : livros) {
                            System.out.println(livroBusca);
                        }
                    } else {
                        System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 4:
                    System.out.print("Digite o código do livro: ");
                    codigo = scanner.nextLine();
                    biblioteca.removeLivro(codigo);
                    break;

                case 5:
                    System.out.println("Informe a matrícula do usuário: ");
                    String matricula = scanner.nextLine();
                    Usuario usuario = biblioteca.buscaUsuarioMatricula(matricula);

                    if (usuario != null) {
                        System.out.println("Informe o código do livro: ");
                        String codigoLivro = scanner.nextLine();
                        Livro livroEmprestimo = biblioteca.buscaLivroCodigo(codigoLivro);

                        if (livroEmprestimo != null) {
                            System.out.println("Informe data de empréstimo: ");
                            String dataEmprestimo = scanner.nextLine();
                            System.out.println("Informe data de devolução: ");
                            String dataDevolucao = scanner.nextLine();

                            biblioteca.registraEmprestimo(usuario, livroEmprestimo, dataEmprestimo, dataDevolucao);
                        } else {
                            System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
                        }
                    } else {
                        System.out.println("Usuário não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 6:
                    System.out.println("Informe a matrícula do usuário: ");
                    matricula = scanner.nextLine();
                    usuario = biblioteca.buscaUsuarioMatricula(matricula);

                    if (usuario != null) {
                        List<RegistroEmprestimo> registro = biblioteca.mostraRegistro(usuario);

                        if (!registro.isEmpty()) {
                            System.out.println("Registro de empréstimo de: " + usuario.getNome());
                            for (RegistroEmprestimo registroEmprestimo : registro) {
                                System.out.println(registroEmprestimo);
                            }
                        } else {
                            System.out.println("Usuário não possui registro de empréstimo");
                        }
                    } else {
                        System.out.println("Usuário não encontrado");
                    }
                    break;

                case 7:
                    System.out.println("Informe a matrícula do usuário: ");
                    String matriculaUsuario = scanner.nextLine();
                    usuario = biblioteca.buscaUsuarioMatricula(matriculaUsuario);

                    if (usuario != null) {
                        System.out.println("Informe o código do livro: ");
                        String codigoLivro = scanner.nextLine();
                        System.out.println("Informe a data de devolução: ");
                        String dataDevolucao = scanner.nextLine();

                        biblioteca.devolveLivro(codigoLivro, dataDevolucao);
                    } else {
                        System.out.println("Usuário não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 9:
                    System.out.println("Informe o nome do usuário");
                    String nome = scanner.nextLine();
                    Usuario usuarioBuscaNome = biblioteca.buscaUsuarioNome(nome);

                    if (usuarioBuscaNome != null) {
                        System.out.println("Usuário encontrado" + usuarioBuscaNome);
                    } else {
                        System.out.println("Usuário não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 10:
                    System.out.println("Informe a matrícula do usuário");
                    matricula = scanner.nextLine();
                    Usuario usuarioBuscaMatricula = biblioteca.buscaUsuarioMatricula(matricula);

                    if (usuarioBuscaMatricula != null) {
                        System.out.println("Usuário encontrado" + usuarioBuscaMatricula);
                    } else {
                        System.out.println("Usuário não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 11:
                    List<Livro> livrosEmprestados = biblioteca.livroEmprestado();

                    if (!livrosEmprestados.isEmpty()) {
                        System.out.println("Livros emprestados: ");
                        for (Livro livroEmprestado : livrosEmprestados) {
                            System.out.println(livroEmprestado);
                        }
                    } else {
                        System.out.println("Não há livros emprestados");
                    }
                    break;

                case 12:
                    System.out.println("Informe o título do livro: ");
                    tituloBusca = scanner.nextLine();
                    livros = biblioteca.buscarLivroTitulo(tituloBusca);
                    if (livros.length > 0) {
                        for (Livro livroBusca : livros) {
                            System.out.println(livroBusca);
                        }
                    } else {
                        System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 13:
                    System.out.println("Informe o título do livro: ");
                    tituloBusca = scanner.nextLine();
                    livros = biblioteca.buscarLivroTitulo(tituloBusca);
                    if (livros.length > 0) {
                        for (Livro livroBusca : livros) {
                            System.out.println(livroBusca);
                        }
                    } else {
                        System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
                    }
                    break;

                case 14:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
            }
        }
    }
}
