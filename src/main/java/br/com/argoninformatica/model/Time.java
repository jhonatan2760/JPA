package br.com.argoninformatica.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Argon
 */

@Entity
@Table(name = "time")
@SequenceGenerator(allocationSize = 1, name = "time_seq", sequenceName = "time_seq")
public class Time implements Serializable {
    
    private Long id;
    private String nome;
    private int mundiais;
    private int libertadores;
    private List<Jogador> jogadores;
    private Estadio estadio;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "mundiais")
    public int getMundiais() {
        return mundiais;
    }

    public void setMundiais(int mundiais) {
        this.mundiais = mundiais;
    }

    @Column(name = "libertadores")
    public int getLibertadores() {
        return libertadores;
    }

    public void setLibertadores(int libertadores) {
        this.libertadores = libertadores;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "time", fetch = FetchType.LAZY)
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estadio_id")
    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
}
