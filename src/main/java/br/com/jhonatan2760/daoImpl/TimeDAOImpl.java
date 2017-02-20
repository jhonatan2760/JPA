package br.com.jhonatan2760.daoImpl;

import br.com.jhonatan2760.dao.Conection;
import br.com.jhonatan2760.dao.TimeDAO;
import br.com.jhonatan2760.model.Time;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * @author Jhonatan
 */
public class TimeDAOImpl extends Conection implements TimeDAO {

    @Override
    public void salvar(Time time) {
        EntityManager em = this.retrieveConection();
        em.getTransaction().begin();
        this.retrieveConection().persist(time);
        em.getTransaction().commit();
    }

    @Override
    public List<Time> buscar(Long id) {
        return null;
    }

    @Override
    public void remover(Long id) {
        
    }

    @Override
    public void editar(Time time) {

    }
    
}
