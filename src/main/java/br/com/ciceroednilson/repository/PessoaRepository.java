package br.com.ciceroednilson.repository;

import br.com.ciceroednilson.model.PessoaModel;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PessoaRepository extends Repository<PessoaModel, Integer> {

    void save(PessoaModel pessoa);

    void delete(PessoaModel pessoa);

    List<PessoaModel> findAll();

    PessoaModel findByCodigo(Integer id);

}
