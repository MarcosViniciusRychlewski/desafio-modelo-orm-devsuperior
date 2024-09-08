package com.desafio.modelo_orm.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {
    }

    public Bloco(Integer id, Instant inicio, Instant fim, Atividade atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

    public Integer getId() {
        return id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloco bloco = (Bloco) o;
        return Objects.equals(id, bloco.id) && Objects.equals(inicio, bloco.inicio) && Objects.equals(fim, bloco.fim) && Objects.equals(atividade, bloco.atividade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inicio, fim, atividade);
    }
}
