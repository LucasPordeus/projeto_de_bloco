package RunRevolution.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private String status;
    private Usuario usuario;
    private List<Produto> produtos;

    @Override
    public String toString() {

        return String.format("id (%d) - descricao (%s) - data (%s) - solicitante (%s) - produtos(%s)",
                id, descricao, data, usuario, produtos
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
