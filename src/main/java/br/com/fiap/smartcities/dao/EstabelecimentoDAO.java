package br.com.fiap.smartcities.dao;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;

import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.domain.TipoEstabelecimento;

@Remote
public interface EstabelecimentoDAO extends GenericDAO<Estabelecimento, Integer>{

    public List<Estabelecimento> listarPorNome(String nome);

    public List<Estabelecimento> listarPorNomeCriacaoApos(String nome, Calendar criacaoApos);

    public List<Estabelecimento> listarPorTipo(TipoEstabelecimento tipo);

    public Estabelecimento listarPorLocalizacao(double latitude, double longitude);
}
