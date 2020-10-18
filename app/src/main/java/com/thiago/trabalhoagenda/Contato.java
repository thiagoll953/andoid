package com.thiago.trabalhoagenda;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
                                            //para criar o contato
    }

    public Contato(int id, String nome, String telefone, String email) {
        this.id = id;                       //quando ja possui ID
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;                   //construtor quando n exitir nome no banco
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {                    //metodos get and set
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
