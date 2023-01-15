package br.com.fiap.smartcities.dao;

import java.util.List;

public interface GenericDAO<T,K> {

    public void cadastrar(T entidade);

    public void atualizar(T entidade);
    
    public void excluir(K codigo) throws Exception;

    public List<T> listar();

    public T buscar(K codigo);


}