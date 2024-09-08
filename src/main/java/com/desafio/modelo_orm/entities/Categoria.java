package com.desafio.modelo_orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescircao() {
        return descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescircao(String descircao) {
        this.descricao = descircao;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

}
