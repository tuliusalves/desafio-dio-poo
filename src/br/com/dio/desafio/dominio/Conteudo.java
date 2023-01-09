package br.com.dio.desafio.dominio;

/*Classes abstratas não podem ser instanciadas*/
public abstract class Conteudo {

    /*Variável que será usada nos métodos das "filhas" de Conteudo
        para realizar determinada ação.
     */
    protected static final double XP_PADRAO =10d;
    private String titulo;
    private String descricao;
    /*As filhas de conteúdo serão forçadas a implementar esse método*/
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
