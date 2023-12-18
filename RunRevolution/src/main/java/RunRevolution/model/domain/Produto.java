package RunRevolution.model.domain;

public abstract class Produto {

    private Integer id;
    private String nome;
    private float valor;
    private int quantidade;

    @Override
    public String toString() {

        return String.format("nome (%s) - valor (%.2f) - quantidade (%d)",
                nome, valor, quantidade
        );
    }

    public Produto() {}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
