package br.com.jhonatan2760.dao;

import br.com.jhonatan2760.model.Time;
import java.util.List;

/**
 * @author Jhonatan
 */
public interface TimeDAO {
    void salvar(Time time);
    List<Time> buscar(Long id);
    void remover (Long id);
    void editar(Time time);
}
