package br.com.senai.infob.backend.projeto_mercado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="funcionario")
public class Funcionario {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cpf")
    private String cpf;

    @Column(name="salario")
    private Double salario;

    @ManyToOne 
    @JoinColumn(name="supermercado_id")
    private Supermercado supermercado;

    public Funcionario() {
    }

    public Funcionario(Integer id, String cpf, Double salario, Supermercado supermercado) {
        this.id = id;
        this.cpf = cpf;
        this.salario = salario;
        this.supermercado = supermercado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

}
