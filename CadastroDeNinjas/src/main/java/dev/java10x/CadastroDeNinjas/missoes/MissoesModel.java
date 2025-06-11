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
    private String descricao;
    private StatusMissao status;
    private DificuldadeMissao dificuldadeMissao;

    //OneToMany - uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificuldade,
                        String descricao, StatusMissao status,
                        DificuldadeMissao dificuldadeMissao,
                        List<NinjaModel> ninjas) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.status = status;
        this.dificuldadeMissao = dificuldadeMissao;
        this.ninjas = ninjas;
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

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusMissao getStatus() {
        return status;
    }

    public void setStatus(StatusMissao status) {
        this.status = status;
    }

    public DificuldadeMissao getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(DificuldadeMissao dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
