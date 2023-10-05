import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private Livro[] livros;
    private List<Usuario> usuarios;
    private List<RegistroEmprestimo> registros;

    public Biblioteca(int tamanho) {
        livros = new Livro[tamanho];
        usuarios = new ArrayList<>();
        registros = new ArrayList<>();
    }

    public void cadastraLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                System.out.println("Livro cadastrado no Sistema da Biblioteca Universitária");
                return;
            }
        }
    }

    public Livro buscaLivroCodigo(String codigo) {
        for (Livro livro : livros) {
            if (livro != null && livro.getCodigo().equals(codigo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro[] buscarLivroTitulo(String titulo) {
        List<Livro> livroEncontrado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro != null && livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroEncontrado.add(livro);
            }
        }
        return livroEncontrado.toArray(new Livro[0]);
    }

    public void removeLivro(String codigo) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getCodigo().equals(codigo)) {
                livros[i] = null;
                System.out.println("Livro removido do Sistema da Biblioteca Univeristária");
                return;
            }
        }
        System.out.println("Livro não encontrado no Sistema da Biblioteca Universitária");
    }

    public void registraEmprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao) {
        RegistroEmprestimo registro = new RegistroEmprestimo(livro.getCodigo(), usuario.getMatricula(), dataEmprestimo, dataDevolucao, null);
        registros.add(registro);
        usuario.getRegistro().add(registro);
        System.out.println("Empréstimo registrado no Sistema da Biblioteca Universitária");
    }

    public List<RegistroEmprestimo> mostraRegistro(Usuario usuario) {
        return usuario.getRegistro();
    }

    public void devolveLivro(String codigo, String dataDevoluçao) {
        RegistroEmprestimo registroParaRemover = null;
        for (RegistroEmprestimo registro : registros) {
            if (registro.getCodigoLivro().equals(codigo) && registro.getDataDevolucao().equals(dataDevoluçao)) {
                registroParaRemover = registro;
                break;
            }
        }
        if (registroParaRemover != null) {
            registros.remove(registroParaRemover);
            for (Usuario usuario : usuarios) {
                if (usuario.getMatricula().equals(registroParaRemover.getMatriculaUsuario())) {
                    usuario.getRegistro().remove(registroParaRemover);
                    break;
                }
            }
            System.out.println("Devolução registrada no Sistema da Biblioteca Universitária");
        } else {
            System.out.println("Empréstimo não encontrado no Sistema da Biblioteca Universitária");
        }
    }

    public void verificaLivroAtrasado() {
        LocalDate data = LocalDate.now();

        for (RegistroEmprestimo registro : registros) {
            LocalDate dataDevoluçaoPrevista = LocalDate.parse(registro.getDataDevolucao());

            if (data.isAfter(dataDevoluçaoPrevista)) {
                Livro livroAtrasado = buscarLivroTitulo(registro.getCodigoLivro())[0];

                if (livroAtrasado != null) {
                    System.out.println("Livro atrasado: " + livroAtrasado.getTitulo());
                    Usuario usuario = buscaUsuarioMatricula(registro.getMatriculaUsuario());

                    if (usuario != null) {
                        usuario.notificaAtraso(livroAtrasado);
                    }
                }
            }
        }
    }

    public Usuario buscaUsuarioNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscaUsuarioMatricula(String matricula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getMatricula().equals(matricula)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Livro> livroEmprestado() {
        List<Livro> livroEmprestado = new ArrayList<>();
        for (RegistroEmprestimo registro : registros) {
            Livro livro = buscaLivroCodigo(registro.getCodigoLivro());
            if (livro != null) {
                livroEmprestado.add(livro);
            }
        }
        return livroEmprestado;
    }
}


