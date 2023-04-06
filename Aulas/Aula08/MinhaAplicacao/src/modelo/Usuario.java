package modelo;

public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public Long getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
}
