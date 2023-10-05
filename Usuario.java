import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String matricula;
    private String nome;
    private String email;
    private String telefone;
    private List<RegistroEmprestimo> registro;

    public Usuario(String matricula, String nome, String email, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.registro = new ArrayList<RegistroEmprestimo>();
    }

    public String getMatricula() {
        return matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<RegistroEmprestimo> getRegistro() {
        return registro;
    }

    void setRegistro(List<RegistroEmprestimo> registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Usuario: {" + "matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", registro=" + registro + '}';
    }

    public void notificaAtraso(Livro livro) {
        System.out.println("O livro: livro.getTitulo() está atrasado");
    }
}
