package model.bean;

public class Motorista {

    private int idMotorista;
    private String nome;
    private String genero;
    private int RG;
    private int CPF;
    private int celular;
    private String email;
    private String senha;

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

}
