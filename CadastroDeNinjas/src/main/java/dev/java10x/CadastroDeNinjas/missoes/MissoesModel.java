package dev.java10x.CadastroDeNinjas.missoes;

import dev.java10x.CadastroDeNinjas.ninja.NinjaModel;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldad;

    private NinjaModel ninjas;

    public MissoesModel(){}

    public MissoesModel(Long id, String nome, String dificuldad) {
        this.id = id;
        this.nome = nome;
        this.dificuldad = dificuldad;
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

    public String getDificuldad() {
        return dificuldad;
    }

    public void setDificuldad(String dificuldad) {
        this.dificuldad = dificuldad;
    }
}
