package br.com.senai.infob.backend.projeto_mercado.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="supermercado")
public class Supermercado {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="nome")
    private String nome;

    @ManyToMany 
    @JoinTable(
        name="supermercado_alimento",
        joinColumns=@JoinColumn(name="supermercado_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="alimento_id", referencedColumnName="id")
    )
    private List<Alimento> alimentos;

    public Supermercado() {
    }

    public Supermercado(Integer id, String cnpj, String nome, List<Alimento> alimentos) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.alimentos = alimentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

}
