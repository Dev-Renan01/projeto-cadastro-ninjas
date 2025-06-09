package dev.java10x.CadastroDeNinjas.missoes;

import dev.java10x.CadastroDeNinjas.ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    //OneToMany - uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjas;

    public MissoesModel(){}

    public MissoesModel(Long id, String nome, String dificuldad) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldad;
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
        return dificuldade;
    }

    public void setDificuldad(String dificuldad) {
        this.dificuldade = dificuldad;
    }
}
