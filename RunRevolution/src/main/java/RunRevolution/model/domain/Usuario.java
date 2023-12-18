package RunRevolution.model.domain;

public class Usuario {
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private String acesso;

    @Override
    public String toString() {

        return String.format("id (%d) - nome (%s) - login (%s) - senha (%s)",
                id, nome, login, senha
        );
    }

    public Usuario(Integer integer) {}

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
}
