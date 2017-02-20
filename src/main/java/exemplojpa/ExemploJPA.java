    package exemplojpa;

import br.com.argoninformatica.model.Estadio;
import br.com.argoninformatica.model.Jogador;
import br.com.argoninformatica.model.Time;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Jhonatan
 */
public class ExemploJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador j = new Jogador();
            j.setNomeJogador("Ronaldinho carioca");
        Jogador j1 = new Jogador();
            j1.setNomeJogador("Lulinha da Silva");
        Time c = new Time();
            c.setNome("Bolivar");
            c.setLibertadores(1);
            c.setMundiais(1);
            j.setTime(c);
            j1.setTime(c);
         List<Jogador> jogadores = new ArrayList<>();
            jogadores.add(j);
            jogadores.add(j1);
         c.setJogadores(jogadores);        
        Estadio e = new Estadio();
        e.setNome("Morumbi");
        e.setTime(c);
        c.setEstadio(e);
         ExemploJPA exemplo = new ExemploJPA();
         exemplo.salvar(c);

    }

    public void salvar(Time time) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("futebolPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.merge(time);
        
        em.getTransaction().commit();        
    }
}
