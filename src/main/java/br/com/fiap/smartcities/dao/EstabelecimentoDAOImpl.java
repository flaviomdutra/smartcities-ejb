package br.com.fiap.smartcities.dao;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;

import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.domain.TipoEstabelecimento;

@Stateless
public class EstabelecimentoDAOImpl extends GenericDAOImpl<Estabelecimento, Integer> implements EstabelecimentoDAO {

    public EstabelecimentoDAOImpl() {
        super();
    }

    public List<Estabelecimento> listarPorNome(String nome) {

        return this.em.createQuery("select e from Estabelecimento e " + "where e.nome :n", Estabelecimento.class)
                .setParameter("n", nome)
                .getResultList();
    }

    public List<Estabelecimento> listarPorNomeCriacaoApos(String nome, Calendar criacaoApos) {
        return this.em
                .createQuery(
                        "select e from Estabelecimento e "
                                + "where e.nome = :nome and "
                                + "where e.dataCriacao > :criacao",
                        Estabelecimento.class)
                .setParameter("nome", nome)
                .setParameter("criacao", criacaoApos).getResultList();
    }

    public List<Estabelecimento> listarPorTipo(TipoEstabelecimento tipo) {
        return this.em.createQuery(
                "select e from Estabelecimento e "
                        + "where e.tipo = :t",
                Estabelecimento.class)
                .setParameter("t", tipo).getResultList();
    }

    public Estabelecimento listarPorLocalizacao(double latitude, double longitude) {
        return (Estabelecimento) this.em
                .createQuery("select e from Estabelecimento e where "
                        + "e.latitude = :latitude and "
                        + "e.longitude = :longitude", Estabelecimento.class)
                .setParameter("latitude", latitude)
                .setParameter("longitude", longitude)
                .getSingleResult();
    }
}
