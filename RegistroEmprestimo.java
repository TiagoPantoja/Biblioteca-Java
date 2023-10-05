public class RegistroEmprestimo {
    private String codigoLivro;
    private String matriculaUsuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String dataDevolucaoEfetiva;

    public RegistroEmprestimo(String codigoLivro, String matriculaUsuario, String dataEmprestimo, String dataDevolucao, String dataDevolucaoEfetiva) {
        this.codigoLivro = codigoLivro;
        this.matriculaUsuario = matriculaUsuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getMatriculaUsuario() {
        return matriculaUsuario;
    }

    void setMatriculaUsuario(String matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataDevolucaoEfetiva() {
        return dataDevolucaoEfetiva;
    }

    void setDataDevolucaoEfetiva(String dataDevolucaoEfetiva) {
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

    @Override
    public String toString() {
        return "RegistroEmprestimo: {" + "codigoLivro=" + codigoLivro + ", matriculaUsuario=" + matriculaUsuario + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + ", dataDevolucaoEfetiva=" + dataDevolucaoEfetiva + '}';
    }
}
