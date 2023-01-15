package br.com.fiap.smartcities.dao;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;

import br.com.fiap.smartcities.domain.TipoEstabelecimento;


@Remote
public interface TipoEstabelecimentoDAO {

	 	public List<TipoEstabelecimento> listar();

	    public List<TipoEstabelecimento> listarOrdenadoNome();

	    public List<TipoEstabelecimento> listarTresUltimos();

	    public List<TipoEstabelecimento> listarPaginado(int itensPorPagina, int pagina);

	    public int alterarTipoTodos(TipoEstabelecimento novoTipo);

	    public int excluirAntesDe(Calendar data);
}
