package Controllers;

import Models.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author luish
 */
public class AutorController {
    EntityManagerFactory emf;
    EntityManager em;
    
    public AutorController() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void salvarAutor(Autor _autor) {
        em.getTransaction().begin();
        em.merge(_autor);
        try {
            em.getTransaction().commit();
            System.out.println("Autor inserido com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
        emf.close();
    }

    public List listarAutor(int id) {
        em.getTransaction().begin();
        String consulta = ("select autor from Autor autor where id_pessoa =" + id);
        Query q = em.createQuery(consulta);
        List resultado = q.getResultList();
        return resultado;
    }
    
    public List consultaTodosAutoresHQL() {
        em.getTransaction().begin();
        String consulta = "FROM Autor";
        Query q = em.createQuery(consulta);
        List resultado = q.getResultList();
        return resultado;
    }
    
    public List consultaAutor25HQL() {
        em.getTransaction().begin();
        String consulta = "FROM Autor WHERE id_pessoa =" + 25;
        Query q = em.createQuery(consulta);
        List resultado = q.getResultList();
        return resultado;
    }
    
}
