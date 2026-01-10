package dev.java10x.CadastroDeNinjas.ninja.modelN;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import jakarta.persistence.*;

@Entity
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    //ManyToOne - um Ninja tem uma unica missão
    @ManyToOne
    private MissoesModel missoesModel;

    public NinjaModel(){}

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "NinjaModel{ " +
                "id = " + id +
                ", nome = '" + nome +
                ", email = '" + email +
                ", idade = " + idade +
                ", missoesModel = " + missoesModel +
                " }";
    }
}
