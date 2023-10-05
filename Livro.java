public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private int paginas;

    public Livro(String codigo, String titulo, String autor, String editora, int ano, int paginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.paginas = paginas;
    }

    public String getCodigo() {
        return codigo;
    }

    void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas() {
        return paginas;
    }

    void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro: {" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + ", paginas=" + paginas + '}';
    }
}
