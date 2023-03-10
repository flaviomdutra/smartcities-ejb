package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_estabelecimento")
public class Estabelecimento {

    @Id
    @SequenceGenerator(name = "estabelecimento", sequenceName = "sq_tbl_estabelecimento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    @Column(name = "id_estabelecimento")
    private Integer id;

    @Column(name = "nome_estabelecimento", length = 50)
    private String nome;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;


    @Column
    private Double latitude;

    @Column
    private Double longitude;

    public Estabelecimento() {
        super();
    }

    public Estabelecimento(Integer id, String nome, Calendar dataCriacao, TipoEstabelecimento tipo,
          Double latitude, Double longitude) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.tipo = tipo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @JoinColumn(name = "id_tipo_estabelecimento")
    @ManyToOne
    private TipoEstabelecimento tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public TipoEstabelecimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstabelecimento tipo) {
        this.tipo = tipo;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}